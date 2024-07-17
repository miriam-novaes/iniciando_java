package cap.semana1;
  import java.util.Scanner;
public class exer2 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
  
    System.out.println("Digite seu nome:");
    String nome = leitor.nextLine();
 
    System.out.println("Digite sua primeira nota:");
    int nu1 = leitor.nextInt();
    System.out.println("Digite sua segunda nota:");
    int nu3 = leitor.nextInt();
    System.out.println("Digite sua terceira nota:");
    int nu2 = leitor.nextInt();
    float media = ((nu1 + nu2 + nu3) / 3);
   System.out.println(nome + " sua media foi " + media);

  }
}
