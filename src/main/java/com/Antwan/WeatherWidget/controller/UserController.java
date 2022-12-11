package com.Antwan.WeatherWidget.controller;

import com.Antwan.WeatherWidget.model.User;
import com.Antwan.WeatherWidget.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/")
    public User socialLogin(@RequestBody Map<String, String> userData) {
        User user = new User(userData.get("name"), userData.get("email"));
        if (userService.getUserByEmail(user.getEmail()) == null) {
           return userService.saveUser(user);
        }else{
            return userService.getUserByEmail(user.getEmail());
        }

    }

    @GetMapping("/")
    public User getUser(@RequestParam("id") long id) {
       return userService.getUser(id);
    }
}
