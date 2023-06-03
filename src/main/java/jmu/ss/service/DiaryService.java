package jmu.ss.service;

import jmu.ss.entity.Course;
import jmu.ss.entity.Diary;

import java.util.List;

public interface DiaryService {
    /**
     * 插入一个日记
     * @param diary 日记对象
     * @return 返回flag记录是否成功插入
     */
    public boolean insertDiary(Diary diary);

    /**
     * 删除一个日记
     * @param diaryID 日记ID
     * @return 返回flag记录是否成功插入
     */
    public boolean deleteDiary(int diaryID);

    public List<Diary> getDiaryByCoachID(int coachID);
    public List<Diary> getAllDiary();
}


