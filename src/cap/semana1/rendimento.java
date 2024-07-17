package cap.semana1;
import java.util.Scanner;
public class rendimento {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    ;
    System.out.println("");
    System.out.println("Qual valor do seu deposito ?");
    double valorDeposito = leitor.nextDouble();
    double jurus = 0.07;
    double valorComRendimento = (valorDeposito * jurus);
    Double result = valorDeposito + valorComRendimento;

    System.out.println("O valor depositado apos rendimento mensal de 0,07 será " + result + " R$");
  }
}
