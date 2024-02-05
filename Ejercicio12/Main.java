package Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno alumno;
        Estudios estudios;
        Fecha fecha;

        System.out.println("Bienvenido al Cardex de alumnos.");
        System.out.println("Ingrese la matricula: ");
        String matricula = sc.next();
        sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (dd mm yyyy): ");
        fecha = new Fecha( sc.nextInt(), sc.nextInt(), sc.nextInt() );
        sc.nextLine();
        System.out.println("Ingrese la carrera: ");
        String carrera = sc.nextLine();
        System.out.println("Ingrese la abreviatura de la carrera: ");
        String abrev_carrera = sc.next();
        System.out.println("Ingrese el grado: ");
        int grado = sc.nextInt();
        System.out.println("Ingrese el grupo: ");
        char grupo = sc.next().charAt(0);
        System.out.println("Ingrese la modalidad: ");
        String modalidad = sc.next();
        System.out.println("Ingrese la abreviatura de la modalidad: ");
        String abrev_modalidad = sc.next();
        System.out.println("Ingrese el campus: ");
        String campus = sc.next();
        System.out.println("Ingrese la abreviatura del campus: ");
        String abrev_campus = sc.next();
        estudios = new Estudios(carrera,abrev_carrera,grado,grupo,modalidad,abrev_modalidad,campus,abrev_campus);
        alumno = new Alumno(matricula,nombre,fecha,estudios);

        System.out.println("Impresión del Cardex de alumnos.");
        System.out.println("Ficha de Cardex");
        alumno.imprimirFicha();
        System.out.println("Datos de Cardex");
        alumno.imprimirDatos();
    }
}
