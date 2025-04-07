package autonoma.taquilladelcine.models;
/**
 * Clase abstracta que representa a un usuario del cine.
 * 
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */

public abstract class Usuario {
    /**
     * Valor de descuento que tiene el usuario aplicable a las compras
     */
    protected float valorDeDescuento;
    
    /**
     * Método constructor para inicializar un usuario con su descuento
     * 
     * @param   valorDeDescuento  Valor del descuento inicial del usuario
     * @since   06042025
     */

    public Usuario(float valorDeDescuento) {
        this.valorDeDescuento = valorDeDescuento;
    }
    /**
     * Método abstracto para calcular el valor de descuento del usuario según un porcentaje
     * 
     * @param   porcentaje    Porcentaje a aplicar para el cálculo del descuento
     * @return                Valor del descuento calculado
     * @since                 06042025
     */
    public abstract float calcularValorDescuento(float porcentaje);
    /**
     * Obtiene el valor actual del descuento del usuario
     * 
     * @return  Valor actual del descuento del usuario
     * @since   06042025
     */
    public float getValorDeDescuento() {
        return valorDeDescuento;
    }
}
