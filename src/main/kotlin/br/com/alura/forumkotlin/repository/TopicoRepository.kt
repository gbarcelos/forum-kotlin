package br.com.alura.forumkotlin.repository

import br.com.alura.forumkotlin.model.Topico
import org.springframework.data.jpa.repository.JpaRepository

interface TopicoRepository: JpaRepository<Topico, Long> {
}