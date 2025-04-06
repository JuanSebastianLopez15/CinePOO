package autonoma.taquilladelcine.models;
import autonoma.taquilladelcine.exceptions.EntradaCineMenorCeroException;

/**
 * Creación de la clase Boleta
 * 
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class Boleta {
    
    /**
    * Función ingresada en la boleta
    */
    private Funcion funcion;
    
    /**
    * Usuario ingresado en la boleta
    */
    private Usuario usuario;
    
    /**
    * Película ingresada en la boleta
    */
    private Pelicula pelicula;
    
    
    /**
    * Método constructor de la clase Boleta
    *
    * @param     funcion    Instancia de una función para saber el porcentaje de descuento
    * @param     usuario    Instancia de un usuario para saber el valor de descuento
    * @param     pelicula   Instancia de una película para saber el costo base
    * @since     06042025
    */
    public Boleta(Funcion funcion, Usuario usuario, Pelicula pelicula) {
        this.funcion = funcion;
        this.usuario = usuario;
        this.pelicula = pelicula;
    }

    /**
    * Este método se encarga de calcular el precio total de la boleta teniendo en cuenta los debidos descuentos
    *
    * @return    El resultado del precio total de la boleta
    * @exception EntradaCineMenorCeroException
    *            Se lanza esta excepción si el resultado es menor a 0
    * @since     06042025
    */
    public float calcularPrecio() throws EntradaCineMenorCeroException {
        float costoBase = pelicula.getCostoBase();
        float descuentoFuncion = funcion.getPorcentajeDeDescuento();
        float precioConDescuentoFuncion = costoBase * (1 - descuentoFuncion);
        float descuentoUsuario = usuario.getValorDeDescuento();
        float resultado = precioConDescuentoFuncion - descuentoUsuario;
        if(resultado < 0){
            throw new EntradaCineMenorCeroException();
        }
        else{
            return resultado;
        }
    }
}
