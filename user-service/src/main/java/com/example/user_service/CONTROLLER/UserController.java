package com.example.user_service.CONTROLLER;

import com.example.user_service.ENTITY.User;
import com.example.user_service.SERVICE.UserService;
import com.example.user_service.VO.ResponseTemplateVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
@Slf4j
public class UserController {

    //TEST
    private final UserService userService;


    @PostMapping
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable Long id) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(id);


    }





}