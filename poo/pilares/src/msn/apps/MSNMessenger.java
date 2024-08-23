package msn.apps;

import msn.ServicoDeMensagemInstatanea;

public class MSNMessenger extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
            System.out.println("Enviando mensgaem pelo MSN Messenger");
        }
        

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
    System.out.println( "Recebendo mensagem pelo MSN Messenger");
    }
   
}
