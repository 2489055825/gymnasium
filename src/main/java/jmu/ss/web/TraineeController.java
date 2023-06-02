package jmu.ss.web;

import jmu.ss.entity.Course;
import jmu.ss.entity.Diary;
import jmu.ss.entity.Trainee;
import jmu.ss.service.CoachService;
import jmu.ss.service.CourseService;
import jmu.ss.service.DiaryService;
import jmu.ss.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/traineeFunction")
public class TraineeController {
    @Autowired
    private TraineeService traineeService;
    @Autowired
    private CoachService coachService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private DiaryService diaryService;

    @RequestMapping(value = "/personInformation", method = RequestMethod.GET)
    public String personInformation(Model model){
        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }
        Trainee trainee = traineeService.getTraineeByID(traineeID);
        model.addAttribute("trainee", trainee); //使用重定向后model传不过去
        return "traineePage-home";
    }

    @RequestMapping(value = "/updateTrainee", method = RequestMethod.POST)
    public String updateTrainee(
            @RequestParam("name") String name,
            @RequestParam("sex") String sex,
            @RequestParam("age") int age,
            @RequestParam("weight") double weight,
            @RequestParam("height") double height,
            @RequestParam("purpose") String purpose,
            @RequestParam("personIntroduction") String personIntroduction,
            Model model){
            double BMI = weight / (height * height); //计算BMI

            //组装学员对象
            Trainee trainee = new Trainee();
            trainee.setTraineeID(SignAndLoginController.USERSID);
            trainee.setName(name);
            trainee.setSex(sex);
            trainee.setAge(age);
            trainee.setWeight(weight);
            trainee.setHeight(height);
            trainee.setBMI(BMI);
            trainee.setPurpose(purpose);
            trainee.setPersonIntroduction(personIntroduction);

            boolean flag = traineeService.updateTrainee(trainee);
            if(!flag){
                return "traineePage-updateInformationFailure"; //转到失败页面
            }
            return "redirect:/traineeFunction/personInformation"; //转到个人信息页面(重新查询)
    }

    @RequestMapping(value = "/myDiary", method = RequestMethod.GET)
    public String myDiary(Model model){
        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }
        List<Diary> diaryList = traineeService.getDiaryByTraineeID(traineeID);
        List<Course> courseList = courseService.getCourseByDiaryList(diaryList);
        model.addAttribute("diaryList", diaryList);
        model.addAttribute("courseList", courseList);
        return "traineePage-myDiary";
    }

    @RequestMapping(value = "/insertDiaryPage", method = RequestMethod.GET)
    public String insertDiaryPage(Model model){
        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }
        //List<Coach> coachList = coachService.getAllCoach();
        List<Course> courseList = courseService.getAllCourse();
        //model.addAttribute("coachList",coachList);
        model.addAttribute("courseList",courseList);
        return "traineePage-insertDiary";
    }

    @RequestMapping(value = "/insertDiary", method = RequestMethod.POST)
    public String insertDiary(
            @RequestParam("selectedCourse") int courseID,
            @RequestParam("diaryDetail") String diaryDetail,
            Model model){

        //@RequestParam("coach") int coachID,
        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }

        //这一段是为了获得精确到秒的时间
        Date writeDate = new Date(System.currentTimeMillis());
        // 创建SimpleDateFormat对象，设置日期格式为SQL中的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 将Date对象转换为字符串
        String dateString = sdf.format(writeDate);

        Diary diary = new Diary();
        diary.setCourseID(courseID);
        diary.setTraineeID(SignAndLoginController.USERSID);
        diary.setDiaryDate(dateString);
        diary.setDiaryDetail(diaryDetail);

        boolean flag = diaryService.insertDiary(diary);
        if(!flag){
            return "traineePage-insertDiaryFailure";
        }

        return "redirect:/traineeFunction/myDiary";
    }


    @RequestMapping(value = "/deleteDiary", method = RequestMethod.GET)
    public String deleteDiary(
            @RequestParam("diaryID") int courseID,
            Model model){

        //@RequestParam("coach") int coachID,
        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }

        boolean flag = diaryService.deleteDiary(courseID);
        if(!flag){
            return "traineePage-insertDiaryFailure";
        }

        return "redirect:/traineeFunction/myDiary";
    }

}
