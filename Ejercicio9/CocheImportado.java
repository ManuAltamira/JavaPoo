package Ejercicio9;

public class CocheImportado extends Coche{
    double hosmologacion;

    public CocheImportado (String nombre, double precio, double homologacion) {
        super(nombre,precio);
        this.hosmologacion = homologacion;
    }
    public double precioTotal(){
        return precio + (precio*PIVA)+hosmologacion;
    }   
}
