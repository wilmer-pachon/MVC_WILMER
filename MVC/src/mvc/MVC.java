/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Modelo.Lista;
import controlador.Controlador;
import vista.Vistas2;

/**
 *
 * @author wilme
 */
public class MVC {

    /**Este es la clase principal
     * @param args define los argumentos iniciales
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vistas2 v = new Vistas2();
        Lista lis = new Lista();
       
        Controlador co = new Controlador (lis,v);
        v.setVisible(true);
    }
    
}
