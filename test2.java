package com.test;

import com.test.bean.User;
import com.test.service.UserService;

public class test2 {
    public static void main(String[] args) {
        User user=new User();
        user.setUserName("叽里呱啦");
        user.setCity("北京天安门");

        UserService.insert(user);
//        UserService.count("158");
//        User user = new User();
//        user.setUserName("姓名");
//        user.setDescription("哈哈哈");
//        UserService.updateUserByFaceId("158",user);
    }
}
