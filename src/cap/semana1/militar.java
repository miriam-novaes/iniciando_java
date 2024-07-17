package cap.semana1;
 import java.util.Scanner;
public class militar {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

     int resposta = 1;
     int totais = 0;
     String nome = "";
     int idade = 0;
     String sex = "";
     int saude = 1;


    while (resposta == 1) {

      System.out.println("digite seu nome:");
       nome = leitor.next();
      System.out.println("digite sua idade:");
       idade = leitor.nextInt();
      System.out.println("digite seu sexo:");
       sex = leitor.next();
      System.out.println("digite sua sáude:");
       saude = leitor.nextInt();

       if (idade >= 18 && saude == 1) {
          System.out.println(nome + " Voçê esta apto a cumprir o serviço militar obrigatório");
       } else {
        System.out.println(nome + " Infelismente voçê não esta apto a cumprir o serviço militar obrigatório");
       }

      System.out.println("Deseja continuar? 1/2");
      resposta = leitor.nextInt();
      totais++;
    }
    System.out.println(totais + " pessoas");
  }
}
