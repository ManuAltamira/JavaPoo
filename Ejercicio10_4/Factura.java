package Ejercicio10_4;

public class Factura {
    int numero_articulos;
    int indice_articulos;
    Articulo[] articulo;
    float[] cantidad_vendida;
    float monto_vendido;

    public Factura(int numero_articulos) {
        this.numero_articulos = numero_articulos;
        indice_articulos = 0;
        articulo = new Articulo[numero_articulos];
        cantidad_vendida = new float[numero_articulos];
    }
    void ingresaArticulo(Articulo articulo, float cantidad) {
        if (indice_articulos < numero_articulos) {
            this.articulo[indice_articulos] = articulo;
            cantidad_vendida[indice_articulos++] = cantidad;
        }
    }
    void calculaMontoVendido() {
        monto_vendido = 0;
        for (int i=0; i<numero_articulos; i++)
            monto_vendido += articulo[i].precio * cantidad_vendida[i];
    }
}