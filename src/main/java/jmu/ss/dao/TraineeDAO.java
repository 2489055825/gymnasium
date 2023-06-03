package jmu.ss.dao;

import jmu.ss.entity.Trainee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TraineeDAO {
    //根据ID从数据库中查找个人信息
    @Select("select * from trainee where traineeID=#{traineeID}")
    public Trainee queryByTraineeID(int traineeID);

    @Select("select * from trainee")
    public List<Trainee> queryAll();

    //在数据库中修改个人信息(SET)
    @Update("update trainee\n" +
            "set name=#{name},sex=#{sex},age=#{age},weight=#{weight}," +
            "height=#{height},BMI=#{BMI},purpose=#{purpose},personIntroduction=#{personIntroduction}\n" +
            "where traineeID=#{traineeID}")
    public boolean update(Trainee trainee);


    //插入一条学员信息
    @Insert("INSERT INTO trainee(traineeID, name, sex, age, weight, height, BMI, purpose, personIntroduction)\n" +
            "VALUES (#{traineeID}, #{name}, #{sex}, #{age}, #{weight}, #{height}, #{BMI}, #{purpose}, #{personIntroduction})")
    public boolean insert(Trainee trainee);

    @Delete("DELETE\n" +
            "FROM trainee\n" +
            "WHERE traineeID = #{traineeID}")
    public boolean delete(int traineeID);
}
