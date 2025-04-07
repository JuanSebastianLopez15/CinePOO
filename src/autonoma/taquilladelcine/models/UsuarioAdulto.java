package autonoma.taquilladelcine.models;
/**
 * Clase que representa a un usuario adulto del cine.
 * Hereda de la clase Usuario y define comportamiento específico para adultos.
 * 
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class UsuarioAdulto extends Usuario {
    /**
     * Constructor que crea un usuario adulto con descuento inicial cero
     * @since 06042025
     */
    public UsuarioAdulto() {
        super(0f);
    }
    /**
     * Calcula el valor de descuento para el usuario adulto.
     * En este tipo de usuario no se aplican descuentos adicionales.
     * 
     * @param   porcentaje  Porcentaje de descuento
     * @return              Valor actual del descuento sin modificaciones
     * @since               06042025
     */
    @Override
    public float calcularValorDescuento(float porcentaje) {
        return valorDeDescuento;
    }
}
