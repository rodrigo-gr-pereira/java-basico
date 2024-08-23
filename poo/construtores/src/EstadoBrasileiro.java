
public enum EstadoBrasileiro {
    SAO_PAULO("SP","São Paulo", 11),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piaui", 13),
    MARANHAO("MA", "Maranhao", 14);

    private String nome;
    private String sigla;
    private int ibge;


   

    EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
        //TODO Auto-generated constructor stub
    }

    public int getIbge() {
        return ibge;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
