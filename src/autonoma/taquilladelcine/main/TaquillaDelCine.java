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
 * Clase principal que inicia la aplicación de la taquilla del cine.
 * Contiene el método main para ejecutar el flujo básico de ventas.
 * 
 * @author Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since 05042025
 * @version 1.0
 */
public class TaquillaDelCine {
    /**
     * Punto de entrada principal para la aplicación de taquilla de cine.
     * Demuestra el flujo básico de:
     * -Creación de instancias de cine, película y función
     * -Registro de elementos en el cine
     * -Proceso de venta con boletas
     * -Generación e impresión de factura
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Cine cine = new Cine("Mi Cine");
        Pelicula pelicula = new Pelicula("Matrix", 10000f);
        cine.agregarPelicula(pelicula);

        Funcion primeraFuncion = new PrimeraFuncion();
        cine.agregarFuncion(primeraFuncion);

        Usuario usuarioNinio = new UsuarioNinio();
        cine.agregarUsuario(usuarioNinio);

        Boleta boleta = new Boleta(primeraFuncion, usuarioNinio, pelicula);
        Venta venta = new Venta();
        venta.agregarBoleta(boleta);
        venta.calcularPrecioTotal();
        cine.registrarVenta(venta);

        Factura factura = cine.generarFactura();
        factura.imprimirFactura();
    }
}