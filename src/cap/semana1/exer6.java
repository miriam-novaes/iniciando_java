package cap.semana1;
 import java.util.Scanner;
public class exer6 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int c = leitor.nextInt();
    int f = (9*c+160) / 5;
    System.out.println(" A temperatura em graus Fahrenheit e " + f);
  }
}
