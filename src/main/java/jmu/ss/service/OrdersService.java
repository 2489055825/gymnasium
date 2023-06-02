package jmu.ss.service;

import jmu.ss.entity.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> getAllOrders();
    public Orders getOrderByOrdersID(int orderID);
    public boolean insertOrders(Orders orders);
    public boolean insertOrdersCommentsByOrdersID(Orders orders);
    public boolean deleteOrders(int ordersID);
}
