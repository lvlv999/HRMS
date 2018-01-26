package com.cn.dao;

import com.cn.model.Resume;

public interface ResumeMapper {
    Resume getResumeById(int id);
    void addResume(Resume resume);
    void updateResume(Resume resume);
}
