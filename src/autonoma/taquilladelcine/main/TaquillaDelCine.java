package autonoma.taquilladelcine.main;

import autonoma.taquilladelcine.models.Boleta;
import autonoma.taquilladelcine.models.Cine;
import autonoma.taquilladelcine.models.Factura;
import autonoma.taquilladelcine.models.Funcion;
import autonoma.taquilladelcine.models.Pelicula;
import autonoma.taquilladelcine.models.PrimeraFuncion;
import autonoma.taquilladelcine.models.Usuario;
import autonoma.taquilladelcine.models.UsuarioNinio;
import autonoma.taquilladelcine.models.Venta;

/**
 *
 * @autor Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since 5042025
 * @version 1.0
 */
public class TaquillaDelCine {
    public static void main(String[] args) {
        Cine cine = new Cine("Mi Cine");
        Pelicula p1 = new Pelicula("Matrix", 10000f);
        cine.agregarPelicula(p1);

        Funcion f1 = new PrimeraFuncion();
        cine.agregarFuncion(f1);

        Usuario u1 = new UsuarioNinio();
        cine.agregarUsuario(u1);

        Boleta b1 = new Boleta(f1, u1, p1);
        Venta venta = new Venta();
        venta.agregarBoleta(b1);
        venta.calcularPrecioTotal();
        cine.registrarVenta(venta);

        Factura factura = cine.generarFactura();
        factura.imprimirFactura();
    }
}