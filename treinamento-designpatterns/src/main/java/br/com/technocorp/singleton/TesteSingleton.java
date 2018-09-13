package br.com.technocorp.singleton;

public class TesteSingleton {

    public static void main(String[] args) {

        ArquivoLog arquivoLog = ArquivoLog.getInstance();
        ArquivoLog arquivoLog2 = ArquivoLog.getInstance();

        System.out.println("Imprimindo a 1ª Instancia = " + arquivoLog);
        System.out.println("Imprimindo a 2ª Instancia = " + arquivoLog2);

    }

}
