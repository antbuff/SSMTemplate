package com.antbuff.ssmtemplate.mapper;

import com.antbuff.ssmtemplate.dto.User;

import java.util.List;

/**
 * @author xinxin.lu01@hand-china.com
 * @date 上午11:28 11:28
 */


public interface UserMapper {
    User getUserById(Integer id);
    List<User> getUserAll();
}
