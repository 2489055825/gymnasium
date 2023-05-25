package jmu.ss.entity;

public class Diary {
    private int diaryID; //日记ID
    private int courseID;//课程ID
    private int traineeID;//学员ID
    private String diaryDate;//日记日期
    private String diaryDetail;//日记内容

    @Override
    public String toString() {
        return "diary{" +
                "diaryID=" + diaryID +
                ", courseID=" + courseID +
                ", traineeID=" + traineeID +
                ", diaryDate='" + diaryDate + '\'' +
                ", diaryDetail='" + diaryDetail + '\'' +
                '}';
    }

    public int getDiaryID() {
        return diaryID;
    }

    public void setDiaryID(int diaryID) {
        this.diaryID = diaryID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getTraineeID() {
        return traineeID;
    }

    public void setTraineeID(int traineeID) {
        this.traineeID = traineeID;
    }

    public String getDiaryDate() {
        return diaryDate;
    }

    public void setDiaryDate(String diaryDate) {
        this.diaryDate = diaryDate;
    }

    public String getDiaryDetail() {
        return diaryDetail;
    }

    public void setDiaryDetail(String diaryDetail) {
        this.diaryDetail = diaryDetail;
    }
}
