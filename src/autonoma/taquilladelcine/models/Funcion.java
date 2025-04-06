package autonoma.taquilladelcine.models;

/**
 * Creación de la clase abstracta Funcion
 *
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public abstract class Funcion {
    /** Porcentaje de descuento de la función */
    protected float porcentajeDeDescuento;

    /**
     * Constructor de la clase Funcion
     *
     * @param porcentajeDeDescuento  Porcentaje de descuento fijo
     * @since 06042025
     */
    public Funcion(float porcentajeDeDescuento) {
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }

    /**
     * Retorna el porcentaje de descuento de la función
     *
     * @return Porcentaje de descuento
     * @since 06042025
     */
    public float getPorcentajeDeDescuento() {
        return porcentajeDeDescuento;
    }

    /**
     * Calcula el porcentaje de descuento (método polimórfico)
     *
     * @return Porcentaje de descuento específico
     * @since 06042025
     */
    public abstract float calcularPorcentajeDescuento();
}