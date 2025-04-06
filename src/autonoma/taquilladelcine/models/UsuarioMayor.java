package autonoma.taquilladelcine.models;

public class UsuarioMayor extends Usuario {
    public UsuarioMayor() {
        super(1000f);
    }

    @Override
    public float calcularValorDescuento(float porcentaje) {
        return valorDeDescuento;
    }
}
