package com.cn.controller;

import com.cn.model.User;
import com.cn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/goRegister",method = RequestMethod.GET)
    public String goRegister(){
        return "register";
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String addUser(User user){
        //System.out.println(user);
        userService.addUser(user);
        return "../../index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginUser(User user, HttpServletRequest request){
        List<User> userList = userService.getUserList();
        for (User user1:userList){
            if(user.equals(user1)){
                HttpSession session = request.getSession();
                session.setAttribute("user",user1);
                return "success";
            }
        }
        return "../../index";
    }
}
