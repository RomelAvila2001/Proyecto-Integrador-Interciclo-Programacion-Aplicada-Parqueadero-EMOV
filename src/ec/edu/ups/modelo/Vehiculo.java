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
public class Vehiculo implements Serializable{
    private int codigo;
    private String color;
    private String marca;
    private String modelo;
    private String placa;
    private Cliente cliente;

    public Vehiculo() {
    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    
    public Vehiculo(int codigo, String color, String marca, String modelo, String placa, Cliente cliente) {
        this.codigo = codigo;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.placa);
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
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cliente=" + cliente + '}';
    }

}
