package br.com.alura.forumkotlin.mapper

import br.com.alura.forumkotlin.dto.NovoTopicoForm
import br.com.alura.forumkotlin.model.Topico
import br.com.alura.forumkotlin.service.CursoService
import br.com.alura.forumkotlin.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
        private val cursoService: CursoService,
        private val usuarioService: UsuarioService
): Mapper<NovoTopicoForm, Topico> {
    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
                titulo = t.titulo,
                mensagem = t.mensagem,
                curso = cursoService.buscarPorId(t.idCurso),
                autor = usuarioService.buscarPorId(t.idAutor)
        )
    }

}
