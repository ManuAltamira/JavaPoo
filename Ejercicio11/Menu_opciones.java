package Ejercicio11;

import java.util.Scanner;

public class Menu_opciones {
    public static void main(String[] args) {
         
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
         
        while(!salir){
             
            System.out.println("1. area de un circulo");
            System.out.println("2. perimetro de un paralelogramo");
            System.out.println("3. obtener x");
            System.out.println("4. Salir");
             
            System.out.println("Eliga una de las opciones anteriores");
            opcion = sn.nextInt();
             
            switch(opcion){
                case 1:
                    System.out.println("1---calcular area de un circulo");
                   
                    java.util.Scanner valor = new java.util.Scanner(System.in);
                    double radio, area;
                    System.out.print("Ingrese el radio del circulo: ");
                    radio = valor.nextInt();
                    area = 3.14159*(radio*radio);
                    System.out.printf("El área del circulo es: %f",area);
                   

                    break;
                case 2:
                    System.out.println("2---Cálculo del perímetro de un paralelogramo");

                    int numero1;
                    int numero2;
                    System.out.println("Por favor ingresa el valor de un lado");
                    numero1 = sn.nextInt();
                    System.out.println("Por favor ingresa la altura");
                    numero2 = sn.nextInt();
                    System.out.println("El area de tu paralelogramo es " + (numero1 * numero2));

                    break;
                 case 3:
                    System.out.println("3---Encontrar la x en una fórmula de primer grado"); 
                   
                /*    java.util.Scanner valor = new java.util.Scanner(System.in);
                *   int x,a,b;
                *   System.out.println("Ingrsa el valor de A: ");
                *   a= valor.nextInt();
                *   System.out.println("Ingresa el valor de b: ");
                *   b= valor.nextInt();
                *    if(a !=0){
                *    x= -b/a;
                *    System.out.println("Solucion imposible");
             
                *   }else if (b !=0){
                *   System.out.println("Solucion imposible");
             
                *    }else{
                *    System.out.println ("Solucion indeterminada");
                *    }
                */    
                    
                    break;
                 case 4:
                    salir=true;
                    break;
                 default:
        
            }
             
        }
         
     }
      
 }
