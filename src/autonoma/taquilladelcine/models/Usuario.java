package autonoma.taquilladelcine.models;

public abstract class Usuario {
    protected float valorDeDescuento;

    public Usuario(float valorDeDescuento) {
        this.valorDeDescuento = valorDeDescuento;
    }

    public abstract float calcularValorDescuento(float porcentaje);
    public float getValorDeDescuento() {
        return valorDeDescuento;
    }
}
