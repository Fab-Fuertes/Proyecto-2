/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2;

import proyecto.Interfaz.InterfazPrincipal;
import proyecto.Estructuras.*;
import proyecto.Funciones.*;
import javax.swing.Timer;

/**
 *
 * @author fabys
 */
public class Proyecto2 {

    public static Lista<Usuario> lista_usuarios = new Lista<Usuario>();
    public static Funciones funciones = Funciones.getInstancia();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfazPrincipal objeto = new InterfazPrincipal();
        objeto.setVisible(true);
        
    }

}
