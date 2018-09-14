package br.com.technocorp.v1.facade;

import br.com.technocorp.database.modeldb.Usuario;
import br.com.technocorp.facade.UsuarioFacade;
import br.com.technocorp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioContractFacade implements UsuarioFacade {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioContractFacade(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public Iterable<Usuario> buscarTodosUsuarios() {
        return usuarioService.buscarTodosUsuarios();
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioService.buscarUsuarioPorId(id);
    }

    @Override
    public Boolean salvarUsuario(Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @Override
    public Boolean atualizarUsuario(Usuario usuario, Long id) {
        return usuarioService.atualizarUsuario(usuario, id);
    }

    @Override
    public Boolean excluirUsuario(Usuario usuario) {
        return usuarioService.excluirUsuario(usuario);
    }

}
