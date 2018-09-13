package br.com.technocorp.facade2;

public class TesteFacade {

        public static void main(String[] args) {
            FacadeCliente fc = new FacadeCliente();
            fc.cadastrar();
            FacadeFornecedor ff = new FacadeFornecedor();
            ff.cadastrar();
        }

}
