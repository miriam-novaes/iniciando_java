package cap.semana1;
 import java.util.Scanner;
public class valorVenda {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    double valorCusto = leitor.nextDouble();
    double percentual = leitor.nextDouble();
    double acrescimo = (valorCusto * percentual) / 100;
    double valorSaida = valorCusto + acrescimo;
    System.out.println(" O valor de venda do seu produto será de " + valorSaida + " R$");
  }
}
