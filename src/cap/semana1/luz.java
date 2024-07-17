package cap.semana1;

import java.util.Scanner;
public class luz {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    double consumo = 0;
    double resi = 0.60;
    double comer = 0.48;
    double resultado = 0.0f;
    
    

    System.out.println("Residência ou Comércio? responda com 1 ou 2");
    int resp = leitor.nextInt();
    if (resp == 1) {
      System.out.println("Qual foi o consumo de energia da sua residencia");
       consumo = leitor.nextDouble();
       resultado = consumo * resi;
      System.out.println("A sua conta sera de " + resultado + " R$");
      
    } else if(resp == 2){
      System.out.println("Qual foi o consumo de energia do seu comércio");
       consumo = leitor.nextDouble();
      resultado = consumo * comer;
      System.out.println("A sua conta sera de " + resultado + " R$");
      
    }else{
      System.out.println("informação inválida");
    }
    
  }
}
