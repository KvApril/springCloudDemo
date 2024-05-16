package com.kiwi.demo.service;

import com.kiwi.demo.entity.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 文件描述
 *
 * @Description: note
 * @Author: weiping49053
 * @CreateDate: 2024/5/16 11:13
 * @Version: 1.0
 **/
@Service
public class OrderService {

    private List<Order> orders = new ArrayList<>();

    {
        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setOrderName("order1");
        order1.setOrderTime(new Date());
        order1.setUserId(1);
        orders.add(order1);

        Order order2 = new Order();
        order2.setOrderId(2);
        order2.setOrderName("order2");
        order2.setOrderTime(new Date());
        order2.setUserId(1);
        orders.add(order2);

        Order order3 = new Order();
        order3.setOrderId(3);
        order3.setOrderName("order3");
        order3.setOrderTime(new Date());
        order3.setUserId(2);
        orders.add(order3);
    }

    public List<Order> getAllOrders(){
        return orders;
    }
}
