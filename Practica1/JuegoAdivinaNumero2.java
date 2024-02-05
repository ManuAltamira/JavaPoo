package Practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoAdivinaNumero2 {public static Scanner entrada=new Scanner(System.in);
 
	public static void main(String[] args) {
		System.out.println("Juego de adivinar un numero");
		System.out.println("---------------------------");
 
		// Obtenemos el valor aleatorio entre el 1 y el 100
		int numero=(int)(Math.random()*100);
 
		System.out.println("Indica un numero entre el 0 y el 100");
 
		int entrada=-1;
		int contador=0;
 
		// bucle hasta que el usuario adivine el numero
		do {
 
			// Obtenemos un nuevo valor
			entrada=obtenerValor();
			if(entrada>numero) {
				System.out.println("El numero es menor");
			}else if(entrada<numero) {
				System.out.println("El numero es mayor");
			}
			contador++;
		} while(entrada!=numero);
 
		System.out.println("Has avariguado el numero en " + contador + " intentos.");
	}
 
	public static int obtenerValor() {
		int valor=0;
 
		// Iniciamos un bucle infinito
		while(true){
			try {
				System.out.print("Indica el numero: ");
				valor=entrada.nextInt();
 
				// revisamos que el valor introducido este comprendido entre el 0 y el 100
				if(valor<0 || valor>100) {
					System.out.println("El numero tiene que estar entre el 0 y el 100");
				}else{
					// salimos del bucle
					break;
				}
			}
			catch(InputMismatchException e) {
				// Controlamos que siempre introduzca un valor numerico
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
			}
		}
		return valor;
	}
 
}
    
