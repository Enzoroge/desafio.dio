import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    ContaBancaria conta = new ContaBancaria();
    System.out.print("Por favor digite o numero da conta: ");
    conta.setNumero(sc.nextInt());
    sc.nextLine();
    System.out.print("Agência: ");
    String agenciaStr = sc.nextLine();
    int agencia = Integer.parseInt(agenciaStr);
    conta.setAgencia(agenciaStr);
    System.out.print("Nome: ");
    conta.setNomeCliente(sc.nextLine());
    System.out.print("Saldo: ");
    conta.setSaldo(sc.nextDouble());
    
    System.out.println(conta);
    

	}

}
