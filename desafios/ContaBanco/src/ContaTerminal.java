
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu numero: ");
        int numero = scanner.nextInt();
  
        System.out.print("Digite sua Agencia: ");
        String agencia  = scanner.next();
        scanner.nextLine();

        System.out.print("Digite seu  nome: ");
        String nome  = scanner.nextLine();

        System.out.print("Saldo: ");
        float saldo = scanner.nextFloat();





  
        System.out.println("Olá [" + nome + "],obrigado por criar uma conta em nosso banco, sua agência é [" + agencia + "],conta["+numero+"]e seu saldo [" +saldo+"] já está disponível para saque.");
  
        scanner.close();

    }
}
