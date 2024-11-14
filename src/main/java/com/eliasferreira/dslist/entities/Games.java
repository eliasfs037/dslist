package com.eliasferreira.dslist.entities;
//esse asterisco(*) no final da importação do jakarta siginifca que importei todas as classes da interface sem
//precisar importar uma a uma individualmente (Enity, Table, Id, GeneratedValue, GenerationType, Column)
import jakarta.persistence.*;

import java.util.Objects;

@Entity //essa anotation vai configurar a minha classe para que ela seja equivalente a uma tabela do banco relacional
@Table(name = "tb_game")
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title; //título
    @Column(name = "game_year")
    private Integer year; //year é uma palavra reservada no SQL, vamos costumizar a coluna para evitar algum tipo de problema //ano
    private String genre; //gênero
    private String platform; //plataforma
    private String imgUrl;
    private String shortDescription; //descrição curta
    private String longDescription; //descrição longa

    public Games(){}
    //construtor
    public Games(Long id, String title, Integer year, String genre, String platform, String imgUrl,
                 String shortDescription, String longDescription){
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
    //encapsulamento
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    //como que faz para comparar um game com o outro? (comparar dois objetos)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return Objects.equals(getId(), games.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
