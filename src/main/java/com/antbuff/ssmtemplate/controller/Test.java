package com.antbuff.ssmtemplate.controller;

import com.antbuff.ssmtemplate.dto.User;
import com.antbuff.ssmtemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xinxin.lu01@hand-china.com
 * @date 上午11:02 11:02
 */

@Controller
@RequestMapping("/test")
//@RestController
public class Test {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/json", produces = {"application/json"},method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> json(User user, HttpServletResponse response) throws IOException {

//        手动解析
//        JSONObject jsonObject = JSON.parseObject(jsonData);
//        String username = jsonObject.getString("username");
//        String password = jsonObject.getString("password");

//        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
//        out.write((username+":"+password+"\n").getBytes());
//        out.write(jsonData.getBytes());
//        out.write((user.getUsername()+":"+user.getPassword()+"\n").getBytes());
//        out.close();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("username", user.getUsername());
        map.put("password", user.getPassword());


        return map;
    }

    @RequestMapping(value = "/user",produces = {"application/json"})
    @ResponseBody
    public List<User> user(){
        List<User> users = userService.selectUser();
        System.out.println(users.size());
        return users;
    }

}
