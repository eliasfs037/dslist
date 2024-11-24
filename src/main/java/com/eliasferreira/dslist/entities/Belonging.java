package com.eliasferreira.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

//belonging: pertencer. Ou seja, cada jogo pertence a qual lista.

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK(); //classe auxiliar criada para a criação do id
    private Integer position; //posição dos jogos na lista

    public Belonging(){

    }
    public Belonging(Games game, GameList list, Integer position){
        this.id.setGame(game); //essa associação irá fazer referência para o BelongingPK
        this.id.setList(list); //essa associação irá fazer referência para o BelongingPK
        this.position = position;
    }

    public BelongingPK getId(){
        return id;
    }
    public void setId(BelongingPK id){
        this.id = id;
    }

    public Integer getPosition(){
        return position;
    }
    public void setPosition(Integer position){
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(getId(), belonging.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}






/*
 * A classe Belonging fará referência a classe Games e a classe GameList. Na hora de criar o objeto do tipo Belonging
 * vamos passar a referência para ambos: this.id.setGame(game)  e  this.id.setList(list).
 *
 *
 *
 */


