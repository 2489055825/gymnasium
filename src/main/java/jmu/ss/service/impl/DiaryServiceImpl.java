package jmu.ss.service.impl;

import jmu.ss.dao.CourseDAO;
import jmu.ss.dao.DiaryDAO;
import jmu.ss.dao.TraineeDAO;
import jmu.ss.entity.Course;
import jmu.ss.entity.Diary;
import jmu.ss.entity.Trainee;
import jmu.ss.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiaryServiceImpl implements DiaryService {
    @Autowired
    private DiaryDAO diaryDAO;
    @Autowired
    private TraineeDAO traineeDAO;
    @Autowired
    private CourseDAO courseDAO;

    @Override
    public boolean insertDiary(Diary diary) {
        boolean flag = diaryDAO.insert(diary);
        return flag;
    }

    @Override
    public boolean deleteDiary(int diaryID) {
        boolean flag = diaryDAO.delete(diaryID);
        return flag;
    }

    @Override
    public List<Diary> getDiaryByCoachID(int coachID) {
        List<Course> courseList = courseDAO.queryByCoachID(coachID);
        List<Diary> mergedDiaryList = new ArrayList<>();
        for(int i = 0; i < courseList.size(); i++){
            Course course = courseList.get(i);
            List<Diary> diaryList = diaryDAO.queryByCourseID(course.getCourseID());
            for(int j = 0; j < diaryList.size(); j++){
                mergedDiaryList.add(diaryList.get(j));
            }
        }

        return mergedDiaryList;
    }

    @Override
    public List<Diary> getAllDiary() {
        List<Diary> diaryList = diaryDAO.queryAllByNone();
        return diaryList;
    }


}
