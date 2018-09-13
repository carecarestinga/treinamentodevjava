package br.com.technocorp.v1.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {

    private String nomeUsuarioResp;

    private String loginUsuarioResp;

    private String senhaUsuarioResp;

}
