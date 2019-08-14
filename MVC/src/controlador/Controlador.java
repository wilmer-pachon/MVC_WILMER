/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Modelo.Lista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import vista.Vistas2;

/**
 *
 * @author wilme
 */
public class Controlador implements ActionListener{
    
  private Lista list;
  private Vistas2 Vist;
  
  /**
   * Este metodo añade los elementos en la lista y los visualiza
   * @param list lista reuqerida para mostrar
   * @param Vist La vista y sus resultados
   */
  public Controlador(Lista list,Vistas2 Vist){
      
      this.list = list;
      this.Vist = Vist;
      this.Vist.btnInsertar.addActionListener(this);
  }

  
   /**
    * Este metodo realiza la accion del boton
    * @param e envia las variables nombre y apellido y las obtiene
    */
    public void actionPerformed(ActionEvent e) {
      
        list.setNombre(Vist.nombreCT.getText());
        list.setApellido(Vist.apellidoCT.getText());
        Vist.nombreMos.setText(list.getNombre());
        Vist.ApellidoMost.setText(list.getApellido());
    }
  
  
   
  
}
