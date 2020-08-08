package com.sample.ssm.service.impl;

import com.sample.ssm.mapper.UserInfoMapper;
import com.sample.ssm.model.UserInfo;
import com.sample.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lhm
 * @date 2020/8/8 23:26
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoByUserId(Integer userId) {
        return userInfoMapper.selectOne(userId);
    }
}
