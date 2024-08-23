public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Rodrigo", "12334556677");


        //definimos o endereco de marcos
        marcos.setEndereco("Rua das marias");

        // e como definir o nome e cof de marcos ?

        //imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
