/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author wilme
 */
 
public class Lista {
  
    private String nombre;
    private String apellido;

    
    
    public String getNombre() {
        return nombre;
    }
  
    
    /**
     * Este metodo obtiene el valor nombre en forma String
     * @param nombre envia el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    /**
     * Este metodo obtiene el valor nombre en forma String
     * @param apellido  envia el apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    

}
