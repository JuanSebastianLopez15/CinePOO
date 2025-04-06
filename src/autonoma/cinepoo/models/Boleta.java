package autonoma.cinepoo.models;

public class Boleta {
    private Funcion funcion;
    private Usuario usuario;
    private Pelicula pelicula;

    public Boleta(Funcion funcion, Usuario usuario, Pelicula pelicula) {
        this.funcion = funcion;
        this.usuario = usuario;
        this.pelicula = pelicula;
    }

    public float calcularPrecio() {
        float base = pelicula.getCostoBase();
        float descFunc = funcion.getPorcentajeDeDescuento();
        float precioConDescFunc = base * (1 - descFunc);
        float descUsu = usuario.getValorDeDescuento();
        float resultado = precioConDescFunc - descUsu;
        return Math.max(resultado, 0f);
    }
}
