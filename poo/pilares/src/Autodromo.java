public class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();
    //jeep.confereCombustivel();
    //jeep.confereCambio();
    jeep.setChassi("saidjaisdjaisjda");
    //jeep.ligar();

    Moto z400 = new Moto();
    z400.setChassi("sadasdasf");
    //z400.ligar();

    Veiculo coringa = z400;


    coringa.ligar();

  }
}
