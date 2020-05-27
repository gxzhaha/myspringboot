package cn.itcast.springboot;

import cn.itcast.springboot.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 晓庄哥哥
 * @warning 要写注释弟弟
 **/

@SpringBootApplication
public class TestApplication {


    public static void main(String[] args) {


        SpringApplication.run(TestApplication.class, args);


    }
}
