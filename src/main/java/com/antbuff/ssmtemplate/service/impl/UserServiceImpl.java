package com.antbuff.ssmtemplate.service.impl;

import com.antbuff.ssmtemplate.dto.User;
import com.antbuff.ssmtemplate.mapper.UserMapper;
import com.antbuff.ssmtemplate.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xinxin.lu01@hand-china.com
 * @date 下午4:03 16:03
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        List<User> userAll = userMapper.getUserAll();
        return userAll;
    }
}
