package autonoma.taquilladelcine.models;

/**
 * Creación de la clase Pelicula
 * Esta clase representa una película que se encuentra disponible en el cine.
 * Contiene información sobre el título y el costo base de la película.
 * 
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class Pelicula {

    /**
    * Título de la película
    */
    private String titulo;

    /**
    * Costo base de la película
    */
    private float costoBase;

    /**
    * Método constructor de la clase Pelicula
    *
    * @param     titulo       Título de la película
    * @param     costoBase    Costo base de la película
    * @since     06042025
    */
    public Pelicula(String titulo, float costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    /**
    * Este método retorna el título de la película
    *
    * @return    Título de la película
    * @since     06042025
    */
    public String getTitulo() {
        return titulo;
    }

    /**
    * Este método retorna el costo base de la película
    *
    * @return    Costo base de la película
    * @since     06042025
    */
    public float getCostoBase() {
        return costoBase;
    }
}
