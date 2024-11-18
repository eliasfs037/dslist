package com.eliasferreira.dslist.dto;

import com.eliasferreira.dslist.entities.Games;

public class GamesMinDTO {
    private Long id;
    private String title; //título
    private Integer year; //year é uma palavra reservada no SQL, vamos costumizar a coluna para evitar algum tipo de problema //ano
    private String imgUrl;
    private String shortDescription;//descrição curta

    public GamesMinDTO(){

    }
    public GamesMinDTO(Games entyti){
        id = entyti.getId();
        title = entyti.getTitle();
        year = entyti.getYear();
        imgUrl = entyti.getImgUrl();
        shortDescription = entyti.getShortDescription();
    }
    //no DTO só vamos precisar dos getters
    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
