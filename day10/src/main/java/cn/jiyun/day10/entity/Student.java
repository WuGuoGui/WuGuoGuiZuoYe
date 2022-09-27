package cn.jiyun.day10.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

/**
 * ClassName: Student
 * Author:   WGG
 * Date:    2022-09-2022/9/26-17:18
 * Version: 1.0
 * Description:
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer stuId;
    private String stuName;
    private String stuAge;
    private String stuSex;
    private String stuAddress;
    private String stuPhone;
}
