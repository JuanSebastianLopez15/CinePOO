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

public class Venta {
    private List<Boleta> boletas = new ArrayList<>();
    private float precioTotal;

    public void agregarBoleta(Boleta b) {
        boletas.add(b);
    }

    public float calcularPrecioTotal() {
        float total = 0f;
        for (Boleta b : boletas) {
            total += b.calcularPrecio();
        }
        precioTotal = total;
        return precioTotal;
    }

    public List<Boleta> getBoletas() {
        return boletas;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }
}
