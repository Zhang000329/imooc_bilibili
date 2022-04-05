package com.imooc.bilibili.service;

import com.imooc.bilibili.dao.UserFollowingDao;
import com.imooc.bilibili.domain.UserFollowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFollowingService {
    @Autowired
    private UserFollowingDao userFollowingDao;

    public void addUserFollowing(UserFollowing userFollowing){

    }
}
