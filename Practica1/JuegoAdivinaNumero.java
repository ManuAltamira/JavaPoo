package Practica1;
import java.io.PrintStream;
import java.util.Scanner;


public class JuegoAdivinaNumero {

    public static void main(String[] args) {
        int r=(int)Math.random() * 100;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame tu numero:");
        int x =sc.nextInt();

        if(x == r)
        System.out.println("¡Adivinaste!");
        else if (x < r)
        System.out.println("Te quedaste corto por" +(r-x));
        else 
        System.out.println("Te pasaste por" +(x-r)); 

        System.out.println("¡Dame otro nombre");
        x = sc.nextInt();

        if(x == r)
        System.out.println("¡Adivinaste!");
        else
        System.out.println("perdiste:(");
    }
}
