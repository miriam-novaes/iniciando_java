package cap.semana1;
 import java.util.Scanner;
public class conversao {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    
    float valorEmDolar = leitor.nextFloat();
    float cotacao = leitor.nextFloat();
    float valorEmReal = valorEmDolar * cotacao;

    System.out.println(" voçê recebera em real " + valorEmReal + " R$");
  }
}
