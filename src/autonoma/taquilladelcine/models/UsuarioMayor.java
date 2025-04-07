package autonoma.taquilladelcine.models;
/**
 * Clase que representa a un usuario de la tercera edad del cine.
 * Hereda de la clase Usuario y define comportamiento específico para mayores.
 * 
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class UsuarioMayor extends Usuario {
    /**
     * Constructor que crea un usuario mayor con descuento inicial de 1000
     * @since 06042025
     */
    public UsuarioMayor() {
        super(1000f);
    }
    /**
     * Calcula el valor de descuento para el usuario mayor
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
