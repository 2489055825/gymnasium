package jmu.ss.dao;

import jmu.ss.entity.Course;
import jmu.ss.entity.Trainee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseDAO {
    //查询所有课程信息
    @Select("select * from course")
    public List<Course> queryAll();

    //根据健身目的,查询所有关于满足该健身目的的课程信息
    @Select("select * from course where purpose like concat('%',#{purpose},'%') ")
    public List<Course> searchCourseByPurpose(String purpose);

    // 根据课程ID查询单个课程信息
    @Select("select * from course where courseID=#{courseID}")
    public Course queryByCourseID(int courseID);


    //根据搜索内容进行模糊匹配,得到搜索内容
    @Select("select * from course where courseIntroduction like concat('%',#{key},'%')")
    public List<Course> searchCourseByKey(String key);


    // 根据教练ID查询属于该教练的课程信息
    @Select("select * from course where coachID=#{coachID}")
    public List<Course> queryByCoachID(int coachID);

    // 新增一条健身课程
    @Insert("INSERT INTO course(courseName, coachID, courseHour, purpose, courseIntroduction)\n" +
            "VALUES (#{courseName}, #{coachID}, #{courseHour}, #{purpose}, #{courseIntroduction})")
    public boolean insert(Course course);


    // 根据课程ID查询所有的学员,返回列表(连接)
    @Select("select * from trainee " +
            "where trainee.traineeID in (select orders.traineeID from orders where orders.courseID=#{courseID})\n")
    public List<Trainee> queryTraineeByCourseID(int courseID);

}
