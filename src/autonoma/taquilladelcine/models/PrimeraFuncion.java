package autonoma.taquilladelcine.models;

public class PrimeraFuncion extends Funcion {
    public PrimeraFuncion() {
        super(0.50f);
    }

    @Override
    public float calcularPorcentajeDescuento(float porcentaje) {
        return porcentajeDeDescuento;
    }
}

