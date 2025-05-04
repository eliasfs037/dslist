package com.eliasferreira.dslist.services;

import com.eliasferreira.dslist.dto.GameDTO;
import com.eliasferreira.dslist.dto.GamesMinDTO;
import com.eliasferreira.dslist.entities.Games;
import com.eliasferreira.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //registra como se fosse um componente do sistema
public class GamesServices {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Games result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result); //construtor para transformar game em gameDto
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GamesMinDTO> findAll(){
        List<Games> result = gameRepository.findAll();
        List<GamesMinDTO> dto = result.stream().map(x -> new GamesMinDTO(x)).toList();
        return dto;
    }


}





/*
* Como que eu faço uma consulta no banco de dados, buscando os games e trazendo para o método findAll?
* R: utilizando  o método findAll(). É um método que busca no banco de dados a lista de todos os games. O resultado
* dsse método precisa ser armazenado em uma variável: List<Games> result. O resultado dessa consulta do banco, será
* altomaticamente convertida para uma lista de games.
*
*
*
*
* */
