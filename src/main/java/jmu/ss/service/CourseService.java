package jmu.ss.service;

import jmu.ss.entity.Coach;
import jmu.ss.entity.Course;
import jmu.ss.entity.Diary;

import java.util.List;

public interface CourseService {
    /**
     * 查找所有课程
     *
     * @return 课程列表
     */
    public List<Course> getAllCourse();
    /**
     * 根据日记ID查找日记
     *
     * @return 课程列表
     */
    public Course getCourseByCourseID(int CourseID);
    /**
     * 查找日记中diary的courseID对应的Course列表
     *
     * @return 课程列表
     */
    public List<Course> getCourseByDiaryList(List<Diary> diaryList);

    public List<Course> getCourseByCoachID(int coachID);

    public boolean insertCourse(Course course);

    public boolean deleteCourse(int courseID);


}
