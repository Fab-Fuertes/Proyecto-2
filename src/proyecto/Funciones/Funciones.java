/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Funciones;

import proyecto.Estructuras.*;
import proyecto.pkg2.Proyecto2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto.Estructuras.Prioridad;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.graphstream.ui.view.Viewer;
import org.graphstream.algorithm.ConnectedComponents;
import java.util.Random;

/**
 *
 * @author truenno
 */
public class Funciones {
	
    private static Funciones instancia = null;
    public static Graph grafo = new SingleGraph("usuarios");
    private int milisegundos = 0, segundos = 0, minutos = 0, horas = 0;

    private Funciones() {
    }

    public static Funciones getInstancia() {
        if (instancia == null) {
            instancia = new Funciones();
        }
        return instancia;
    }

    public void leer_txt(File Reservas) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(Reservas);
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                String arreglo[] = linea.split(",");
                if (arreglo.length >= 2) {
                    if (!arreglo[0].equalsIgnoreCase("usuario")) {
                        try {
                            String prioridad = arreglo[1].split("_")[1].toUpperCase();
                            Usuario u = new Usuario(arreglo[0], Prioridad.valueOf(prioridad));
                            Proyecto2.lista_usuarios.InsertLast(u);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Prioridad no válida para el usuario: " + arreglo[0]);
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Los usuarios se han cargado correctamente.");
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
   
   
    
    public void Cronometro() {
        milisegundos++;
        if (milisegundos == 100) {
            segundos++;
            milisegundos = 0;
            
        }
        if (segundos == 60) {
            minutos++;
            segundos = 0;
        }
        if (minutos == 60) {
            horas++;
            minutos = 0;
        }
        if (horas == 24) {
            horas = 0;
        }
    }

    public String actualizarEtiquetaTiempo() {
        String texto = (horas <= 9 ? "0" : "") + horas + ":" + (minutos <= 9 ? "0" : "") + minutos + ":" + (segundos <= 9 ? "0" : "") + segundos + ":" + (milisegundos <= 9 ? "0" : "") + milisegundos;
        return texto;
    }
    
    
    public int obtenerTiempoActualMinutos() {
        return minutos;
    }
 
    public void mostrar_usuarios() {
	    for( Nodo_Lista<Usuario> pAux =  Proyecto2.lista_usuarios.getpFirst(); pAux != null; pAux = pAux.getpNext()) {
		    String usuario = pAux.getData().getUsuario();
		    Prioridad prioridad = pAux.getData().getPrioridad();
		    String usuario_insertar = "Usuario: " + usuario + " \nPrioridad: " + prioridad;
		    grafo.addNode(usuario_insertar);
		    for(Nodo_Lista<Documento> pAux_documento = pAux.getData().getDocumentos().getpFirst(); pAux_documento != null; pAux_documento = pAux_documento.getpNext()) {
			    String nombre = pAux_documento.getData().getNombre();
			    int size = pAux_documento.getData().getTamaño();
			    String tipo = pAux_documento.getData().getTipo();
			    String documento_insertar = "Nombre: " + nombre + "\nTamaño: " + size + "\nTipo: " + tipo;
			    grafo.addNode(documento_insertar);
			    grafo.addEdge(usuario_insertar+documento_insertar, usuario_insertar, documento_insertar);
		    }
		    
		    
	    }
			    System.setProperty("org.graphstream.ui.renderer",
                    "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
			    grafo.display();
    }
}
