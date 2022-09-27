package cn.jiyun.day10;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.jiyun.day10.dao")
public class Day10Application {

    public static void main(String[] args) {
        SpringApplication.run(Day10Application.class, args);
    }

}
