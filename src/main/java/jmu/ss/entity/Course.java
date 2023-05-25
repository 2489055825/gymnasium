package jmu.ss.entity;

public class Course {
    private int courseID; //课程ID
    private String courseName; //课程名称
    private int coachID; //教练ID
    private int courseHour; //课时
    private String purpose; //健身目的
    private String courseIntroduction; //课程介绍

    @Override
    public String toString() {
        return "course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", coachID=" + coachID +
                ", courseHour=" + courseHour +
                ", purpose='" + purpose + '\'' +
                ", courseIntroduction='" + courseIntroduction + '\'' +
                '}';
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCoachID() {
        return coachID;
    }

    public void setCoachID(int coachID) {
        this.coachID = coachID;
    }

    public int getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(int courseHour) {
        this.courseHour = courseHour;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }
}
