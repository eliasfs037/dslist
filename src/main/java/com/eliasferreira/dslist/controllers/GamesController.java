package com.eliasferreira.dslist.controllers;
//esse controlador vai ser a porta de entrada para o backend. Ele que vai disponibilizar a nossa API.


import com.eliasferreira.dslist.dto.GameDTO;
import com.eliasferreira.dslist.dto.GamesMinDTO;
import com.eliasferreira.dslist.entities.Games;
import com.eliasferreira.dslist.services.GamesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/games")
public class GamesController {
    @Autowired //anotation para injetar uma dependência
    private GamesServices gamesServices; //chamando a classe Services

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gamesServices.findById(id);
        return result;
    }
    @GetMapping
    public List<GamesMinDTO> findAll(){
        List<GamesMinDTO> result = gamesServices.findAll(); //método criado na classe GamesServices
        return result;
    }
}

/*
* @GetMapping
*
*
*
*
* */
