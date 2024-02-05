package Ejercicio10_2;

import java.util.Scanner;

public class Arreglos {
    int TOTAL_ALUMNOS = 22;
    float CALIFICACION_APROBATORIA = 6.5f;
    int TOTAL_NOTAS = 3;

    float[][] alumnos_notas;
    float[] promedio_notas;
    String[] estado_notas;

    public Arreglos() {
        alumnos_notas = new float[TOTAL_ALUMNOS][TOTAL_NOTAS];
        promedio_notas = new float[TOTAL_ALUMNOS];
        estado_notas = new String[TOTAL_ALUMNOS];
    }

    void leerCalificacion() {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<TOTAL_ALUMNOS; i++) {
            System.out.println("Alumno "+(i+1));
            for (int j=0; j<TOTAL_NOTAS; j++) {
                System.out.println("Ingrese la calificación "+(j+1)+": ");
                alumnos_notas[i][j] = sc.nextFloat();
            }
        }
    }
    void calculaNotaDefinitiva() {
        for (int i=0; i<TOTAL_ALUMNOS; i++) {
            promedio_notas[i] = 0;
            for (int j=0; j<TOTAL_NOTAS; j++) {
                promedio_notas[i] += alumnos_notas[i][j];
            }
            promedio_notas[i] /= TOTAL_NOTAS;
        }
    }
    void verificaEstado() {
        for (int i=0; i<TOTAL_ALUMNOS; i++) {
            if (promedio_notas[i] >= CALIFICACION_APROBATORIA)
                estado_notas[i] = "Aprobado";
            else
                estado_notas[i] = "Reprobado";
        }
    }
    void imprimeNotaFinal() {
        for (int i=0; i<TOTAL_ALUMNOS; i++) {
            System.out.println("El alumno "+(i+1)+" obtuvo de nota final: "+promedio_notas[i]);
            System.out.println("Su estado es: "+estado_notas[i]);
        }
    }

    public static void main(String[] args) {
        Arreglos arr = new Arreglos();
        arr.leerCalificacion();
        arr.calculaNotaDefinitiva();
        arr.verificaEstado();
        arr.imprimeNotaFinal();
    }
}
