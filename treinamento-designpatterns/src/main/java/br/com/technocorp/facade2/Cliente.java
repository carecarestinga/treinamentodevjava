package br.com.technocorp.facade2;

public class Cliente {

    private String nome;
    private Endereco endereco;
    private Contato contato;

    public Cliente(String _nome, Endereco _endereco, Contato _contato) {
        this.nome = _nome;
        this.endereco = _endereco;
        this.contato = _contato;
    }

}
