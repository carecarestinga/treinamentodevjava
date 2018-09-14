package br.com.technocorp.v1.controller;

import br.com.technocorp.database.modeldb.Usuario;
import br.com.technocorp.v1.facade.UsuarioContractFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class UsuarioController {

    private UsuarioContractFacade usuarioContractFacade;

    @Autowired
    public UsuarioController(UsuarioContractFacade usuarioContractFacade) {
        this.usuarioContractFacade = usuarioContractFacade;
    }

    @RequestMapping(value = "/usuarios")
    public Iterable<Usuario> buscaTodosUsuarios() {
        return usuarioContractFacade.buscarTodosUsuarios();

    }

}
