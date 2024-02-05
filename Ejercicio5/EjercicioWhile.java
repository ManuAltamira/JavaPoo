package Ejercicio5;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String condicion = "";

        while ( !condicion.equals ("salir")) {
            System.out.println("HE ENTRADO EN UAN ITERACION.");

            condicion  = sc.nextLine();

            
        }

        System.out.println("HE LOGRADO SALIR.");
    }


    
}
