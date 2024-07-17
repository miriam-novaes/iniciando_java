package cap.semana1;
 import java.util.Scanner;
public class pessoas {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int totalF = 0;
    int totalh = 0;
    for (int i = 1; i <= 56; i++) {
        System.out.println("Qual seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Qual seu sexo? responda com f ou h");
        String sex = leitor.nextLine();

        switch (sex) {
          case "f":
          System.out.println(nome + " Voçê e uma mulher");
          totalF ++;
            break;
          case "h":
          System.out.println(nome + " Voçê e um homem");
          totalh ++;
             break;
          default:
          System.out.println("sexo inválido, digite novamente.");
            break;
        }
        
    }
     System.out.println("O total de mulheres foi " + totalF + ", e o total de homens foi " + totalh);
  }
}
