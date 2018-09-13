package br.com.technocorp.facade2;

public class FacadeCliente {

    public void cadastrar() {
        Endereco endereco= new Endereco("Rua bbbbb","200");
        Contato contato = new Contato("1111-1111","teste@teste.com.br");
        Cliente cliente = new Cliente("Cliente1", endereco, contato);
        ClienteDao clienteDao = new ClienteDao(cliente);
        clienteDao.cadastrar(cliente);
    }

}
