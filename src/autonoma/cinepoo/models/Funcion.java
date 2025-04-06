package autonoma.cinepoo.models;

public abstract class Funcion {
    protected float porcentajeDeDescuento;

    public Funcion(float porcentajeDeDescuento) {
        this.porcentajeDeDescuento = porcentajeDeDescuento;
    }

    public abstract float calcularPorcentajeDescuento(float porcentaje);
    public float getPorcentajeDeDescuento() {
        return porcentajeDeDescuento;
    }
}
