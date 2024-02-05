package Practica1;
import java.io.PrintStream;
import java.util.Scanner;

public class JuegoParImpar {

    /**
     *
     */
    private static final Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int numero;
        PrintStream out = System.out;
        out.println("introduzca un numero");
        numero = Scanner.nextInt();
    
        if(esPar(numero)){
            out.println("el numero"+numero+"el numero es par." );
        } else {
            out.println("el numero"+numero+"el numero es impar.");
        }
    } // if 
        public static boolean esPar( int numero){
          if( numero % 2 == 0 )
              return true;
          else{
              return false;
          }

}
}
