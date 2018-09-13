package br.com.technocorp.v1.facade;

import br.com.technocorp.facade.UsuarioFacade;
import br.com.technocorp.modeldto.UsuarioModelDto;

public class UsuarioContractFacade implements UsuarioFacade {


    @Override
    public Iterable<UsuarioModelDto> buscarTodosUsuarios() {
        return null;
    }

    @Override
    public UsuarioModelDto buscarUsuarioPorId(Long id) {
        return null;
    }

    @Override
    public Boolean salvarUsuario(UsuarioModelDto usuarioModelDto) {
        return null;
    }

    @Override
    public Boolean atualizarUsuario(UsuarioModelDto usuarioModelDto, Long id) {
        return null;
    }

    @Override
    public Boolean excluirUsuario(UsuarioModelDto usuarioModelDto) {
        return null;
    }


}
