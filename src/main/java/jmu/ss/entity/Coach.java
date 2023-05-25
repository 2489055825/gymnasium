package jmu.ss.entity;

public class Coach {
    private int coachID; //教练ID
    private String name;//姓名
    private String sex;//性别

    @Override
    public String toString() {
        return "coach{" +
                "coachID=" + coachID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", personIntroduction='" + personIntroduction + '\'' +
                '}';
    }

    public int getCoachID() {
        return coachID;
    }

    public void setCoachID(int coachID) {
        this.coachID = coachID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonIntroduction() {
        return personIntroduction;
    }

    public void setPersonIntroduction(String personIntroduction) {
        this.personIntroduction = personIntroduction;
    }

    private int age;//年龄
    private String personIntroduction;//个人介绍

}
