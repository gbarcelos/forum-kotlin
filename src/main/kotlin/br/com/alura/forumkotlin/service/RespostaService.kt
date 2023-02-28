package br.com.alura.forumkotlin.service

import br.com.alura.forumkotlin.model.Resposta
import br.com.alura.forumkotlin.repository.RespostaRepository
import org.springframework.stereotype.Service

@Service
class RespostaService(
    private val respostaRepository: RespostaRepository,
    private val emailService: EmailService
) {

    fun salvar(resposta: Resposta) {
        respostaRepository.save(resposta)
        val emailAutor = resposta.topico.autor.email
        emailService.notificar(emailAutor)
    }
}