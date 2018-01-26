package com.cn.service.impl;

import com.cn.dao.ResumeMapper;
import com.cn.model.Resume;
import com.cn.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ResumeServiceImpl implements ResumeService{
    @Resource
    private ResumeMapper resumeMapper;
    @Override
    public Resume getResumeById(int id) {
        return resumeMapper.getResumeById(id);
    }

    @Override
    public void addResume(Resume resume) {
        resumeMapper.addResume(resume);
    }

    @Override
    public void updateResume(Resume resume) {
        resumeMapper.updateResume(resume);
    }
}
