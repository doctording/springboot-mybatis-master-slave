package com.example.demo.service;


import com.example.demo.repository.model.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {

    List<User> selectAll();

    boolean insertAUser(User user);
}