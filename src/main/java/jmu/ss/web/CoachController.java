package jmu.ss.web;

import jmu.ss.entity.Coach;
import jmu.ss.entity.Trainee;
import jmu.ss.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
        if(coachID == null){
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


}
