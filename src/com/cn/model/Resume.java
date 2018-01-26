package com.cn.model;

import java.io.Serializable;

public class Resume implements Serializable {
    private int r_id;
    private String r_name;
    private int r_age;
    private String r_sex;
    private String r_education;
    private String r_major;
    private int r_phone;
    private String r_address;
    private int u_id;

    public Resume() {
    }

    public Resume(int r_id, String r_name, int r_age, String r_sex, String r_education, String r_major, int r_phone, String r_address, int u_id) {
        this.r_id = r_id;
        this.r_name = r_name;
        this.r_age = r_age;
        this.r_sex = r_sex;
        this.r_education = r_education;
        this.r_major = r_major;
        this.r_phone = r_phone;
        this.r_address = r_address;
        this.u_id = u_id;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public int getR_age() {
        return r_age;
    }

    public void setR_age(int r_age) {
        this.r_age = r_age;
    }

    public String getR_sex() {
        return r_sex;
    }

    public void setR_sex(String r_sex) {
        this.r_sex = r_sex;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public String getR_major() {
        return r_major;
    }

    public void setR_major(String r_major) {
        this.r_major = r_major;
    }

    public int getR_phone() {
        return r_phone;
    }

    public void setR_phone(int r_phone) {
        this.r_phone = r_phone;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                ", r_age=" + r_age +
                ", r_sex='" + r_sex + '\'' +
                ", r_education='" + r_education + '\'' +
                ", r_major='" + r_major + '\'' +
                ", r_phone=" + r_phone +
                ", r_address='" + r_address + '\'' +
                ", u_id=" + u_id +
                '}';
    }
}
