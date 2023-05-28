package jmu.ss.service;

import jmu.ss.entity.Trainee;

public interface TraineeService {

    /**
     * 根据学员ID查询学员信息
     *
     * @param traineeID 学员ID
     * @return 学员信息
     */
    Trainee getTraineeByID(int traineeID);

    /**
     * 修改学员信息
     *
     * @param trainee 学员信息
     * @return 更新结果
     */
    boolean updateTrainee(Trainee trainee);


}
