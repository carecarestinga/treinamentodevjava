package br.com.technocorp.facade;

import br.com.technocorp.database.modeldb.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioFacade {

    public abstract Iterable<Usuario> buscarTodosUsuarios();

    public abstract Usuario buscarUsuarioPorId(Long id);

    public Boolean salvarUsuario(Usuario usuario);

    public Boolean atualizarUsuario(Usuario usuario, Long id);

    public Boolean excluirUsuario(Usuario usuario);

}
