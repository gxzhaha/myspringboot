package cn.itcast.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 晓庄哥哥
 * @warning 要写注释弟弟
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "hello world";
    }

}
