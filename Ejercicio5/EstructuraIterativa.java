package Ejercicio5;

import java.util.Scanner;

public class EstructuraIterativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el número límite de la iteración:");
        int limite = sc.nextInt();

        for (int i = 0; i < limite; i++) {
            System.out.println("Iteración for = " + i);
        }

        int i = 0;
        do {
            System.out.println("Iteración do-while = " + i);
            i++;
        }
        while (i < limite);

        i = 0;
        while (i < limite) {
            System.out.println("Iteración while = " + i);
            i++;
        }
    }
}