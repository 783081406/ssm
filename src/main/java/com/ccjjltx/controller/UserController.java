package com.ccjjltx.controller;

import com.ccjjltx.dao.UserMapper;
import com.ccjjltx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ccj
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/selectid")
    @ResponseBody
    public String selectid(int id) {
        System.out.println("id===" + id);
        User user = userMapper.selectByPrimaryKey(id);
        return user.getUsername();
    }
}
