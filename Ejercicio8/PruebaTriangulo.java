package Ejercicio8;

public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

    triangulo.base = 5;
    triangulo.altura = 8;
    
    System.out.println("base: " + triangulo.base);
    System.out.println("base: " + triangulo.altura);
    //metodo de area sobrecargado
    System.out.println("area()->"+ triangulo.area());
    System.out.println("area(6, 2)->"+ triangulo.area(6, 2));
    System.out.println("area(5.5f, 3.2f )->"+ triangulo.area(5.5f, 3.2f ));   

    }
}
