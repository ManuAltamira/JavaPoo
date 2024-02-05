package Ejercicio11;

public class Menu {

    public static void main( String[] args )
 
    {
       java.util.Scanner valor = new java.util.Scanner(System.in);
       double radio, area;
       System.out.print("Ingrese el radio del circulo: ");
       radio = valor.nextInt();
       area = 3.14159*(radio*radio);
       System.out.printf("El área del circulo es: %f",area);
       valor.close();
    }
    
}
