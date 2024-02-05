package Ejercicio6;
import java.util.Scanner;

public class CantidadNumeros {
  public static void  main(String[] args) {
      
    Scanner sc = new Scanner(System.in);

    int n;
    int contador=0;

    do{
        System.out.println("dime un numero");
        n=sc.nextInt();
        contador++;

    }while (n>=0);

  }  
}
