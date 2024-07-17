package cap.semana1;

import java.util.Scanner;

public class nadador {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Qual a sua idade?");
   int idade = leitor.nextInt();

   if (idade >= 5 && idade <= 7) {
    System.out.println("Infantil A");
   } else 
   if(idade >= 8 && idade <= 10){
    System.out.println("Infantil B");
   }else 
   if(idade >= 11 && idade <= 13){
    System.out.println("Junvenil A");
   }else 
   if (idade >= 14 && idade <= 17) {
    System.out.println("Juvenil B");
   }else 
   if (idade >= 18 && idade <= 25) {
    System.out.println("Sênior");
   }else{
    System.out.println("Idade fora da faix etária");
   }
  }
}
