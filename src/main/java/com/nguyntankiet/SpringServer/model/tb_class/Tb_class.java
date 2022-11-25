package com.nguyntankiet.SpringServer.model.tb_class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tb_class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String id_class;
    private String name_class;
    public int getId() { return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getId_class() {
        return id_class;
    }

    public void setId_class(String id_class) {
        this.id_class = id_class;
    }

    public String getName_class() {
        return name_class;
    }

    public void setName_class(String name_class) {
        this.name_class = name_class;
    }

    @Override
    public String toString() {
        return "Tb_class{" +
                "id=" + id +
                ", id_class='" + id_class + '\'' +
                ", name_class='" + name_class + '\'' +
                '}';
    }
}
