package com.kiwi.demo.service;

import com.kiwi.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 文件描述
 *
 * @Description: note
 * @Author: weiping49053
 * @CreateDate: 2024/5/16 11:18
 * @Version: 1.0
 **/
@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    {
        User user1 = new User();
        user1.setUserId(1);
        user1.setUserName("user1");
        user1.setUserAge(20);
        users.add(user1);

        User user2 = new User();
        user2.setUserId(2);
        user2.setUserName("user2");
        user2.setUserAge(22);
        users.add(user2);

        User user3 = new User();
        user3.setUserId(3);
        user3.setUserName("user3");
        user3.setUserAge(23);
        users.add(user3);
    }

    public List<User> getAllUsers(){
        return users;
    }
}
