package com.antbuff.ssmtemplate.controller;

import com.antbuff.ssmtemplate.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinxin.lu01@hand-china.com
 * @date 下午7:33 19:33
 */


@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void login(@RequestBody User user){
        System.out.println(user);
    }

}
