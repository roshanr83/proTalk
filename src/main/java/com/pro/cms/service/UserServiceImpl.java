package com.pro.cms.service;

import com.pro.cms.dao.UserDao;
import com.pro.cms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alis on 8/4/17.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userRepository;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setAccountNonLocked(true);
        userRepository.save(user);
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    public void updatePartial(User user) {
        userRepository.updatePartial(user);
    }

    @Override
    public User findUserByEmailForUpdate(User user) {
        return userRepository.findUserByEmailForUpdate(user);
    }

    @Override
    public User findById(Integer id) {
       return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAllUsers();
    }

    @Override
    public void destroy(Integer id) {
        userRepository.deleteById(id);
    }


}
