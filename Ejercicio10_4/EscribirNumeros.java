package Ejercicio10_4;

import java.util.Scanner;

public class EscribirNumeros {
    public static void main(String[] args) {
             
        Scanner teclado = new Scanner (System.in);

        int a = 100, r, n;

        System.out.print("Ingresa el número de sucesión: ");
        n = teclado.nextInt();

        for (int i = 100; i > 0; i-=n) {
            System.out.println(""+i);
            

        }
    }      
}   
//ฅ^•ﻌ•^ฅ jose manuel//
