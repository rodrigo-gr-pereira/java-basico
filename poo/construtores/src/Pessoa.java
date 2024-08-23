public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }   
}

//....
//Setters de nome e cpf ?
