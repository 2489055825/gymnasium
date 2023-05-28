package jmu.ss.service.impl;

import jmu.ss.dao.TraineeDAO;
import jmu.ss.entity.Trainee;
import jmu.ss.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements TraineeService {
    @Autowired
    private TraineeDAO traineeDAO;


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
}
