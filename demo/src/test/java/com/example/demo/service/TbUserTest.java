package com.example.demo.service;

import com.example.demo.repository.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TbUserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testRead() {
        Long startTime = System.currentTimeMillis();    //获取开始时间
        List<User> userList = userService.selectAll();
        long endTime = System.currentTimeMillis();    //获取结束时间
        int cnt = userList.size();
        System.out.println("==============");
        for(int i=0;i<cnt;i++) {
            System.out.println(userList.get(i));
        }
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        System.out.println("==============");
    }

    @Test
    public void testWrite() {
        User user = new User();
        user.setUsername("test");
        user.setEmail("test@test.com");
        user.setPassword("test");
        user.setStatus(false);
        Long startTime = System.currentTimeMillis();    //获取开始时间
        Boolean b = userService.insertAUser(user);
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("==============");
        System.out.println(b);
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        System.out.println("==============");
    }
}
