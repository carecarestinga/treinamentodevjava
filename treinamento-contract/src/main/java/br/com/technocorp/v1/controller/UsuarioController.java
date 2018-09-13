package br.com.technocorp.v1.controller;

import br.com.technocorp.modeldto.UsuarioModelDto;
import br.com.technocorp.v1.facade.UsuarioContractFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class UsuarioController {

    private UsuarioContractFacade usuarioContractFacade;

    @Autowired
    public UsuarioController(UsuarioContractFacade usuarioContractFacade) {
        this.usuarioContractFacade = usuarioContractFacade;
    }

    @RequestMapping(value = "/usuarios/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable<UsuarioModelDto> buscaTodosUsuarios(){
        return usuarioContractFacade.buscarTodosUsuarios();
    }



}
