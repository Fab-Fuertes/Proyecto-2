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
/**
 *
 * @author truenno
 */
public class Funciones {
	
    private Timer tiempo;
    private int milisegundos = 0;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;

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
                            Usuario u = new Usuario(arreglo[0], Prioridad.valueOf(arreglo[1].toUpperCase()));
                            Proyecto2.lista_usuarios.InsertLast(u);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Prioridad no válida para el usuario: " + arreglo[0]);
                        }
                    }
                }
            }

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
            milisegundos ++;
            if(milisegundos == 100){
                segundos ++;
                milisegundos = 0;
            }
            if(segundos == 60){
                minutos ++;
                segundos= 0;
            }
            if(minutos == 60){
                horas ++;
                minutos = 0;
            }
            if(horas ==24){
                horas=0;
            }
            
            actualizarEtiquetaTiempo();
                
        }
        
    
	    
    private String actualizarEtiquetaTiempo(){
        String texto = (horas<= 9?"0":"")+horas+":"+(minutos<=9?"0":"")+minutos+":"+(segundos<=9?"0":"")+segundos+":"+(milisegundos<= 9?"0":"")+milisegundos ;
   	return texto;
    }
}
