package cap.semana1;

import java.util.Scanner;

public class produto {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    for (int i = 1; i <= 40; i ++ ) {
        System.out.println("Qual o preço do seu produto?");
        double custo = leitor.nextDouble();
        
        System.out.println("Qual e o preço da venda do seu produto?");
        double venda = leitor.nextDouble();
  
          if (custo == venda) {
            System.out.println("O valor de compra do seu pro produto e " + custo + " R$. o valor de venda e " + venda + " R$");
            System.out.println("Venda do mesmo valor da compra. Empate!");
          } else 
              if(venda > custo){
               double lucro = venda - custo;
               System.out.println("O valor de compra do seu pro produto e " + custo + " R$. o valor de venda e " + venda + " R$");
               System.out.println("Você teve um lucro de " + lucro + " R$");
            }else{
               double preju = custo - venda;
               System.out.println("O valor de compra do seu pro produto e " + custo + " R$. o valor de venda e " + venda + " R$");
               System.out.println("Voçê teve um prejuizo de " + preju + " R$");
        }
    }
  }
}
