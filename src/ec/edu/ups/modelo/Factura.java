/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 *
 * @author NANCY
 */
public class Factura implements Serializable {
    private int numero;
    private Calendar fechaYHoraDeIngreso;
    private Calendar fechaYHoraDeSalida;
    private String estado;
    private double total;
    private Cliente cliente;
    private Sitio sitio;

    public Factura() {
    }

    public Factura(int numero) {
        this.numero = numero;
    }

    public Factura(int numero, Calendar fechaYHoraDeIngreso, String estado, Cliente cliente, Sitio sitio) {
        this.numero = numero;
        this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
        this.estado = estado;
        this.cliente = cliente;
        this.sitio = sitio;
    }

    public Factura(int numero, Calendar fechaYHoraDeIngreso, Calendar fechaYHoraDeSalida, String estado, double total, Cliente cliente, Sitio sitio) {
        this.numero = numero;
        this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
        this.fechaYHoraDeSalida = fechaYHoraDeSalida;
        this.estado = estado;
        this.total = total;
        this.cliente = cliente;
        this.sitio = sitio;
    }

    

    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getFechaYHoraDeIngreso() {
        return fechaYHoraDeIngreso;
    }

    public void setFechaYHoraDeIngreso(Calendar fechaYHoraDeIngreso) {
        this.fechaYHoraDeIngreso = fechaYHoraDeIngreso;
    }

    public Calendar getFechaYHoraDeSalida() {
        return fechaYHoraDeSalida;
    }

    public void setFechaYHoraDeSalida(Calendar fechaYHoraDeSalida) {
        this.fechaYHoraDeSalida = fechaYHoraDeSalida;
    }

    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sitio getSitio() {
        return sitio;
    }

    public void setSitio(Sitio sitio) {
        this.sitio = sitio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numero;
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
        final Factura other = (Factura) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", fechaYHoraDeIngreso=" + fechaYHoraDeIngreso + ", fechaYHoraDeSalida=" + fechaYHoraDeSalida + ", estado=" + estado + ", total=" + total + ", cliente=" + cliente + ", sitio=" + sitio + '}';
    }

}
