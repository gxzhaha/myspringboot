package cn.itcast.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan
public class ServiceProvideBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvideBootApplication.class, args);
    }

}
