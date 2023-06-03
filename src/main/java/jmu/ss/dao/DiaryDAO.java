package jmu.ss.dao;

import jmu.ss.entity.Diary;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DiaryDAO {
    //根据学员ID查询到所有他的健身日记, 按照升序进行排列
    @Select("select * from diary where traineeID=#{traineeID} order by diaryDate asc")
    public List<Diary> queryAll(int traineeID);

    @Select("select * from diary where courseID=#{courseID} order by diaryDate asc")
    public List<Diary> queryByCourseID(int courseID);

    //添加新的健身日记
    @Insert("INSERT INTO diary(courseID, traineeID, diaryDate, diaryDetail)\n" +
            "VALUES (#{courseID}, #{traineeID}, #{diaryDate}, #{diaryDetail})")
    public boolean insert(Diary diary);

    // 从数据库中删除健身日记
    @Delete("DELETE\n" +
            "FROM diary\n" +
            "WHERE diaryID = #{diaryID}")
    public boolean delete(int diaryID);
}
