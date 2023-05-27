package jmu.ss.dao;

import jmu.ss.entity.Coach;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CoachDAO {
    @Select("select * from coach where coachID=#{coachID}")
    public Coach queryByCoachID(int coachID);

    @Update("update coach\n" +
            "set name=#{name},sex=#{sex},age=#{age},personIntroduction=#{personIntroduction}\n" +
            "where coachID=#{coach}")
    public boolean update(Coach coach);

    @Insert("INSERT INTO coach(coachID, name, sex, age, personIntroduction)\n" +
            "VALUES (#{coachID}, #{name}, #{sex}, #{age}, #{personIntroduction})")
    public boolean insert(Coach coach);

    @Select("select * from coach")
    public List<Coach> queryAll();

    @Delete("DELETE\n" +
            "FROM coach\n" +
            "WHERE coachID = #{coachID}")
    public boolean delete(int coachID);
}
