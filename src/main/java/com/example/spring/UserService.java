package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Creating Singleton in spring
@Component
public class UserService {
    @Autowired
    UserRepository userRepository;

    User save() {
        User user = new User();
        user.setName("Ashish");
        userRepository.save(user);
        return user;
    }

    User get() {
        return new User();
    }
}
