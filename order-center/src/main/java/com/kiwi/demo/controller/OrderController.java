package com.kiwi.demo.controller;

import com.kiwi.demo.entity.Order;
import com.kiwi.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文件描述
 *
 * @Description: note
 * @Author: weiping49053
 * @CreateDate: 2024/5/16 10:53
 * @Version: 1.0
 **/
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/all")
    List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}
