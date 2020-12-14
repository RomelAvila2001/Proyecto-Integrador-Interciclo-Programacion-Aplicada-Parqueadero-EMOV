/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Administrador;

/**
 *
 * @author NANCY
 */
public class ControladorAdministrador {
    Administrador administrador = new Administrador("a", "123", 1, "0567123489", "Juan", "Mendez");
    
    public Administrador iniciarSesion(String correo, String contrase){
        if (administrador.getCorreo().equals(correo) && administrador.getContraseña().equals(contrase)) {
            return administrador;
        }
        return null;
    }
}
