public class Escola {

    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
        //felipe.nome="Felipe";
        //felipe.idade = 8;

        //System.out.println("O aluno " + felipe.nome + " tem " +felipe.idade+ " anos.");
        //RESULTADO NO  CONSOLE
        //O aluno felipe tem 8 anos.
    }
}
