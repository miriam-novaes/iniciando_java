package cap.semana1;
import java.util.Scanner;
public class prestacoes {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o valor da sua compra:");
    double valorCompra = leitor.nextDouble();
    double result = valorCompra / 5;

    System.out.println("As suas prestações ficaram em 5 parcelas de " + result + " R$ sem jurus.");
  }
}
