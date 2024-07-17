package cap.semana1;
import  java.util.Scanner;
public class exer1 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("digite o seu nome");
    String nome = leitor.nextLine();

    System.out.println("digite o valor do seu salario");
    float salario = leitor.nextFloat();
    System.out.println("digite o valor em dinheiro das suas vendas esse mes");
    float valorVendas = leitor.nextFloat();
    float comissão = (15 * valorVendas)/100;
    float salarioFinal = salario + comissão;

    System.out.println("ola " + nome + " seu sálario fixo e " + salario + " com sua comissão desse mes seu salario final foi " + salarioFinal);
    
  }
}
