package autonoma.taquilladelcine.models;

public class Pelicula {
    private String titulo;
    private float costoBase;

    public Pelicula(String titulo, float costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getCostoBase() {
        return costoBase;
    }
}
