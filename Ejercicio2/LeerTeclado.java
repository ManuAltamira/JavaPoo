package Ejercicio2;

import java.util.Scanner;

public class LeerTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        System.out.println("Por favor, dame tu nombre:");
        //String nombre = sc.next();
        String nombre = sc.nextLine();
        System.out.println("Hola "+nombre+", como estás.");
        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();
        //String edad = sc.next();
        System.out.println("Entonces tienes "+edad+", ¿cierto?");
        sc.close();
    }
}