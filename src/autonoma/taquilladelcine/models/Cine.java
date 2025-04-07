package autonoma.taquilladelcine.models;

import autonoma.taquilladelcine.exceptions.EntradaCineMenorCeroException;
import java.util.ArrayList;
import java.util.List;

/**
 * Creación de la clase Cine
 *
 * @author      Juan Sebastian Lopez Guzman y Cristian Camilo Salazar Arenas
 * @since       06042025
 * @version     1.0
 */
public class Cine {
    /** Nombre del cine */
    private String nombre;
    /** Lista de películas activas en el cine */
    private List<Pelicula> peliculas;
    /** Lista de tipos de funciones en el cine */
    private List<Funcion> funciones;
    /** Lista de usuarios registrados en el cine */
    private List<Usuario> usuarios;
    /** Lista de ventas realizadas en el cine */
    private List<Venta> ventas;
    /** Lista de facturas generadas en el cine */
    private List<Factura> facturas;
    /** Atributo que asigna un id único a cada factura */
    private int siguienteIdFactura = 1;

    /**
     * Constructor de la clase Cine
     *
     * @param nombre  Nombre del cine
     * @since 06042025
     */
    public Cine(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
        this.funciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.facturas = new ArrayList<>();
    }

    /**
     * Agrega una película al cine
     *
     * @param pelicula  Instancia de Pelicula a agregar
     * @since 06042025
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    /**
     * Agrega una función al cine
     *
     * @param funcion  Instancia de Funcion a agregar
     * @since 06042025
     */
    public void agregarFuncion(Funcion funcion) {
        funciones.add(funcion);
    }

    /**
     * Agrega un usuario al cine
     *
     * @param usuario  Instancia de Usuario a agregar
     * @since 06042025
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Registra una venta en el cine. Valida el precio total de la venta
     * y lanza excepción si alguna boleta es inválida.
     *
     * @param venta  Instancia de Venta a registrar
     * @since 06042025
     */
    public void registrarVenta(Venta venta) {
        try {
            venta.calcularPrecioTotal();
            ventas.add(venta);
            System.out.println("Venta registrada con exito.");
        } catch (EntradaCineMenorCeroException e) {
            System.out.println("Error al registrar la venta: " + e.getMessage());
        }
    }

    /**
     * Genera una nueva factura con todas las ventas actuales
     *
     * @return Factura generada
     * @since 06042025
     */
    public Factura generarFactura() {
        Factura factura = new Factura(siguienteIdFactura++);
        for (Venta venta : ventas) {
            factura.agregarVenta(venta);
        }
        factura.calcularTotal();
        facturas.add(factura);
        return factura;
    }
}