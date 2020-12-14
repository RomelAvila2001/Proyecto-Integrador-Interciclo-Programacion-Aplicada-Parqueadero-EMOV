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
public class Contrato implements Serializable {
    private int codigo;
    private Cliente cliente;
    private Sitio Sitio;
    private Calendar fechaInicio;
    private Calendar fechaFinal;
    private String estadoPago;
    private double valorAPagar;

    public Contrato() {
    }

    public Contrato(int codigo) {
        this.codigo = codigo;
    }

    public Contrato(int codigo, Cliente cliente, Sitio Sitio, Calendar fechaInicio, Calendar fechaFinal, String estadoPago, double valorAPagar) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.Sitio = Sitio;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estadoPago = estadoPago;
        this.valorAPagar = valorAPagar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sitio getSitio() {
        return Sitio;
    }

    public void setSitio(Sitio Sitio) {
        this.Sitio = Sitio;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
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
        final Contrato other = (Contrato) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contrato{" + "codigo=" + codigo + ", cliente=" + cliente + ", Sitio=" + Sitio + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", estadoPago=" + estadoPago + ", valorAPagar=" + valorAPagar + '}';
    }  
}
