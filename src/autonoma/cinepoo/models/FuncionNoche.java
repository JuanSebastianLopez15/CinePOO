package autonoma.cinepoo.models;

public class FuncionNoche extends Funcion {
    public FuncionNoche() {
        super(0.0f);
    }

    @Override
    public float calcularPorcentajeDescuento(float porcentaje) {
        return porcentajeDeDescuento;
    }
}

