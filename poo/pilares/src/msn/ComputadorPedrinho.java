package msn;

import msn.apps.FacebookMessenger;
import msn.apps.MSNMessenger;
import msn.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoDeMensagemInstatanea smi = null;
        /* POLIMORFISMO
          NÃO SE SABE QUAL APP
          MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido ="msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }
        else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }
        else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
        /* 
        //Abrir MSN Menssenger
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
      //  msn.validarConectadoInternet();
        msn.enviarMensagem();
    //msn.salvarHitoricoMensagem();
        msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
         */
    }
       
}
