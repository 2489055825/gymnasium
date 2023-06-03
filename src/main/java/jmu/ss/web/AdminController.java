package jmu.ss.web;

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
@RequestMapping("/adminFunction")
public class AdminController {
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

    @RequestMapping(value = "/allTrainee", method = RequestMethod.GET)
    public String personInformation(Model model){
        Integer adminID = SignAndLoginController.USERSID;
        if(adminID == null){
            return "redirect:/loginPage.jsp";
        }
        List<Trainee> traineeList = traineeService.getAllTrainees();
        model.addAttribute("traineeList", traineeList); //使用重定向后model传不过去
        return "adminPage-home";
    }

    @RequestMapping(value = "/deleteTrainee", method = RequestMethod.GET)
    public String deleteOrders(
            @RequestParam("traineeID") int traineeID,
            Model model){

        Integer adminID = SignAndLoginController.USERSID;
        if(adminID == null){
            return "redirect:/loginPage.jsp";
        }

        Boolean flag = traineeService.deleteById(traineeID);
        if(!flag){
            return "adminPage-deleteTraineeFailure";
        }

        return "redirect:/adminFunction/allTrainee";
    }
}
