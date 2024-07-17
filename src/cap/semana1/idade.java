package cap.semana1;
import java.util.Scanner;
public class idade {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
  
    
    for (int i = 0; i <= 75; i++) {
        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();

        if (idade >= 18) {
          System.out.println(" voçê ja e a maior de idade");
        } else {
          System.out.println(" voçê ainda e menor de idade");
        }
    }
  }
}
