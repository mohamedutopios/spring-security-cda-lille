package com.example.springsecurity.controller;


import com.example.springsecurity.dto.BaseResponseDto;
import com.example.springsecurity.model.User;
import com.example.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    UserService userService;



    @PostMapping("/api/auth/register")
    public BaseResponseDto registerUser(@RequestBody User user){
        if(userService.createUser(user)){
            return new BaseResponseDto("success");
        }else{
            return new BaseResponseDto("failed");
        }
    }




}
