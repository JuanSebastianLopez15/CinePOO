package autonoma.taquilladelcine.models;

import autonoma.taquilladelcine.exceptions.EntradaCineMenorCeroException;
import java.util.ArrayList;
import java.util.List;

/**
 * Creación de la clase Venta
 * Esta clase representa una venta realizada en el cine.
 * Una venta está compuesta por una o varias boletas, y tiene un precio total.
 * 
 * @author      Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since       05042025
 * @version     1.0
 */
public class Venta {

    /**
    * Lista de boletas asociadas a la venta
    */
    private List<Boleta> boletas = new ArrayList<>();

    /**
    * Precio total de la venta
    */
    private float precioTotal;

    /**
    * Este método se encarga de agregar una boleta a la lista de boletas
    *
    * @param     boleta    Instancia de la clase Boleta que se va a agregar a la venta
    * @since     05042025
    */
    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    /**
    * Este método se encarga de calcular el precio total de la venta
    * sumando el valor de todas las boletas.
    *
    * @return    Precio total de la venta
    * @since     05042025
    */
    public float calcularPrecioTotal() {
        float total = 0f;
        for (Boleta b : boletas) {
            total += b.calcularPrecio();
        }
        precioTotal = total;
        return precioTotal;
    }

    /**
    * Este método retorna la lista de boletas de la venta.
    * Si alguna boleta tiene un precio negativo, lanza una excepción.
    *
    * @return    Lista de boletas
    * @
    * EntradaCineMenorCeroException Si alguna boleta tiene precio menor a cero
    * @since     05042025
    */
    public List<Boleta> getBoletas() throws EntradaCineMenorCeroException {
        for (Boleta boleta : boletas) {
            if (boleta.calcularPrecio() < 0) {
                throw new EntradaCineMenorCeroException();
            }
        }
        return boletas;
    }

    /**
    * Este método retorna el precio total de la venta
    *
    * @return    Precio total de la venta
    * @since     05042025
    */
    public float getPrecioTotal() {
        return precioTotal;
    }
}