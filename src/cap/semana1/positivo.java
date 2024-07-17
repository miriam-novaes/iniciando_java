package cap.semana1;

import java.util.Scanner;

public class positivo {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int continuar = 1;
    double numero =0.0;

    while (continuar == 1) {
      System.out.println("Digite um número:");
      numero = leitor.nextDouble();

      if (numero > 0) {
        System.out.println("Positivo");
      } else if(numero < 0){
        System.out.println("Negativo");
      }else{
        System.out.println("Voçê digitou o numero 0");
      }

    System.out.println("Deseja continuar? 1/2");
    continuar = leitor.nextInt();
    }
  }
}
