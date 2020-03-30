package com.example.demo1.controller;

import com.example.demo1.domain.User;
import com.example.demo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/person/save")
    public User save(@RequestParam String name){
        User user = new User();
        user.setName(name);
//        if (userRepository.save(user)){
//            System.out.println("用户对象：" + user + "保存成功！\n" );
//        }
//        return user;
    }

   /* @GetMapping("/person/save")
    public User save(@RequestParam String name){
        User user = new User();
        user.setName(name);
        if (userRepository.save(user)){
            System.out.println("用户对象：" + user + "保存成功！\n" );
        }
        return user;
    }*/
}
