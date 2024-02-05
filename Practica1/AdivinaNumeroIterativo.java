package Practica1;

import java.util.Scanner;


public class AdivinaNumeroIterativo {
    int N;

    void ingresaNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero a divinar:");
        N= sc.nextInt();
        sc.close();

    }

    boolean comparaNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero para ver si adivinas:");
        int x = sc.nextInt();
        sc.close();
        if (x == N)
          return true;
          else{
            if (x > N)
                System.out.println("Tu numero es mayor.");
            else
                System.out.println("Tu numero es menor.");
            return false;
        }
    }
        public static void main(String[] args) { 
            AdivinaNumeroIterativo ani = new AdivinaNumeroIterativo();
            ani.ingresaNumero();
            boolean comparativa;
            do{
                comparativa = ani.comparaNumero();
            }
            while (!comparativa);
        }
            
}

