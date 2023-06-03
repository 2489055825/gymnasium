package jmu.ss.web;

import jmu.ss.entity.*;
import jmu.ss.service.*;
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
    @Autowired
    private OrdersService ordersService;

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


    @RequestMapping(value = "/myComments", method = RequestMethod.GET)
    public String myComments(Model model){

        //@RequestParam("coach") int coachID,
        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }

        List<Orders> ordersList = ordersService.getAllOrders();
        model.addAttribute("ordersList", ordersList);

        return "traineePage-comments";
    }

    @RequestMapping(value = "/insertComments", method = RequestMethod.POST)
    public String insertComments(
            @RequestParam("orderID") int orderID,
            @RequestParam("orderRank") int orderRank,
            @RequestParam("orderDetail") String orderDetail,
            Model model){

        //@RequestParam("coach") int coachID,
        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }

        Orders orders = ordersService.getOrderByOrdersID(orderID);
        orders.setOrderRank(orderRank);
        orders.setOrderDetail(orderDetail);

        Boolean flag = ordersService.insertOrdersCommentsByOrdersID(orders);
        if(!flag){
            return "traineePage-insertOrdersCommentsFailure";
        }

        return "redirect:/traineeFunction/myComments";
    }

    @RequestMapping(value = "/courseBooking", method = RequestMethod.GET)
    public String courseBooking(Model model){

        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }

        List<Course> courseList = courseService.getAllCourse();
        model.addAttribute("courseList", courseList);

        return "traineePage-courseBooking";
    }

    @RequestMapping(value = "/insertOrders", method = RequestMethod.GET)
    public String insertOrders(
            @RequestParam("courseID") int courseID,
            Model model){

        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }

        Course course = courseService.getCourseByCourseID(courseID);
        Orders orders = new Orders();
        orders.setTraineeID(SignAndLoginController.USERSID);
        orders.setCoachID(course.getCoachID());
        orders.setCourseID(courseID);


        Boolean flag = ordersService.insertOrders(orders);
        if(!flag){
            return "traineePage-insertOrdersCommentsFailure";
        }

        return "redirect:/traineeFunction/courseBooking";
    }

    @RequestMapping(value = "/myOrders", method = RequestMethod.GET)
    public String myOrders(Model model){

        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }

        List<Orders> ordersList = ordersService.getAllOrders();
        model.addAttribute("ordersList", ordersList);

        return "traineePage-myOrders";
    }

    @RequestMapping(value = "/deleteOrders", method = RequestMethod.GET)
    public String deleteOrders(
            @RequestParam("ordersID") int ordersID,
            Model model){

        Integer traineeID = SignAndLoginController.USERSID;
        if(traineeID == null){
            return "redirect:/loginPage.jsp";
        }

        Boolean flag = ordersService.deleteOrders(ordersID);
        if(!flag){
            return "traineePage-deleteOrdersFailure";
        }

        return "redirect:/traineeFunction/myOrders";
    }
}
