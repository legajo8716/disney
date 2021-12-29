package com.Alkemy.Disney.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    File image;
    String titulo;
    LocalDate dateCreation;
    int calification;
    ArrayList<Character> characterAssociated;


    public Film(File image, String titulo, int calification) {
        this.image = image;
        this.titulo = titulo;
        this.calification = calification;
        this.dateCreation= LocalDate.now();
    }

    public Film() {
    }
}
