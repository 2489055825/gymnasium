package jmu.ss.service.impl;

import jmu.ss.dao.CoachDAO;
import jmu.ss.entity.Coach;
import jmu.ss.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachServiceImpl implements CoachService {
    @Autowired
    private CoachDAO coachDAO;

    @Override
    public List<Coach> getAllCoach() {
        List<Coach> coachList = coachDAO.queryAll();
        return coachList;
    }

    @Override
    public Coach getCoachByCoachID(int coachID) {
        Coach coach = coachDAO.queryByCoachID(coachID);
        return coach;
    }

    @Override
    public boolean updateCoach(Coach coach) {
        boolean flag = coachDAO.update(coach);
        return flag;
    }

    @Override
    public boolean deleteByCoachID(int coachID) {
        boolean flag = coachDAO.delete(coachID);
        return flag;
    }
}
