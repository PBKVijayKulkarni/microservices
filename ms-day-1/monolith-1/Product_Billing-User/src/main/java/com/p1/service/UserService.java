package com.p1.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.p1.model.User;

@Service
public class UserService {

    private Map<Integer, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put(1, new User(1, "John"));
        userMap.put(2, new User(2, "Alice"));
    }

    public User getUser(int id) {
        return userMap.get(id);
    }

    public Collection<User> getAllUsers() {
        return userMap.values();
    }
}