package br.com.technocorp.modeldto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModelDto {


    private String nomeUsuario;

    private String loginUsuario;

    private String senhaUsuario;


}
