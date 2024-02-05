package Ejercicio9;

public class Coche{
    String nombre;
    double precio;
    static double PIVA;

   public Coche(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        PIVA = 0.16;
    }
    public static void setPiva(double PIVA) {
        Coche.PIVA = PIVA;
    }
    public double precioTotal(){
        return precio+(precio*PIVA);
    }    
    public String toString(){
        return nombre + " -> " + precioTotal();
    }    
}