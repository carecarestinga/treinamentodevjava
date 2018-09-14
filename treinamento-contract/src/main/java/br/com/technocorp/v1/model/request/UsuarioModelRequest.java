package br.com.technocorp.v1.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModelRequest {

    private String nomeUsuarioReq;

    private String loginUsuarioReq;

    private String senhaUsuarioReq;



}
