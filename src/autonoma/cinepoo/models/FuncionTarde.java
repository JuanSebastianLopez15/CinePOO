package autonoma.cinepoo.models;

public class FuncionTarde extends Funcion {
    public FuncionTarde() {
        super(0.10f);
    }

    @Override
    public float calcularPorcentajeDescuento(float porcentaje) {
        return porcentajeDeDescuento;
    }
}

