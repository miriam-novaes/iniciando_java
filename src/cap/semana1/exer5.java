package cap.semana1;
  import java.util.Scanner;
public class exer5 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int nu1 = leitor.nextInt();
    int nu2 = leitor.nextInt();

    if (nu1 > nu2) {
      System.out.println(nu1 + " e maior que " + nu2);
    } else {
      System.out.println(nu2 + " e maior que " + nu1);
    }

    
  }
}
