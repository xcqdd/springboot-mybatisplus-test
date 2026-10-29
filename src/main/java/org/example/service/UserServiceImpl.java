package org.example.service;

import org.example.dao.UserDao;
import org.example.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;//数据访问层接口实现对象




}
