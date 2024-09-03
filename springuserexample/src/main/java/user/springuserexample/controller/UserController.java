package user.springuserexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import user.springuserexample.entity.User;
import user.springuserexample.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserService service;

    @PostMapping("/addUser")
    public User regUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @GetMapping("/getUser")
    public List<User> getUser() {
        return service.getUser();
    }
}