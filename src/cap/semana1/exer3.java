package cap.semana1;
  import java.util.Scanner;
public class exer3 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int nu1 = 2;
    int nu2 = 5;
    int recipiente;
    recipiente = nu1;
    nu1 = nu2;
    nu2 = recipiente;

    System.out.println();
    System.out.println(nu1);
    System.out.println(nu2);
  }
}
