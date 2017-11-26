package com.pro.cms.service;

import com.pro.cms.dao.RoleDao;
import com.pro.cms.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDao roleRepository;

    @Override
    public Role findById(Integer id) {
        return roleRepository.findById(id);
    }

    @Override
    public List<Role> getallRole() {
        return roleRepository.findAll();
    }

    @Override
    public void store(Role role) {
         roleRepository.store(role);
    }

    @Override
    public void update(Role role) {
         roleRepository.update(role);
    }

    @Override
    public void destroy(Integer id) {
         roleRepository.destroy(id);
    }
}
