package br.com.alura.forumkotlin.repository

import br.com.alura.forumkotlin.model.Curso
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository: JpaRepository<Curso, Long> {
}