package cap.semana1;

import java.util.Scanner;

public class carros {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int ate2 = 12;
    int mais2 = 7;
    double valor = 0;
    double desconto = 0;
    double total = 0;
    String continuar = "s";
    int veiculo = 0;
    int total2 = 0;
    int totalGeral = 0;

    do {
      System.out.println("Qual valor do seu veiculo?");
      valor = leitor.nextDouble();
      System.out.println("Qual ano do seu veiculo?");
      veiculo = leitor.nextInt();
      if ( veiculo < 2000) {
        desconto = (valor * ate2) / 100;
        total = valor - desconto;
        System.out.println("Voçê recebera o desconto no valor de " + desconto + " R$. E o seu veiculo ficará no valor de " + total + " R$");
        total2++;
      } else {
        desconto = (valor * mais2) / 100;
        total = valor - desconto;
        System.out.println("Voçê recebera o desconto no valor de " + desconto + " R$. E o seu veiculo ficará no valor de " + total + " R$");
      }
      totalGeral++;
      System.out.println("Deseja continuar?");
      continuar = leitor.next();
    } while (!continuar.equalsIgnoreCase("n"));
  
    System.out.println("Voçê verificou desconto para " + total2 + " veiculos com ano anterior a 2000 e verificou no total " + totalGeral + " veiculos.");
  }
}
