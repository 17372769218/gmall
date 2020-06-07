package com.example.gmalluser.mapper;

import com.example.gmalluser.bean.UmsMember;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-07 21:35
 */
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
