package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    
    public static void main(String[] args) {
        /*  System.out.println("PROCESSO SELETIVO");
       analisarCandidato(1900.00);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
       selecaoCandidatos();
       imprimirSelecionados();
       */

          String [] candidatos = {"Felipe", "Maria", "Joao", "Pedro","Paulo"};
          for (String candidato  : candidatos) {
              entrandoEmContato(candidato);
          }
        }
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentado = true;
            boolean atendeu=false;
            do {
                atendeu= atender();
                continuarTentado = !atendeu;
                if(continuarTentado)
                    tentativasRealizadas++;
                else
                    System.out.println("Contato realizado com sucesso!");

            }while(continuarTentado && tentativasRealizadas<3);

            if(atendeu)
                System.out.println("Conseguimos contato com " + candidato+ " na " +tentativasRealizadas + "tentativas");
            else
                System.out.println("Não conseguimos contato com "+candidato+", nunero máximos de tentativas " +tentativasRealizadas+ " realizadas" );
        }

    //metodo auxiliar
    static boolean atender(){
        return  new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Maria", "Joao", "Pedro","Paulo"};

        System.out.println("Imprimindo listagem de candidatos informando o numero dos elemento");

        for (int indice=0; indice < candidatos.length;indice++) {
            System.out.println("O candidato de n° " + (indice+1)+ " é "+ candidatos[indice]);
        }

        System.out.println("Forma  abreviada de interação for each");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Maria", "Joao", "Pedro","Paulo", "Augusto", "Monica", "Fabricio", "Mirela","Leid", "Rodrigo"};

        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de sálario " + salarioPretendido);
            if(salarioBase > salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase==salarioPretendido){
            System.out.println("Liga para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardo o resultado dos demais candidatos");
        }

    }
}
