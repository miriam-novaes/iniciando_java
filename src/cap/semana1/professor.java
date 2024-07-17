package cap.semana1;

import java.util.Scanner;

public class professor {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    float nivel1 = 12.00f;
    float nivel2 = 17.00f;
    float nivel3 = 25.00f;
    double salario = 0.0;

    System.out.println("Olá professor, quantas horas trabalhadas?");
    double horas = leitor.nextDouble();
    System.out.println("Qual nivel 1 , 2 ou 3?");
    int nivel = leitor.nextInt();

    switch (nivel) {
      case 1:
        salario = horas * nivel1;
        System.out.println("Seu salário sera de " + salario + " R$");
        break;

        case 2:
        salario = horas * nivel2;
        System.out.println("Seu salário sera de " + salario + " R$");
        break;

        case 3:
        salario = horas * nivel3;
        System.out.println("Seu salário sera de " + salario + " R$");
        break;
    
      default:
      System.out.println("Informações inválidas");
        break;
    }
  }
}
