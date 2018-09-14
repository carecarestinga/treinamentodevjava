package br.com.technocorp.mapper;

import br.com.technocorp.database.modeldb.Usuario;
import br.com.technocorp.modeldto.UsuarioModelDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UsuarioModelMapper {

    public static Usuario usuarioToUsuarioModelDto (UsuarioModelDto usuarioModelDto) {
        return Usuario.builder()
                .nome(usuarioModelDto.getNomeUsuario())
                .login(usuarioModelDto.getLoginUsuario())
                .senha(usuarioModelDto.getSenhaUsuario())
                .build();
    }

    public static UsuarioModelDto usuarioModelDtoToUsuario (Usuario usuario) {
        return UsuarioModelDto.builder()
                .nomeUsuario(usuario.getNome())
                .loginUsuario(usuario.getLogin())
                .senhaUsuario(usuario.getSenha())
                .build();
    }


}
