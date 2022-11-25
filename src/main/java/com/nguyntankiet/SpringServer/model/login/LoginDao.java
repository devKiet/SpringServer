package com.nguyntankiet.SpringServer.model.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class LoginDao {

    @Autowired
    private LoginRepository repository;

    public Login save(Login login) {
        return repository.save(login);
    }

    public List<Login> getAllLogin() {
        List<Login> login = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(login::add);
        return login;
    }


}