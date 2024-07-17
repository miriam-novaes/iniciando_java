package cap.semana1;
  import  java.util.Scanner;
public class para{

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    

    for(int i = 0; i <= 10; i++){

      int nu = ler.nextInt();
    if (nu >= 100 && nu <= 200){
      System.out.print("numero no intervalo entre 100 e 200");
    }else{
      System.out.print("numero não esta no intervalo entre 100 e 200");
    }
  }
  }

}