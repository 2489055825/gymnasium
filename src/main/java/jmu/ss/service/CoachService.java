package jmu.ss.service;

import jmu.ss.entity.Coach;
import jmu.ss.entity.Diary;

import java.util.List;

public interface CoachService {
    /**
     * 查找所有教练
     *
     * @return 教练列表
     */
    public List<Coach> getAllCoach();

    public Coach getCoachByCoachID(int coachID);

    public boolean updateCoach(Coach coach);
    public boolean deleteByCoachID(int coachID);
}
