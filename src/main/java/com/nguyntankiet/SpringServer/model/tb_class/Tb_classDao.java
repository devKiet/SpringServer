package com.nguyntankiet.SpringServer.model.tb_class;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class Tb_classDao {

    @Autowired
    private Tb_classRepository repository;

    public Tb_class save(Tb_class tb_class) {
        return repository.save(tb_class);
    }

    public List<Tb_class> getAllTb_class() {
        List<Tb_class> tb_class = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(tb_class::add);
        return tb_class;
    }
}
