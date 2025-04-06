/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.taquilladelcine.models;

/**
 *
 * @autor Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since 5042025
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombre;
    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Funcion> funciones = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();
    private List<Factura> facturas = new ArrayList<>();
    private int siguienteIdFactura = 1;

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    public void agregarFuncion(Funcion f) {
        funciones.add(f);
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void registrarVenta(Venta v) {
        ventas.add(v);
    }

    public Factura generarFactura() {
        Factura factura = new Factura(siguienteIdFactura++);
        for (Venta v : ventas) {
            factura.agregarVenta(v);
        }
        factura.calcularTotal();
        facturas.add(factura);
        return factura;
    }
}
