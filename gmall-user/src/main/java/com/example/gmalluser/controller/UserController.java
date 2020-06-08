package com.example.gmalluser.controller;

import com.example.gmalluser.bean.UmsMember;
import com.example.gmalluser.bean.UmsMemberReceiveAddress;
import com.example.gmalluser.service.UserService;
import com.example.gmalluser.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-07 21:32
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getMember")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> allUser = userService.getAllUser();
        return allUser;
    }
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello";
    }
 }

