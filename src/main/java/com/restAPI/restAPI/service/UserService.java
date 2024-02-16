package com.restAPI.restAPI.service;

import com.restAPI.restAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    private List<User> userList;
    public UserService(){
        userList = new ArrayList<>();
        User user1 = new User(1, "John", 25, "john@gmail.com");
        userList.add(user1);
    }


    public Optional<User> getUser(int id) {
        return userList.stream().filter(user -> user.getId() == id).findFirst();
    }
}
