package com.kiwi.demo.entity;

/**
 * 文件描述
 *
 * @Description: note
 * @Author: weiping49053
 * @CreateDate: 2024/5/16 11:05
 * @Version: 1.0
 **/
//@Lombok
public class User {
    private Integer UserId;
    private String UserName;
    private Integer UserAge;

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getUserAge() {
        return UserAge;
    }

    public void setUserAge(Integer userAge) {
        UserAge = userAge;
    }
}
