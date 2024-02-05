Crear la clase Coche cuyas instancias mantienen el nombre del coche y su precio (antes de impuestos). El precio total de un coche se calcula aplicando un IVA al precio marcado. Este IVA puede variar (por defecto el IVA es del 16%), pero será siempre el mismo para todos los coches. Proporcionar métodos para cambiar el IVA, calcular el precio total y mostrar el coche como cadena de caracteres con el formato <nombre> -> <precio_total>.

Un coche importado es un coche para el que además del IVA aplicamos un impuesto de homologación. El impuesto es específico de cada vehículo, y será dado en el momento de su creación. El precio total del coche importado se calcula como el de cualquier coche, pero ahora hay que sumar este nuevo impuesto. Crear la clase CocheImportado para mantener información de coches importados.

Prueba las clases con la siguiente clase de prueba:

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
        System.out.println("Con IVA de 18%);

        for (Coche c : cs) {
            System.out.println(c);
        }
    }
}