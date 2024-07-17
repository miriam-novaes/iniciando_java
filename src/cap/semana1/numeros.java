package cap.semana1;
import java.util.Scanner;
public class numeros {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite um número:");

    double numero = leitor.nextDouble();

    if (numero < 80 && numero > 25 || numero == 40) {
       System.out.println("acertou");
    } else {
      System.out.println("errou");
    }
  }
}
