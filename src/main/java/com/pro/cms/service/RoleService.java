package com.pro.cms.service;

import com.pro.cms.model.Role;

import java.util.List;

public interface RoleService {

    Role findById(Integer id);

    List<Role> getallRole();

    void store(Role role);

    void update(Role role);

    void destroy(Integer id);


}
