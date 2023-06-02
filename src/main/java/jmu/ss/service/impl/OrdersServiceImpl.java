package jmu.ss.service.impl;

import jmu.ss.dao.OrdersDAO;
import jmu.ss.entity.Orders;
import jmu.ss.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersDAO ordersDAO;

    @Override
    public List<Orders> getAllOrders() {
        List<Orders> ordersList = ordersDAO.queryAll();
        return ordersList;
    }

    @Override
    public Orders getOrderByOrdersID(int orderID) {
        Orders orders = ordersDAO.queryByOrderID(orderID);
        return orders;
    }

    @Override
    public boolean insertOrders(Orders orders) {
        Boolean flag = ordersDAO.insert(orders);
        return flag;
    }

    @Override
    public boolean insertOrdersCommentsByOrdersID(Orders orders) {
        Boolean flag = ordersDAO.update(orders);
        return flag;
    }

}
