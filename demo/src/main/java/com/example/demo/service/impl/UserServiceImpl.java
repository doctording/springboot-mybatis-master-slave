package com.example.demo.service.impl;

import com.example.demo.repository.mapper.UserMapper;
import com.example.demo.repository.model.User;
import com.example.demo.repository.model.UserExample;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public boolean insertAUser(User user) {
        int cnt = userMapper.insert(user);
        return cnt > 0 ? true : false;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectByExample(new UserExample());
    }
}
