package br.com.technocorp.facade;

import br.com.technocorp.database.modeldb.Usuario;
import br.com.technocorp.modeldto.UsuarioModelDto;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioFacade {

    public Iterable<UsuarioModelDto> buscarTodosUsuarios();

    public UsuarioModelDto buscarUsuarioPorId(Long id);

    public Boolean salvarUsuario(UsuarioModelDto usuarioModelDto);

    public Boolean atualizarUsuario(UsuarioModelDto usuarioModelDto, Long id);

    public Boolean excluirUsuario(UsuarioModelDto usuarioModelDto);

}
