package br.com.technocorp.v1.mapper;

import br.com.technocorp.modeldto.UsuarioModelDto;
import br.com.technocorp.v1.model.request.UsuarioModelRequest;
import br.com.technocorp.v1.model.response.UsuarioModelResponse;

public class UsuarioContractMapper {

    public UsuarioModelResponse mapperToContract (UsuarioModelDto usuarioModelDto) {
        return UsuarioModelResponse.builder()
                .nomeUsuarioResp(usuarioModelDto.getNomeUsuario())
                .loginUsuarioResp(usuarioModelDto.getLoginUsuario())
                .senhaUsuarioResp(usuarioModelDto.getSenhaUsuario())
                .build();
    }

    public UsuarioModelDto mapperToImpl (UsuarioModelRequest usuarioModelRequest) {
        return UsuarioModelDto.builder()
                .nomeUsuario(usuarioModelRequest.getNomeUsuarioReq())
                .loginUsuario(usuarioModelRequest.getLoginUsuarioReq())
                .senhaUsuario(usuarioModelRequest.getSenhaUsuarioReq())
                .build();
    }


}
