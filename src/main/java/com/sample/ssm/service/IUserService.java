package com.sample.ssm.service;

import com.sample.ssm.model.UserInfo;

/**
 * @author lhm
 * @date 2020/8/8 23:25
 */
public interface IUserService {

    /**
     * 根据userId获取用户
     * @param userId
     * @return
     */
    UserInfo getUserInfoByUserId(Integer userId);

}
