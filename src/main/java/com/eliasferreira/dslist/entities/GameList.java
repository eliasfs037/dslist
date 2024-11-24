package com.eliasferreira.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    //construtor vazio
    public GameList(){

    }

    //construtor com argumentos
    public GameList(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return getId() == gameList.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}

/* tivemos dois erros ao rodar o projeto após a criação da classe Belonging:
* 1º: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource
 * 2º: Caused by: java.lang.NullPointerException: Cannot invoke "org.hibernate.mapping.PersistentClass.getTable()" because "classMapping" is null
* esses erros é porque esquecemos de maperar a classe GameList, esquecemos das anotations:
* @Entity
@Table(name = "tb_game_list")
* public classe GameList
*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
*
*As anotations para fazer o mapeamento: @Entity, @Tabele(name), @Id,  @GeneratedValue(strategy = GenerationType.IDENTITY)
*
* */