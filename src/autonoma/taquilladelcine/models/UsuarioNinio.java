package autonoma.taquilladelcine.models;
/**
 * Clase que representa a un usuario niño del cine.
 * Hereda de la clase Usuario y define comportamiento específico para menores.
 * 
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class UsuarioNinio extends Usuario {
    /**
     * Constructor que crea un usuario niño con descuento inicial de 500
     * @since 06042025
     */
    public UsuarioNinio() {
        super(500f);
    }
    /**
     * Calcula el valor de descuento para el usuario niño
     * 
     * @param   porcentaje  Porcentaje de descuento
     * @return              Valor actual del descuento
     * @since               06042025
     */
    @Override
    public float calcularValorDescuento(float porcentaje) {
        return valorDeDescuento;
    }
}
