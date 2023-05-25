package jmu.ss.entity;

public class Trainee {
    private int traineeID; //学员ID
    private String name; //名字
    private String sex; //性别
    private int age; //年龄
    private double weight; //体重
    private double height; //身高
    private double BMI; //BMI
    private String purpose; //健身目的

    @Override
    public String toString() {
        return "trainee{" +
                "traineeID=" + traineeID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", BMI=" + BMI +
                ", purpose='" + purpose + '\'' +
                ", personIntroduction='" + personIntroduction + '\'' +
                '}';
    }

    public int getTraineeID() {
        return traineeID;
    }

    public void setTraineeID(int traineeID) {
        this.traineeID = traineeID;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPersonIntroduction() {
        return personIntroduction;
    }

    public void setPersonIntroduction(String personIntroduction) {
        this.personIntroduction = personIntroduction;
    }

    private String personIntroduction; //个人简介
}
