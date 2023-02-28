package br.com.alura.forumkotlin.repository

import br.com.alura.forumkotlin.model.Resposta
import org.springframework.data.jpa.repository.JpaRepository

interface RespostaRepository: JpaRepository<Resposta, Long>