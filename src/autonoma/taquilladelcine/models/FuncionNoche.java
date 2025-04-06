package autonoma.taquilladelcine.models;

/**
 * Clase que representa una función nocturna en el cine.
 * No aplica descuentos (0%).
 *
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class FuncionNoche extends Funcion {

    /**
     * Constructor de la clase FuncionNoche.
     * Establece el descuento en 0.0f.
     *
     * @since 06042025
     */
    public FuncionNoche() {
        super(0.0f);
    }

    /**
     * Retorna el porcentaje de descuento (0%).
     *
     * @return porcentajeDeDescuento
     * @since 06042025
     */
    @Override
    public float calcularPorcentajeDescuento() {
        return porcentajeDeDescuento;
    }
}