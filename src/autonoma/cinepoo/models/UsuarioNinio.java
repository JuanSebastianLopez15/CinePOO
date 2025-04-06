package autonoma.cinepoo.models;


public class UsuarioNinio extends Usuario {
    public UsuarioNinio() {
        super(500f);
    }

    @Override
    public float calcularValorDescuento(float porcentaje) {
        return valorDeDescuento;
    }
}
