package autonoma.cinepoo.models;

public class UsuarioAdulto extends Usuario {
    public UsuarioAdulto() {
        super(0f);
    }

    @Override
    public float calcularValorDescuento(float porcentaje) {
        return valorDeDescuento;
    }
}
