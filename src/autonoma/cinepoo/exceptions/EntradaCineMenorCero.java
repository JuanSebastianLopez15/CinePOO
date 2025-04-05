/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.cinepoo.exceptions;

/**
 *
 * @autor Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since 5042025
 * @version 1.0
 */
public class EntradaCineMenorCero extends RuntimeException {
    public EntradaCineMenorCero(){
        super("El valor de la entrada es menor a 0. Por favor, ingrese un valor igual o mayor a 0");
    }
}
