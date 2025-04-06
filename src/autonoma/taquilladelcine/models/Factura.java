/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquilladelcine.models;

/**
 *
 * @autor Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since 5042025
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int idFactura;
    private List<Venta> ventas = new ArrayList<>();
    private float valorTotal;

    public Factura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void agregarVenta(Venta v) {
        ventas.add(v);
    }

    public float calcularTotal() {
        float total = 0f;
        for (Venta v : ventas) {
            total += v.getPrecioTotal();
        }
        valorTotal = total;
        return valorTotal;
    }

    public String generarDetalleFactura() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura #: ").append(idFactura).append("\n");
        for (Venta v : ventas) {
            sb.append("Venta -> Total: ").append(v.getPrecioTotal()).append("\n");
        }
        sb.append("Total Factura: ").append(valorTotal).append("\n");
        return sb.toString();
    }

    public void imprimirFactura() {
        System.out.println(generarDetalleFactura());
    }
}
