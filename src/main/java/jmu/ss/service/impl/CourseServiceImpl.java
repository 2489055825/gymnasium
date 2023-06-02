package jmu.ss.service.impl;

import jmu.ss.dao.CoachDAO;
import jmu.ss.dao.CourseDAO;
import jmu.ss.entity.Coach;
import jmu.ss.entity.Course;
import jmu.ss.entity.Diary;
import jmu.ss.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDAO courseDAO;


    @Override
    public List<Course> getAllCourse() {
        List<Course> courseList = courseDAO.queryAll();
        return courseList;
    }

    @Override
    public Course getCourseByCourseID(int CourseID) {
        Course course = courseDAO.queryByCourseID(CourseID);
        return course;
    }

    @Override
    public List<Course> getCourseByDiaryList(List<Diary> diaryList) {
        List<Course> courseList = new ArrayList<Course>();

        for(Diary diary:diaryList){
            Course course = this.getCourseByCourseID(diary.getCourseID());
            courseList.add(course);
        }
        return courseList;
    }
}
