package cap.semana1;
 import java.util.Scanner;
public class num3 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
    int nu1 = leitor.nextInt();
    System.out.println("Digite o segundo número:");
    int nu2 = leitor.nextInt();
    System.out.println("Digite o terceiro número:");
    int nu3 = leitor.nextInt();

    int maior = 0;
    int meio = 0;
    int menor = 0;

    if (nu1 > nu2 && nu1 > nu3){
      maior = nu1;
    } else if (nu1 < nu2 && nu1 < nu3) {
      menor = nu1;
    }else{
      meio = nu1;
    }

    if (nu2 > nu1 && nu2 > nu3){
      maior = nu2;
    } else if (nu2 < nu1 && nu2 < nu3) {
      menor = nu2;
    }else{
      meio = nu2;
    }

    if (nu3 > nu2 && nu3 > nu1){
      maior = nu3;
    } else if (nu3 < nu2 && nu3 < nu1) {
      menor = nu3;
    }else{
      meio = nu3;
    }

    System.out.println(menor);
    System.out.println(meio);
    System.out.println(maior);
  }
}
