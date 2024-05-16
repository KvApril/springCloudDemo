package com.kiwi.demo.controller;

import com.kiwi.demo.entity.User;
import com.kiwi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 文件描述
 *
 * @Description: note
 * @Author: weiping49053
 * @CreateDate: 2024/5/16 10:59
 * @Version: 1.0
 **/

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
