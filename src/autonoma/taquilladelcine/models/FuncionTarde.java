package autonoma.taquilladelcine.models;

/**
 * Creación de la clase FuncionTarde
 * Representa una función de tarde con 10% de descuento.
 *
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class FuncionTarde extends Funcion {

    /**
     * Constructor de la clase FuncionTarde.
     * Establece el descuento en 0.10f.
     *
     * @since 06042025
     */
    public FuncionTarde() {
        super(0.10f);
    }

    /**
     * Retorna el porcentaje de descuento (10%).
     *
     * @return porcentajeDeDescuento
     * @since 06042025
     */
    @Override
    public float calcularPorcentajeDescuento() {
        return porcentajeDeDescuento;
    }
}