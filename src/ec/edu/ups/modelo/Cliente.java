/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Calendar;


/**
 *
 * @author NANCY
 */
public class Cliente extends Persona implements Serializable {

    public Cliente(int codigo, String cedula, String nombre, String apellido, Calendar fechaNacimiento) {
        super(codigo, cedula, nombre, apellido, fechaNacimiento);
    }

    public Cliente(String cedula) {
        super(cedula);
    }
    
    
}
