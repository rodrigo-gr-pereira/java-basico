
package msn;

public abstract class ServicoDeMensagemInstatanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //mais um metodo que todos os filhos deverão implementar 
    public abstract void salvarHistoricoMensagem();

    //somente os filhos conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
        /* Ex Heranca 
        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        //depois enviada, salva e historico da mensagem
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem");
    }

    //metodos privadas, visiveis somente classe
    private void validarConectadoInternet(){
        System.out.println("Valoidando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico de mensagem");
    }
        */
}
