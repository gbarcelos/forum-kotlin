package br.com.alura.forumkotlin.service

import br.com.alura.forumkotlin.model.Usuario
import br.com.alura.forumkotlin.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService (private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }

}
