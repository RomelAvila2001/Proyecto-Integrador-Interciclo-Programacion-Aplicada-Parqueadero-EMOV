/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Sitio;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class ControladorSitio extends Controlador<Sitio>{
    
    public ControladorSitio(String ruta) {
        super(ruta);
    }
    
    public void crearSitios(){
        var listaSitios=(List<Sitio>) getListaGenerica();
        int numero=0;
        
        while(numero<61){
            numero++;
            Sitio sitio= new Sitio(String.valueOf(numero), "Libre", null);
            listaSitios.add(sitio);
        }
        guardarDatos(listaSitios);
    }
    
}


