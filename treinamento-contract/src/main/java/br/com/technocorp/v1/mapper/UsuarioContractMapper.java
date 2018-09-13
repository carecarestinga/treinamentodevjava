package br.com.technocorp.v1.mapper;

import br.com.technocorp.modeldto.UsuarioModelDto;
import br.com.technocorp.v1.model.request.UsuarioRequest;
import br.com.technocorp.v1.model.response.UsuarioResponse;

public class UsuarioContractMapper {

    public UsuarioResponse mapperToContract (UsuarioModelDto usuarioModelDto) {
        return UsuarioResponse.builder()
                .nomeUsuarioResp(usuarioModelDto.getNomeUsuario())
                .loginUsuarioResp(usuarioModelDto.getLoginUsuario())
                .senhaUsuarioResp(usuarioModelDto.getSenhaUsuario())
                .build();
    }

    public UsuarioModelDto mapperToImpl (UsuarioRequest usuarioRequest) {
        return UsuarioModelDto.builder()
                .nomeUsuario(usuarioRequest.getNomeUsuarioReq())
                .loginUsuario(usuarioRequest.getLoginUsuarioReq())
                .senhaUsuario(usuarioRequest.getSenhaUsuarioReq())
                .build();
    }


}
