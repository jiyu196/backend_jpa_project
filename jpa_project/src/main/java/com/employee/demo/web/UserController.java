package com.employee.demo.web;

import com.employee.demo.entity.User;
import com.employee.demo.repository.UserRepository;
import com.employee.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userSevice;

    public UserController(UserService userService){
        this.userSevice = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userSevice.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User createUser = userSevice.create(user);
        return new ResponseEntity<>(createUser, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userSevice.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}