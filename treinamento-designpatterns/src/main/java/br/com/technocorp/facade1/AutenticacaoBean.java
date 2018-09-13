package br.com.technocorp.facade1;

public class AutenticacaoBean  implements Autenticacao{
    @Override
    public Perfil obetrPerfil(Usuario usuario) {
        PerfilDao perfilDao = new PerfilDao();
        return perfilDao.obterPerfil(usuario);
    }

    @Override
    public Usuario obterUsuario(String usuario, String senha) {
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.getUsuario(usuario, senha);
    }
}
