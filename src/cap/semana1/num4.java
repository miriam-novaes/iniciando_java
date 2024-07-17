package cap.semana1;

import java.util.Scanner;

public class num4 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
  

  int numeros = 0;
  int quant = 0;

  for (int i = 1; i <= 80; i++) {
      System.out.println("Digite um número:");
      numeros = leitor.nextInt();
      
      if (numeros > 10 && numeros < 150) {
        quant++;
      }
  }

   System.out.println("Voçê digitou " + quant + " números no intervalo");
 }
}
