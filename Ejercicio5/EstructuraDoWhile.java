package Ejercicio5;

import java.util.Scanner;

public class EstructuraDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("MENU:");
            System.out.println("1. Opción Uno");
            System.out.println("2. Opción Dos");
            System.out.println("3. Opción Tres");
            System.out.println("0. Salir");
            System.out.println("Elige una opción:");
            do {
                opcion = sc.nextInt();
            }
            while (opcion<0 || opcion>3);
        }
        while (opcion != 0);

        System.out.println("Adios...");
    }
}