package org.example.controller;

import org.example.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        System.out.println("ID: " + request.getUserid());
        System.out.println("Password: " + request.getPassword());
        return "Login info received";
    }
}
