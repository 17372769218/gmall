package com.example.gmalluser.service.impl;

import com.example.gmalluser.bean.UmsMember;
import com.example.gmalluser.mapper.UserMapper;
import com.example.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-07 21:34
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> allUser = userMapper.selectAllUser();
        return allUser;
    }
}
