package cap.semana1;

import java.util.Scanner;

public class triangulo {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int menor1 = 0;
    int medio = 0;
    int maior = 0;
    
    System.out.println("Digite o primeiro valor:");
     int valor1 = leitor.nextInt();
     System.out.println("Digite o segundo valor:");
     int valor2 = leitor.nextInt();
     System.out.println("Digite o terceiro valor:");
     int valor3 = leitor.nextInt();

     if (valor1 > valor2 && valor1 > valor3) {
      maior = valor1;
     } else if (valor1 < valor2 && valor1 < valor3) {
      menor1 = valor1;
     } else{
      medio = valor1;
     }

     if (valor2 > valor1 && valor2 > valor3) {
      maior = valor2;
     } else if (valor2 < valor1 && valor2 < valor3) {
      menor1 = valor2;
     } else{
      medio = valor2;
     }

     if (valor3 > valor2 && valor3 > valor1) {
      maior = valor3;
     } else if (valor3 < valor2 && valor3 < valor1) {
      menor1 = valor3;
     } else{
      medio = valor3;
     }
      
    
     if (maior < (menor1 + medio)) {
         if (maior == menor1 && maior == medio ) {
          System.out.println("Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais");
         } else
           if (maior == menor1 || menor1 == medio || medio == maior) {
             System.out.println("Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.");
              System.out.println("Triângulo equilátero é também isóscele");
           } else 
           if(maior != menor1 && menor1 != medio && medio != maior) {
             System.out.println("Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes");
           }
     } else {
      System.out.println("Não pode ser um triângulo");
     }
  }
}
