package Ejercicio5;

public class EstructuraFor {
    public static void main(String[] args) {
        int tabla = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", tabla, i, (tabla*i));
        }
    }
}