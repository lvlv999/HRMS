package com.cn.controller;

import com.cn.model.Resume;
import com.cn.model.User;
import com.cn.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping(value = "/goResume",method = RequestMethod.GET)
    public String goResume(){
        return "addResume";
    }
    @RequestMapping(value = "/addResume",method = RequestMethod.POST)
    public String addResume(Resume resume){
        if(null != resume){
            resumeService.addResume(resume);
            return "success";
        }
        return "addResume";
    }
    @RequestMapping(value = "/getResume",method = RequestMethod.GET)
    public String getResume(Resume resume, HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Resume resume1 = resumeService.getResumeById(user.getU_id());
//        System.out.println(user.getU_id());
//        System.out.println(resume1);
        if(null != resume1){
            session.setAttribute("resume",resume1);
            return "resume";
        }
        return "success";
    }
    @RequestMapping(value = "/updateResume",method = RequestMethod.POST)
    public String updateResume(Resume resume){
//        System.out.println(resume);
        resumeService.updateResume(resume);
        return "success";
    }
}
