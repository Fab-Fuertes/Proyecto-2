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

/**
 *
 * @author truenno
 */
public class Funciones {

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
					if (!arreglo[0].equalsIgnoreCase("usuario")){
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
}