package com.Antwan.WeatherWidget.service;

import com.Antwan.WeatherWidget.model.User;
import com.Antwan.WeatherWidget.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User getUser(long id){
        return userRepository.findById(id).get();
    }
}
