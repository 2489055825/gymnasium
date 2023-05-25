package jmu.ss.dao;

import jmu.ss.entity.Coach;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CoachDAO {
    @Select("select * from coach where coachID=#{id}")
    public Coach queryByCoachID(int id);

    public boolean updateByCoachID(int id);

    public boolean insert(Coach coach);

    public List<Coach> queryAll();

    public boolean delete(int id);
}
