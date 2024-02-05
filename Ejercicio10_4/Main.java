package Ejercicio10_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GestionarFacturas gestionar_factura;
        Factura factura;
        Articulo articulo, articulo1 = new Articulo();
        int numero_facturas;
        int numero_articulos;
        
        System.out.println("Indique el número de facturas: ");
        numero_facturas = sc.nextInt();
        gestionar_factura = new GestionarFacturas(numero_facturas);

        for (int i=0; i<numero_facturas; i++) {
            System.out.println("Factura "+(i+1)+": ");
            System.out.println("Indique la cantidad de artículos: ");
            numero_articulos = sc.nextInt();
            factura = new Factura(numero_articulos);

            for (int j=0; j<numero_articulos; j++) {
                System.out.println("Artículo "+(j+1)+":");
                articulo = new Articulo();
                
                System.out.println("Indique el código: ");
                articulo.ingresaCodigo( sc.next() );
                System.out.println("Indique el precio: ");
                articulo.ingresaPrecio( sc.nextFloat() );

                System.out.println("Indique la cantidad de litros: ");
                factura.ingresaArticulo(articulo, sc.nextFloat() );

                if (i==0 && j==0)
                    articulo1 = articulo;
            }

            factura.calculaMontoVendido();
            gestionar_factura.ingresaFactura(factura);
            gestionar_factura.actualizaMontoTotal(factura);
        }

        System.out.println("Monto total de las "+(numero_facturas)+" facturas: "+gestionar_factura.obtenerMontoTotal() );
        System.out.println("Cantidad de litros vendidos del artículo 1: "+gestionar_factura.litrosVendidosPorArticulo(articulo1) );
        System.out.println("¿Cuántas facturas se emitieron de más de $600? "+gestionar_factura.cantidadFacturasDeMontoSuperior(600) );
    }
}