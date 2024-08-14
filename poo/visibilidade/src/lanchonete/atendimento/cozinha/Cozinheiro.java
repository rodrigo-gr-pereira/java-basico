package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    //poder ser default 
    public void adicionarLancheNoBalcao(){
        System.err.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALÇÃO");
    }
    //poder ser default 
    public void adicionarSucoNoBalcao(){
        System.err.println("ADICIONANDO SUCO NO BALÇÃO");
    }
    //poder ser default 
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private  void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
    }
    private void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }
    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }
    public void fritarIngredientesLanche(){
        System.err.println("FRITANDO CARNE E OVO PARA O HAMBUGUER");
    }
   // public void pedirPraTrocarGas(Atendente meuAmigo){
     //   meuAmigo.trocarGas();
  //  }
    public void pedirPraTrocarGas(Almoxarife meuamigo){
        meuamigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
