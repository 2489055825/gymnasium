package jmu.ss.service.impl;

import jmu.ss.dao.DiaryDAO;
import jmu.ss.dao.TraineeDAO;
import jmu.ss.dao.UsersDAO;
import jmu.ss.entity.Diary;
import jmu.ss.entity.Trainee;
import jmu.ss.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService {
    @Autowired
    private TraineeDAO traineeDAO;
    @Autowired
    private DiaryDAO diaryDAO;
    @Autowired
    private UsersDAO usersDAO;


    @Override
    public Trainee getTraineeByID(int traineeID) {
        Trainee trainee = traineeDAO.queryByTraineeID(traineeID);
        return trainee;
    }

    @Override
    public boolean updateTrainee(Trainee trainee) {
        boolean flag = traineeDAO.update(trainee);
        return flag;
    }

    @Override
    public List<Diary> getDiaryByTraineeID(int traineeID){
        List<Diary> diaryList = diaryDAO.queryAll(traineeID);
        return diaryList;
    }

    @Override
    public List<Trainee> getAllTrainees() {
        List<Trainee> traineeList = traineeDAO.queryAll();
        return traineeList;
    }

    @Override
    public boolean deleteById(int traineeID) {
        boolean flag = usersDAO.delete(traineeID);
        return flag;
    }


}
