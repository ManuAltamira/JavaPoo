package Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        OperacionesMatematicas om = new OperacionesMatematicas();
        char opcion;

        do {
            System.out.println("MENU:");
            System.out.println("1. Calcular el área de un círcuo.");
            System.out.println("2. Calcular el perimetro de un paralelogramo.");
            System.out.println("3. Resolver una ecuación de primer grado.");
            System.out.println("x. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.next().charAt(0);

        switch(opcion) {
            case '1':
                System.out.println("Ingrese el radio del circulo: ");
                System.out.println("El resultado es: " + om.areaCirculo( sc.nextFloat() ));
                break;
            case '2':
                System.out.println("Ingrese el lado a y b del paralelogramo: ");
                System.out.println("El resultado es: " + om.perimetroParalelogramo( sc.nextFloat(), sc.nextFloat() ));
                break;
            case '3':
                System.out.println("Dada la ecuación ax+b=c");
                System.out.println("Ingrese el coeficiente a, b y c: ");
                System.out.println("El resultado es: " + om.ecuacionPrimerGrado( sc.nextInt(), sc.nextInt(), sc.nextInt() ));
                break;
            case 'x':
                  System.out.println("Saliendo...");
                  break;
                default:
                System.out.println("Seleccióne una opción correcta.");
  
            }

        }
         while (opcion != 'x');
    }
}
