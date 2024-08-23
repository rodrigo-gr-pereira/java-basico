package msn.apps;

import msn.ServicoDeMensagemInstatanea;

public class FacebookMessenger extends ServicoDeMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
            System.out.println("Enviando mensgem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("REcebendo mensagem pelo Facebook");
    }
   
}
