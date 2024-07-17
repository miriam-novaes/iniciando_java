package cap.semana1;
 import java.util.Scanner;
public class alunoMedia {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("");
    System.out.println("Digite o seu nome:");
    String nome = leitor.nextLine();
    System.out.println("Digite a sua primeira nota:");
    float nu1 = leitor.nextFloat();
    System.out.println("Digite a sua segunda nota:");
    float nu2 = leitor.nextFloat();
    System.out.println("Digite a sua terceira nota:");
    float nu3 = leitor.nextFloat();

    double media = (nu1 + nu2 + nu3) / 3;

    if (media >= 7) {
      System.out.println("Parabéns " + nome + " voçê foi aprovada com a média " + media);
    } else 
    if (media >= 5.1 && media <= 6.9) {
      System.out.println("Ainda não foi dessa vez " + nome + " voçê ficou de recuperação com a média " + media);
    } else 
    if (media <= 5){
      System.out.println("Infelismente " + nome + " voçê foi reprovada com a média " + media);
    }
      
    }

  }
