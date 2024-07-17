package cap.semana1;

import java.util.Scanner;

public class carrango {
  /**
   * @param args
   * @param b
   */
  public static void main(String[] args, boolean b) {
    Scanner leitor = new Scanner(System.in);

    int alcool = 25;
    int gasolina = 21;
    int diesel = 14;
    String combustivel = "";

    double valor = 0;
    double desconto = 0;
    double total = 0;
    
    int totalDesconto = 0;
    int totalPago = 0;

    do {
      System.out.println("Qual valor do seu veiculo?");
      valor = leitor.nextDouble();
      System.out.println("Qual o combustivel do seu veiculo?");
      combustivel = leitor.next();
      if ( "alcool".equals(combustivel)) {
        desconto = (valor * alcool) / 100;
        total = valor - desconto;
        System.out.println("Voçê recebera o desconto no valor de " + desconto + " R$. E o seu veiculo ficará no valor de " + total + " R$");
       totalDesconto++;
       totalPago = (int) (totalPago + total);
      } else 
      if("gasolina".equals(combustivel)){
        desconto = (valor * gasolina) / 100;
        total = valor - desconto;
        System.out.println("Voçê recebera o desconto no valor de " + desconto + " R$. E o seu veiculo ficará no valor de " + total + " R$");
        totalDesconto++;
        totalPago = (int) (totalPago + total);
      }else 
      if("diesel".equals(combustivel)){
        desconto = (valor * diesel) / 100;
        total = valor - desconto;
        System.out.println("Voçê recebera o desconto no valor de " + desconto + " R$. E o seu veiculo ficará no valor de " + total + " R$");
        totalDesconto++;
        totalPago = (int) (totalPago + total);
      }
      
    } while (valor == 0);

    System.out.println("Total de descontos: " + totalDesconto + " R$");
    System.out.println("Total pago: " + totalPago + " R$");
  
  }
}

  

