package com.codegym.validate_thong_tin_bai_hat.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameSong;
    private String nameWriteSong;
    private String typeSong;

    public Music() {
    }

    public Music(Integer id, String nameSong, String nameWriteSong, String typeSong) {
        this.id = id;
        this.nameSong = nameSong;
        this.nameWriteSong = nameWriteSong;
        this.typeSong = typeSong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameWriteSong() {
        return nameWriteSong;
    }

    public void setNameWriteSong(String nameWriteSong) {
        this.nameWriteSong = nameWriteSong;
    }

    public String getTypeSong() {
        return typeSong;
    }

    public void setTypeSong(String typeSong) {
        this.typeSong = typeSong;
    }
}
