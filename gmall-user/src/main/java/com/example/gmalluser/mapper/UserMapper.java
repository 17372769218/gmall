package com.example.gmalluser.mapper;

import com.example.gmalluser.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-07 21:35
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
