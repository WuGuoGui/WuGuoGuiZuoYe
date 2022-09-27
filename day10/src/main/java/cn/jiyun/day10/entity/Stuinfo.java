package cn.jiyun.day10.entity;

import java.io.Serializable;

/**
 * (Stuinfo)实体类
 *
 * @author makejava
 * @since 2022-09-26 16:53:21
 */
public class Stuinfo  {
    
    private Integer stuid;
    
    private Student student;


    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

