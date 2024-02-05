/*
 * MiPrimerEjercicio.java
 * Crear un programa que solicite nombre, año de nacimiento, y 3 calificaciones de éste cuatrimestre
 * para poder realizar las siguientes operaciones:
 * - Saber la edad que tiene actualmente.
 * - Obtener el promedio del periodo.
 * - Saber si su calificación es reprobatoria.
 */
package Ejercicio3;

import java.util.Scanner;

public class MiPrimerEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
System.out.println("¿Como te llamas?:");
        //String nombre = sc.next();
        String nombre = sc.nextLine();
        System.out.println("¿En que año naciste?:");
        //String año = sc.next();
        int año = sc.nextInt();
        System.out.println("Dime tu calificacion de matematicas:");
        //String cal1 = sc.next();
        int cal1 = sc.nextInt();
System.out.println("Dime tu calificacion de diseño grafico:");
        //String cal2 = sc.next();
        int cal2 = sc.nextInt();
        System.out.println("Dime tu calificacion de poo:");
        //String cal3 = sc.next();
        int cal3 = sc.nextInt();

int  edad=2021-año;
        //String edad = sc.next();
        System.out.println("Entonces tienes "+edad+", ¿cierto?");

        float prom=(cal1+cal2+cal3) / 3;
        //String prom = sc.next();
        System.out.println("Tu promedio es "+prom++);
    }    

}
    

