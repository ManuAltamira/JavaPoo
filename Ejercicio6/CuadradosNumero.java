/*
 * CuadradosNumero.java
 * 
 * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
 * negativo.
 */

package Ejercicio6;

import java.util.Scanner;

public class CuadradosNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un número:");
        int numero = sc.nextInt();
        
        while (numero >= 0) {
            int resultado = (int)Math.pow(numero,2);
            System.out.println("El cuadrado del número " + numero + " es " + resultado);

            System.out.println("Escribe otro número:");
            numero = sc.nextInt();
        }

        sc.close();
    }
}
