package Ejercicio9;

public class EjCoches {
    public static void main(String[] args) {
        Coche[] cs = {
            new Coche("Seat Panda", 15000),
            new CocheImportado("Ferrari T-R", 65000, 8000),
            new Coche("Sear Toledo", 21000),
            new CocheImportado("Jaguar XK", 41000, 6000),
            new CocheImportado("Porche GT3", 44000, 7000)
        };

        for (Coche c : cs) {
            System.out.println(c);
        }

        //Cambiamos el iva a todos los coches
        Coche.setPiva(0.18);
        System.out.println("Con IVA de 18%");

        for (Coche c : cs) {
            System.out.println(c);
        }
    }
}