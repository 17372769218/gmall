package com.example.gmalluser.service;

import com.example.gmalluser.bean.UmsMember;
import com.example.gmalluser.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-07 21:33
 */
public interface UserService  {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
