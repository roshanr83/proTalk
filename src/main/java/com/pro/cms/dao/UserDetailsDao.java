package com.pro.cms.dao;

import com.pro.cms.model.UserAttempts;

public interface UserDetailsDao {
    void updateFailAttempts(String username);

    void resetFailAttempts(String username);

    UserAttempts getUserAttempts(String username);
}
