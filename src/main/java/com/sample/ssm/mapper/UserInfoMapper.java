package com.sample.ssm.mapper;

import com.sample.ssm.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author lhm
 * @date 2020/8/8 15:57
 */
public interface  UserInfoMapper {


    /**
     * 根据ID获取单个对象
     * @param userId
     * @return
     */
    UserInfo selectOne(@Param("userId") Integer userId);

}
