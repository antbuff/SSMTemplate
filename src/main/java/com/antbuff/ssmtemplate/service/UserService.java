package com.antbuff.ssmtemplate.service;

import com.antbuff.ssmtemplate.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xinxin.lu01@hand-china.com
 * @date 下午4:01 16:01
 */


public interface UserService {
    List<User> selectUser();
}
