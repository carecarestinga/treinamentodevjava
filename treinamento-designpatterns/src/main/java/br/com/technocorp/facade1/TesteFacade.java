package br.com.technocorp.facade1;

public class TesteFacade {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.setUsuario("usuarioTeste");
        u1.setSenha("senhaTeste");

        Perfil p1 = new Perfil();
        p1.setNome("perfilTeste");

        Autenticacao autenticacao = new AutenticacaoBean();
        autenticacao.obterUsuario(u1.getUsuario(),u1.getSenha());
        autenticacao.obetrPerfil(u1);
        System.out.println("Usuario = " + u1.getUsuario() + " e Senha = " + u1.getSenha());
        System.out.println("Autenticação de = " + autenticacao.obetrPerfil(u1));

    }


}
