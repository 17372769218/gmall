package com.example.gmalluser.service.impl;

import com.example.gmalluser.bean.UmsMember;
import com.example.gmalluser.bean.UmsMemberReceiveAddress;
import com.example.gmalluser.mapper.UmsMemberReceiveAddressMapper;
import com.example.gmalluser.mapper.UserMapper;
import com.example.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-07 21:34
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
     UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> allUser =userMapper.selectAll();
        return allUser;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress u = new UmsMemberReceiveAddress();
        u.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(u);
        return umsMemberReceiveAddresses;
    }
}
