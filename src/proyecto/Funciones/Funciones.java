/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Funciones;
import proyecto.Estructuras.*;
import proyecto.pkg2.Proyecto2;


/**
 *
 * @author truenno
 */
public class Funciones {
	
	public void leer_txt() {
		Usuario hola = new Usuario("truenno", "alta");
		Proyecto2.lista_usuarios.InsertLast(hola);
		Proyecto2.lista_usuarios.getpFirst().getData().print();
	}
}
