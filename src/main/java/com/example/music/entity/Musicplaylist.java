package com.example.music.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Musicplaylist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idplaylist;

    private String musicname;

    private String musicartist;
}
