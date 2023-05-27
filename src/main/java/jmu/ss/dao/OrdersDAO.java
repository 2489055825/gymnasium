package jmu.ss.dao;

import jmu.ss.entity.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OrdersDAO {
    //插入一条传过来的订单记录
    @Insert("INSERT INTO orders(traineeID, coachID, courseID, orderRank, orderDetail)\n" +
            "VALUES (#{traineeID}, #{coachID}, #{courseID}, #{orderRank}, #{orderDetail})")
    public boolean insert(Orders orders);

    // 根据订单ID在数据库中产出相应的订单信息
    @Select("select * from orders where orderID=#{orderD}")
    public Orders queryByOrderID(int orderID);

    // 查询所有订单信息
    @Select("select * from orders")
    public List<Orders> queryAll();

    //进行原有订单信息的点评的添加修改删除(使用SET)
    @Update("update orders\n" +
            "set traineeID=#{traineeID},coachID=#{coachID},courseID=#{courseID},orderRank=#{orderRank},orderDetail=#{orderDetail}\n" +
            "where orderID=#{orderID}")
    public boolean update(Orders orders);
}
