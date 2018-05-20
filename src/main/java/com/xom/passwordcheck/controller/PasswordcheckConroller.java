package com.xom.passwordcheck.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordcheckConroller {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to password checking service";
    }

}
