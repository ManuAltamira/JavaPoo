package Ejercicio5;

import java.util.Scanner;

public class EstructuraWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String condicion = "";

        while ( !condicion.equals("salir") ) {
            System.out.println("He entrado en una iteración.");

            condicion = sc.nextLine();
        }

        System.out.println("He logrado salir.");
    }
}