package cap.semana1;
 import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        double euro = leitor.nextDouble();
        String nome = leitor.nextLine();

        System.out.println("");
        System.out.println("Qual seu nome ?");
        System.out.print("ola " + nome);
    }
}
