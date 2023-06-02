package jmu.ss.service.impl;

import jmu.ss.dao.DiaryDAO;
import jmu.ss.entity.Diary;
import jmu.ss.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceImpl implements DiaryService {
    @Autowired
    private DiaryDAO diaryDAO;

    @Override
    public boolean insertDiary(Diary diary) {
        boolean flag = diaryDAO.insert(diary);
        return flag;
    }
}
