package com.eliasferreira.dslist.repository;

import com.eliasferreira.dslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

//Repositório é o objeto responsável por fazer a consulta ao banco de dados.
public interface GameRepository extends JpaRepository <Games, Long> {
}



/*
* Com essa estrutura, vamos ter a nossa disposição um componente que irá fazer consultas com o banco, irá inserir,
* vai atualizar, vai deletar, dentre outras ações básicas com o JpaRepository.
*
*
* */