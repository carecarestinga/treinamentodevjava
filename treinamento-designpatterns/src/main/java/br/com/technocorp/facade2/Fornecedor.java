package br.com.technocorp.facade2;

public class Fornecedor {

    private String nome;
    private Endereco endereco;
    private Contato contato;

    public Fornecedor(String _nome, Endereco _endereco, Contato _contato) {
        this.nome = _nome;
        this.endereco = _endereco;
        this.contato = _contato;
    }
}
