package br.com.technocorp.facade2;

public class FacadeFornecedor {

    public void cadastrar()
    {
        Endereco endereco= new Endereco("Rua ccccc","300");
        Contato contato = new Contato("2222-2222","teste@teste.com.br");
        Fornecedor fornecedor = new Fornecedor("Fornecedor1", endereco, contato);
        FornecedorDao fornecedorDao = new FornecedorDao(fornecedor);
        fornecedorDao.cadastrar(fornecedor);
    }

}
