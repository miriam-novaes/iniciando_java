package cap.semana1;
 import java.util.Scanner;
public class saida {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um número de 1 a 5:");
    int resp = leitor.nextInt();
    switch (resp) {
      case 1:
        System.out.println("voçê digitou o numero um");
        break;

        case 2:
        System.out.println("voçê digitou o numero dois");
        break;

        case 3:
        System.out.println("voçê digitou o numero três");
        break;

        case 4:
        System.out.println("voçê digitou o numero quatro");
        break;

        case 5:
        System.out.println("voçê digitou o numero cinco");
        break;
    
      default:
       System.out.println("número inválido");
        break;
    }
  }
}
