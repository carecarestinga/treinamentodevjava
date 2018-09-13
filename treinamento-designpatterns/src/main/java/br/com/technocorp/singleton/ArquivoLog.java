package br.com.technocorp.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArquivoLog {

    private FileWriter arquivo;
    private static ArquivoLog log;

    private ArquivoLog (){

        try{
            this.arquivo = new FileWriter("/home/carlos/testes/teste.log");
        } catch (IOException ex) {
            Logger.getLogger(ArquivoLog.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArquivoLog getInstance() {
        if(log == null){
            log = new ArquivoLog();
        }
        return log;
    }

}
