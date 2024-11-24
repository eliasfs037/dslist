package com.eliasferreira.dslist.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

//classe auxiliar para a criação do id, que será como uma primary key.
public class BelongingPK {

    @ManyToOne //(muitos para um) fará o mapeamento do objeto relacional
    @JoinColumn(name = "game_id") //configurar o nome da chave estrangeira
    private Games game;//referência da classe Games

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list; //referência da classe GameList

    public BelongingPK(){

    }
    public BelongingPK(Games game, GameList list){
        this.game = game;
        this.list = list;
    }

    public Games getGame(){
        return game;
    }
    public void setGame(Games game){
        this.game = game;
    }

    public GameList getList(){
        return list;
    }
    public void setList(GameList list){
        this.list = list;
    }
    //neste caso de comparar chave primária múltipla, temos que comparar os dois, game e list
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(getGame(), that.getGame()) && Objects.equals(getList(), that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGame(), getList());
    }
}
