package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações não precisam estár disponiveis para aplicacao
      //private  cozinheiro.lavarIngredientes();
        //cozinheiro.baterVitaminaLiquidificador();
        //cozinheiro.selecionarIngredientesVitamina();
        //cozinheiro.prepararLanche();
        //cozinheiro.prepararVitamina();
       // cozinheiro.prepararVitamina();

        //ações que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações não precisam estár disponiveis para aplicacao
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();
        //ações que somente o seu pacote cozinhar precisa conhecer (default)
       // almoxarife.entregarIngredientes();
       // almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ações que somente o  seu  pacote cozinha precisa conhecer (default)
       // atendente.trocarGas();
 
        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento 
        //ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //está acao e muito sigilosa, que tal ser privado
        cliente.consultarSaldoAplicativo();

        //já pensou os clientes ouvindo que o gas acabou.
       // cozinheiro.pedirPraTrocarGas(atendente);
        cozinheiro.pedirPraTrocarGas(almoxarife);

    }

}
