package com.Alkemy.Disney.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;
import java.util.ArrayList;
@Entity
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    File image;
    ArrayList<Film> filmAssociadted;

    public Gender(String name,String urlImage) {
        this.name = name;
        this.image=new File(urlImage);
    }
}
