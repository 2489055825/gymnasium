package jmu.ss.service.impl;

import jmu.ss.dao.DiaryDAO;
import jmu.ss.dao.TraineeDAO;
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
}
