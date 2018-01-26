package com.cn.service;

import com.cn.model.Resume;

public interface ResumeService {
    Resume getResumeById(int id);
    void addResume(Resume resume);
    void updateResume(Resume resume);
}
