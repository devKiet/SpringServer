package com.nguyntankiet.SpringServer.controller;

import com.nguyntankiet.SpringServer.model.tb_class.Tb_class;
import com.nguyntankiet.SpringServer.model.tb_class.Tb_classDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class Tb_loginController {
    @Autowired
    private Tb_classDao tb_classDao;

    @GetMapping("/class/get-all")
    public List<Tb_class> getAllStudents() {
        return tb_classDao.getAllTb_class();
    }

    @PostMapping("/class/save")
    public Tb_class save(@RequestBody Tb_class tb_class) {
        return tb_classDao.save(tb_class);
    }

}
