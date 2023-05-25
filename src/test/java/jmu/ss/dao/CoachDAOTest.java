package jmu.ss.dao;

import com.fasterxml.jackson.databind.ser.Serializers;
import jmu.ss.BaseTest;
import jmu.ss.entity.Coach;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
public class CoachDAOTest extends BaseTest {

    @Autowired
    private CoachDAO coachDAO;
    @Test
    public void queryByCoachID() throws Exception {
        int id = 1;
        Coach coach = coachDAO.queryByCoachID(id);
        System.out.println(coach.toString());
    }
}