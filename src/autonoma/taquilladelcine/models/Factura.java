package autonoma.taquilladelcine.models;

import java.util.ArrayList;

/**
 * Creación de la clase Factura
 *
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class Factura {
    /** Id único para cada factura */
    private int idFactura;
    /** Lista de todas las ventas incluidas en la factura */
    private ArrayList<Venta> ventas;
    /** Valor total de todas las ventas */
    private float valorTotal;

    /**
     * Constructor de la clase Factura
     *
     * @param idFactura  Id de la factura
     * @since 06042025
     */
    public Factura(int idFactura) {
        this.idFactura = idFactura;
        this.ventas = new ArrayList<>();
    }

    /**
     * Agrega una venta a la factura
     *
     * @param venta  Instancia de Venta a agregar
     * @since 06042025
     */
    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    /**
     * Calcula el total de todas las ventas
     *
     * @return Valor total de la factura
     * @since 06042025
     */
    public float calcularTotal() {
        float total = 0f;
        for (Venta venta : ventas) {
            total += venta.getPrecioTotal();
        }
        valorTotal = total;
        return valorTotal;
    }

    /**
     * Genera el detalle de la factura como texto
     *
     * @return Detalle de la factura
     * @since 06042025
     */
    public String generarDetalleFactura() {
        String detalle = "Factura #: " + idFactura + "\n";
        for (Venta venta : ventas) {
            detalle += "Venta -> Total: " + venta.getPrecioTotal() + "\n";
        }
        detalle += "Total Factura: " + valorTotal + "\n";
        return detalle;
    }

    /**
     * Imprime la factura por consola
     *
     * @since 06042025
     */
    public void imprimirFactura() {
        System.out.println(generarDetalleFactura());
    }
}