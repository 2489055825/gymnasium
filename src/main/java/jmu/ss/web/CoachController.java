package jmu.ss.web;

import jmu.ss.entity.Coach;
import jmu.ss.entity.Course;
import jmu.ss.entity.Diary;
import jmu.ss.entity.Trainee;
import jmu.ss.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/coachFunction")
public class CoachController {
    @Autowired
    private TraineeService traineeService;
    @Autowired
    private CoachService coachService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private DiaryService diaryService;
    @Autowired
    private OrdersService ordersService;

    @RequestMapping(value = "/personInformation", method = RequestMethod.GET)
    public String personInformation(Model model){
        Integer coachID = SignAndLoginController.USERSID;
        if(coachID == 0){
            return "redirect:/loginPage.jsp";
        }
        Coach coach = coachService.getCoachByCoachID(coachID);
        model.addAttribute("coach", coach); //使用重定向后model传不过去
        return "coachPage-home";
    }

    @RequestMapping(value = "/updateCoach", method = RequestMethod.POST)
    public String updateTrainee(
            @RequestParam("name") String name,
            @RequestParam("sex") String sex,
            @RequestParam("age") int age,
            @RequestParam("personIntroduction") String personIntroduction,
            Model model){

        //组装教练对象
        Coach coach = new Coach();
        coach.setCoachID(SignAndLoginController.USERSID);
        coach.setName(name);
        coach.setSex(sex);
        coach.setAge(age);
        coach.setPersonIntroduction(personIntroduction);

        boolean flag = coachService.updateCoach(coach);
        if(!flag){
            return "coachPage-updateInformationFailure"; //转到失败页面
        }
        return "redirect:/coachFunction/personInformation"; //转到个人信息页面(重新查询)
    }

    @RequestMapping(value = "/myCourse", method = RequestMethod.GET)
    public String myCourse(Model model){
        Integer coachID = SignAndLoginController.USERSID;
        if(coachID == 0){
            return "redirect:/loginPage.jsp";
        }
        List<Course> courseList = courseService.getCourseByCoachID(coachID);
        model.addAttribute("courseList", courseList); //使用重定向后model传不过去
        return "coachPage-course";
    }

    @RequestMapping(value = "/insertCourse", method = RequestMethod.POST)
    public String insertCourse(
            @RequestParam("courseName") String courseName,
            @RequestParam("courseHour") int courseHour,
            @RequestParam("purpose") String purpose,
            @RequestParam("courseIntroduction") String courseIntroduction,
            Model model){

        //组装课程对象
        Course course = new Course();
        course.setCoachID(SignAndLoginController.USERSID);
        course.setCourseName(courseName);
        course.setCourseHour(courseHour);
        course.setPurpose(purpose);
        course.setCourseIntroduction(courseIntroduction);

        boolean flag = courseService.insertCourse(course);
        if(!flag){
            return "coachPage-insertCourseFailure"; //转到失败页面
        }
        return "redirect:/coachFunction/myCourse"; //转到个人信息页面(重新查询)
    }


    @RequestMapping(value = "/myTraineeDiary", method = RequestMethod.GET)
    public String myTraineeDiary(Model model){
        Integer coachID = SignAndLoginController.USERSID;
        if(coachID == 0){
            return "redirect:/loginPage.jsp";
        }
        List<Diary> diaryList = diaryService.getDiaryByCoachID(coachID);
        model.addAttribute("diaryList", diaryList);
        return "coachPage-myTraineeDiary";
    }

    @RequestMapping(value = "/deleteCourse", method = RequestMethod.GET)
    public String deleteCourse(
            @RequestParam("courseID") int courseID,
            Model model){

        Integer coachID = SignAndLoginController.USERSID;
        if(coachID == 0){
            return "redirect:/loginPage.jsp";
        }

        Boolean flag = courseService.deleteCourse(courseID);
        if(!flag){
            return "coachPage-deleteCourseFailure";
        }

        return "redirect:/coachFunction/myCourse";
    }
}
