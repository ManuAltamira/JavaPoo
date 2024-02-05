package Ejercicio1;

public class variables {
   
  public static void main(String[] args) {
    int entero = 0;
    char caracter = ' ';
    String cadena = "";
    
    System.out.println("Entero: "+entero);
    System.out.println("Caracter: "+caracter);
    System.out.println("Cadena: "+cadena);

    String cadena2 = cadena;

        int distancia1 = 2;
        int distancia2 = 4;
        int distancia3 = 6;
        //...
        int distancia10 = 50;

        int distancia[] = {2,4,6,8,10,20,25,30,40,50};
        System.out.println("Distancia: "+distancia[2]);

        int[] altura = new int[5];
        altura[0] = 18;
        altura[1] = 25;
        altura[2] = 32;
        altura[3] = 54;
        altura[4] = 63;
        System.out.println("Altura: "+altura[2]);

        final double PIm;
        PIm = 3.1416;
        //PIm = 2.9726;
        final double PI = 3.1416;
       // PI = 2.9726;
        System.out.println("PI: "+PIm);
        System.out.println("PI: "+PI);
  }
}

