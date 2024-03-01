package com.javatechie.keycloak.service;

import com.javatechie.keycloak.entity.User;
import com.javatechie.keycloak.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void initializeUserTable() {
        User user1 = new User();
        user1.setNom("user1");
        user1.setPrenom("user1P");
        user1.setEmail("user1@gmail.com");
        user1.setPassword("password1");
        userRepository.save(user1);

        User user2 = new User();
        user2.setNom("user2");
        user2.setPrenom("user2P");
        user2.setEmail("user2@gmail.com");
        user2.setPassword("password2");
        userRepository.save(user2);

        User user3 = new User();
        user3.setNom("user3");
        user3.setPrenom("user3P");
        user3.setEmail("user3@gmail.com");
        user3.setPassword("password3");
        userRepository.save(user3);
    }

    public User getUser(int userId) {
        return userRepository
                .findById(userId)
                .orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
