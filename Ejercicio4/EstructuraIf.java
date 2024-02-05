package Ejercicio4;

public class EstructuraIf {
    public static void main(String[] args) {
        int a=5, b=2, c=8;

        // Declaración báse de If y Else

        if (a>b)
            System.out.println("1. Si");

        if (a>b) {
            System.out.println("2. Si");
            System.out.println("2. Otro");
        }

        if (a>b)
            System.out.println("3. Si");
        else
            System.out.println("3. No");

        if (a>b) {
            System.out.println("4. Si");
            System.out.println("4. Otro");
        }
        else {
            System.out.println("4. No");
            System.out.println("4. Otro");
        }

        // Declaración anidada de If
        
        if (a>b)
            System.out.println("5. Si");
        else
            if (b<c)
                System.out.println("5. SSi");
            else
                System.out.println("5. No");
        
        if (a>b)
            System.out.println("5.1. Si");
        else if (b<c)
            System.out.println("5.1. SSi");
        else
            System.out.println("5.1. No");

        if (a>b)
            if (b<c)
                System.out.println("6. Si");
            else
                System.out.println("6. No");
        else
            System.out.println("6. No");

        if (a>b && b<c)
            System.out.println("6.1. Si");
        else
            System.out.println("6.1. No");
    }
}
