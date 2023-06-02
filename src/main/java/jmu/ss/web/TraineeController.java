package jmu.ss.web;

import jmu.ss.dao.TraineeDAO;
import jmu.ss.entity.Trainee;
import jmu.ss.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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


}
