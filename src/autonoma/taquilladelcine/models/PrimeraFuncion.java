package autonoma.taquilladelcine.models;

/**
 * Clase que representa la primera función del día en el cine.
 * Se utiliza cuando se desea aplicar un descuento del 20% a las boletas.
 * 
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class PrimeraFuncion extends Funcion {

    /**
     * Constructor de la clase PrimeraFuncion.
     * Establece el porcentaje de descuento para esta función en 20% (0.20f).
     * 
     * @since 06042025
     */
    public PrimeraFuncion() {
        super(0.20f);
    }

    /**
     * Retorna el porcentaje de descuento definido para la primera función.
     *
     * @return Porcentaje de descuento para la primera función (0.20f).
     * @since 06042025
     */
    @Override
    public float calcularPorcentajeDescuento() {
        return porcentajeDeDescuento;
    }
}