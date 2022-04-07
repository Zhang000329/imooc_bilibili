package com.imooc.bilibili.dao;

import com.alibaba.fastjson.JSONObject;
import com.imooc.bilibili.domain.RefreshTokenDetail;
import com.imooc.bilibili.domain.User;
import com.imooc.bilibili.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Date;
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

    void deleteRefreshToken(@Param("refreshToken") String refreshToken,
                            @Param("userId") Long userId);

    void addRefreshToken(@Param("refreshToken")String refreshToken,
                         @Param("userId") Long userId,
                         @Param("createTime") Date date);

    RefreshTokenDetail getRefreshTokenDetail(String refreshToken);
}
