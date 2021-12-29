package com.Alkemy.Disney.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;
import java.util.ArrayList;
@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int age;
    File image;
    double size;
    String history;
    ArrayList<Film> films=new ArrayList<>();

    public Character(String name, int age, String pathImage, Double size, String history) {
        this.name = name;
        this.age = age;
        this.image= new File(pathImage);
        this.size=size;
        this.history=history;
    }

    public Character() {
    }
}
