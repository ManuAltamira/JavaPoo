package Ejercicio10_1;

import java.util.Scanner;

public class Alumnos22Promedio {
    int TOTAL_ALUMNOS = 22;
    float CALIFICACION_APROBATORIA = 6.5f;
    int TOTAL_NOTAS = 3;

    float leerCalificacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la calificación: ");
        float calificacion = sc.nextFloat();
        sc.close();
        return calificacion;
    }
    float calculaNotaDefinitiva(float calif1, float calif2, float calif3) {
        return (calif1+calif2+calif3)/3;
    }
    String verificaEstado(float calificacion) {
        if (calificacion >= CALIFICACION_APROBATORIA)
            return "Aprobado";
        else
            return "Reprobado";
    }
    void imprimeNotaFinal(float calificacion, String estado) {
        System.out.println("El alumno obtuvo de nota final: "+calificacion);
        System.out.println("Su estado es: "+estado);
    }
    public static void main(String[] args) {
        Alumnos22Promedio ap = new Alumnos22Promedio();
        for (int i=0; i<ap.TOTAL_ALUMNOS; i++) {
            float nota = ap.calculaNotaDefinitiva(
                ap.leerCalificacion(),
                ap.leerCalificacion(),
                ap.leerCalificacion()
            );
            String estado = ap.verificaEstado(nota);
            ap.imprimeNotaFinal(nota, estado);
        }
    }
}
