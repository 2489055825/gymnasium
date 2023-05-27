package jmu.ss.dao;

import jmu.ss.entity.Trainee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TraineeDAO {
    //根据ID从数据库中查找个人信息
    @Select("select * from trainee where traineeID=#{traineeID}")
    public Trainee queryByTraineeID(int traineeID);

    //在数据库中修改个人信息(SET)
    @Update("update trainee\n" +
            "set traineeID=#{traineeID}, name=#{name},sex=#{sex},age=#{age},weight=#{weight}," +
            "height=#{height},BMI=#{BMI},purpose=#{purpose},personIntroduction=#{personIntroduction}\n" +
            "where traineeID=#{traineeID}")
    public boolean update(Trainee trainee);


    //插入一条学员信息
    @Insert("INSERT INTO trainee(traineeID, name, sex, age, weight, height, BMI, purpose, personIntroduction)\n" +
            "VALUES (#{traineeID}, #{name}, #{sex}, #{age}, #{weight}, #{height}, #{BMI}, #{purpose}, #{personIntroduction})")
    public boolean insert(Trainee trainee);
}
