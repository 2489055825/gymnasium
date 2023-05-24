package jmu.ss.entity;

public class orders {
    private int orderID;//订单ID
    private int traineeID;//学员ID
    private int coachID;//教练ID
    private int courseID;//课程ID
    private int orderRank;//订单评级
    private String orderDetail;//订单评价内容

    @Override
    public String toString() {
        return "orders{" +
                "orderID=" + orderID +
                ", traineeID=" + traineeID +
                ", coachID=" + coachID +
                ", courseID=" + courseID +
                ", orderRank=" + orderRank +
                ", orderDetail='" + orderDetail + '\'' +
                '}';
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getTraineeID() {
        return traineeID;
    }

    public void setTraineeID(int traineeID) {
        this.traineeID = traineeID;
    }

    public int getCoachID() {
        return coachID;
    }

    public void setCoachID(int coachID) {
        this.coachID = coachID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getOrderRank() {
        return orderRank;
    }

    public void setOrderRank(int orderRank) {
        this.orderRank = orderRank;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }
}
