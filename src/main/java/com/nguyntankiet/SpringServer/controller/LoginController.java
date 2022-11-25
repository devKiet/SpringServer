package com.nguyntankiet.SpringServer.controller;

import com.nguyntankiet.SpringServer.model.login.Login;
import com.nguyntankiet.SpringServer.model.login.LoginDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginDao loginDao;

    @GetMapping("/login/get-all")
    public List<Login> getAllLogin() { return loginDao.getAllLogin(); }

    @PostMapping("/login/save")
    public Login save(@RequestBody Login login) { return loginDao.save(login); }
}
