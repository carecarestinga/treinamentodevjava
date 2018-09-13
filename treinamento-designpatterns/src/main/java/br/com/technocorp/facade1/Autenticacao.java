package br.com.technocorp.facade1;

public interface Autenticacao {

    public Perfil obetrPerfil(Usuario usuario);

    public Usuario obterUsuario(String usuario, String senha);

}
