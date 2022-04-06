package com.imooc.bilibili.dao;

import com.alibaba.fastjson.JSONObject;
import com.imooc.bilibili.domain.User;
import com.imooc.bilibili.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

@Mapper
public interface UserDao {

    User getUserByPhone(String phone);

    Integer addUser(User user);

    Integer addUserInfo(UserInfo userInfo);

    User getUserById(Long Id);

    UserInfo getUserInfoById(Long userId);

    Integer updateUserInfos(UserInfo userInfo);

    ArrayList<UserInfo> getUserInfoByUserInfo(Set<Long> userIdList);

    Integer pageCountUserInfo(Map<String, Object> params);

    ArrayList<UserInfo> pageListUserInfos(Map<String, Object> params);
}
