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
	
    public static Funciones instancia = null;
    public static Graph grafo = new SingleGraph("usuarios");
    private int milisegundos = 0, segundos = 0, minutos = 0, horas = 0;
    public static int priority_high = 0;
    public static int priority_medium = 1000;
    public static int priority_low = 10000;
    public Timer timer;
   
    public Funciones() {
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
        Integer count = 0;

        try {
            fr = new FileReader(Reservas);
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                String arreglo[] = linea.split(",");
	count++;
                if (arreglo.length >= 2) {
                    if (!arreglo[0].equalsIgnoreCase("usuario")) {
                        try {
                            String prioridad = arreglo[1].split("_")[1].toUpperCase();
                            System.out.println(prioridad);
                            crear_usuario(prioridad, arreglo[0]);
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
    
    public void Cronometro1() {

    

        timer = new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                segundos++;
            }
            });
        timer.start();
    }
    
    
    public int obtenerTiempoActualMinutos() {
        return minutos;
    }	  
    
    
    public String actualizarEtiquetaTiempo() {
        String texto = String.valueOf(this.segundos) + "s";
        return texto;
    }
    public int obtenerTiempoActualSegundos() {
        return segundos;
    }
    
    public void crear_usuario(String prioridad, String nombre) {
        
      if (prioridad.equals("ALTA")){
                                Usuario u = new Usuario(nombre, priority_high);
                                Proyecto2.simulacion.agregarUsuario(u.getUsuario(), u.getPrioridad());
                                priority_high++;
                            }if (prioridad.equals("MEDIA")){
                                Usuario u = new Usuario(nombre, priority_medium);
                                Proyecto2.simulacion.agregarUsuario(u.getUsuario(), u.getPrioridad());
                                priority_medium++;
                            }if (prioridad.equals("BAJA")){
                                  Usuario u = new Usuario(nombre, priority_low);
                                Proyecto2.simulacion.agregarUsuario(u.getUsuario(), u.getPrioridad());
                                priority_low++;
                              }
}
			 
    
}
