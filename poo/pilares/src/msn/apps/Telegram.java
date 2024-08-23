package msn.apps;

import msn.ServicoDeMensagemInstatanea;

public class Telegram extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
            System.out.println("Enviado mensagem pelo Telegran");
    }

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recendo mensagem pelo Telegran");
        }
}
