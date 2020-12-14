/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author NANCY
 */
public class Sitio implements Serializable{
    private String numero;
    private String estado;
    private Vehiculo vehiculo;

    public Sitio() {
    }

    public Sitio(String numero) {
        this.numero = numero;
    }

    public Sitio(String numero, String estado, Vehiculo vehiculo) {
        this.numero = numero;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.numero);
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
        final Sitio other = (Sitio) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sitio{" + "numero=" + numero + ", estado=" + estado + ", vehiculo=" + vehiculo + '}';
    }
    
    
}
