package jmu.ss.web;

import jmu.ss.entity.Trainee;
import jmu.ss.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/traineeFunction")
public class TraineeController {
    @Autowired
    private TraineeService traineeService;

    @RequestMapping(value = "/personInformation", method = RequestMethod.GET)
    public String personInformation(Model model){
        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }
        Trainee trainee = traineeService.getTraineeByID(traineeID);
        model.addAttribute("trainee", trainee);
        return "traineePage-home";
    }

    @RequestMapping(value = , method = )
    public String updateTrainee(,Model model){

    }


}
