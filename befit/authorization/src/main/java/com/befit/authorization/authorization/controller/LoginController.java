package com.befit.authorization.authorization.controller;

import com.befit.authorization.authorization.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by prachi on 5/25/2021.
 */
@RestController
public class LoginController {

    @GetMapping(value = "/login")
    public void login(@RequestBody @Valid User user){


    }

}
