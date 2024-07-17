package cap.semana1;
 import java.util.Scanner;
public class num2 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
    double nu1 = leitor.nextDouble();
    System.out.println("Digite o segundo número:");
    double nu2 = leitor.nextDouble();

   if (nu1 == nu2) {
    System.out.println("números inguais");
   } else if(nu1 > nu2){
    System.out.println("números diferentes, " + nu1 + " e maior que " + nu2);
   }else{
    System.out.println("números diferentes, " + nu2 + " e maior que " + nu1);
   }
  }
}
