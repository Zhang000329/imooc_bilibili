package com.imooc.bilibili.service;

import com.imooc.bilibili.domain.auth.AuthRoleElementOperation;
import com.imooc.bilibili.domain.auth.AuthRoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AuthRoleService {

    @Autowired
    private AuthRoleElementOperationService authRoleElementOperationService;
    @Autowired
    private AuthRoleMenuSerivce authRoleMenuSerivce;
    public List<AuthRoleElementOperation> getRoleElementOperation(Set<Long> roleIdSet) {
        return authRoleElementOperationService.getRoleElementOperation(roleIdSet);
    }

    public List<AuthRoleMenu> getAuthRoleMenusByRoleIds(Set<Long> roleIdSet) {
        return authRoleMenuSerivce.getAuthRoleMenusByRoleIds(roleIdSet);
    }
}
