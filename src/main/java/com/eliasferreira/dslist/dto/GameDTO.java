package com.eliasferreira.dslist.dto;

import com.eliasferreira.dslist.entities.Games;

//Dúvida sobre essa classe: pra que fazer um GameDTO se essa classe vai ter exatamente todos os dados da classe Game?
//Primeiro de tudo: padronização.
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    //construtor vazio
    public GameDTO(){};

    //construtor que recebe a entidade
    public GameDTO(Games entyti){
        id = entyti.getId();
        title = entyti.getTitle();
        year = entyti.getYear();
        genre = entyti.getGenre();
        platforms = entyti.getPlatforms();
        score = entyti.getScore();
        imgUrl = entyti.getImgUrl();
        shortDescription = entyti.getShortDescription();
        longDescription = entyti.getLongDescription();
    }
    public Long getId(){
        return id;
    }
   public String getTitle(){
        return title;
   }
   public Integer getYear(){
        return year;
   }
   public String getGenre(){
        return genre;
   }
   public String getPlatforms(){
        return platforms;
   }
   public Double getScore(){
        return score;
   }
   public String getImgUrl(){
        return imgUrl;
   }
   public String getShortDescription(){
        return shortDescription;
   }
   public String getLongDescription(){
        return longDescription;
   }


}


