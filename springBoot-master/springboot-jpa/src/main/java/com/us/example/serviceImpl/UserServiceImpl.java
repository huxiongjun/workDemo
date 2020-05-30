package com.us.example.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.us.example.dao.UserJpaDao;
import com.us.example.bean.User;
import com.us.example.service.UserService;

/**
 * @author abel
 * @ClassName UserServiceImpl
 * @date 2016年11月10日
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserJpaDao userJpaDao;

    /**
     * @param username
     * @return
     */
    @Override
    public User getUserByName(String username) {
        return userJpaDao.findByName(username);
    }
}
