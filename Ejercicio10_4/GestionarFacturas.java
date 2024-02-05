package Ejercicio10_4;

public class GestionarFacturas {
    int numero_facturas;
    int indice_factura;
    Factura[] factura;
    float monto_total;

    public GestionarFacturas(int numero_facturas) {
        this.numero_facturas = numero_facturas;
        indice_factura = 0;
        factura = new Factura[numero_facturas];
        monto_total = 0;
    }
    void ingresaFactura(Factura factura) {
        if (indice_factura < numero_facturas)
            this.factura[indice_factura++] = factura;
    }
    void calculaMontoTotal() {
        monto_total = 0;
        for (int i=0; i<numero_facturas; i++)
            monto_total += factura[i].monto_vendido;
    }
    void actualizaMontoTotal(Factura factura) {
        monto_total += factura.monto_vendido;
    }
    float obtenerMontoTotal() {
        return monto_total;
    }
    float litrosVendidosPorArticulo(Articulo articulo) {
        float litros = 0;
        for (int i=0; i<numero_facturas; i++)
            for (int j=0; j<factura[i].numero_articulos; j++)
                if (factura[i].articulo[j].equals( articulo ))
                    litros += factura[i].cantidad_vendida[j];
        return litros;
    }
    int cantidadFacturasDeMontoSuperior(float monto) {
        int cantidad = 0;
        for (int i=0; i<numero_facturas; i++)
            if (factura[i].monto_vendido > monto)
                cantidad++;
        return cantidad;
    }
}
