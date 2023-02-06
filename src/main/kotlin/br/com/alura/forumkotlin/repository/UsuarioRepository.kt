package br.com.alura.forumkotlin.repository

import br.com.alura.forumkotlin.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository<Usuario, Long> {
}