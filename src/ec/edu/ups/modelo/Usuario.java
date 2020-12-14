/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author NANCY
 */
public class Usuario extends Persona implements Serializable{
    private String correo;
    private String contraseña;
    
    public static Usuario instance;

    private Usuario() {
    }

    private Usuario(String correo, String contraseña, int codigo, String cedula, String nombre, String apellido, Calendar fechaNacimiento) {
        super(codigo, cedula, nombre, apellido, fechaNacimiento);
        this.correo = correo;
        this.contraseña = contraseña;
    }

    private Usuario(String correo) {
        this.correo = correo;
    }
    
    
    public static Usuario getInstance(){
        if(Usuario.instance==null){
            Constructor<Usuario> constructor;
            try{
                constructor=Usuario.class.getDeclaredConstructor();
                constructor.setAccessible(true);
                
                Usuario usuario=constructor.newInstance();
                
                Usuario.instance=usuario;
            }catch(Exception e){
                e.printStackTrace();
            }
            return Usuario.instance;
        }
        return Usuario.instance;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.correo);
        hash = 23 * hash + Objects.hashCode(this.contraseña);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+"Usuario{" + "correo=" + correo + ", contraseña=" + contraseña + '}';
    }
}
