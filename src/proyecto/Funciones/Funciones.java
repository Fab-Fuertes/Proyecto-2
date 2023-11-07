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
				if (arreglo.length >= 1) {
					if (arreglo[0].equalsIgnoreCase("usuario")){
				}else{
					Usuario u = new Usuario(arreglo[0], arreglo[1]);
					Proyecto2.lista_usuarios.InsertLast(u);

					}

				}else{
					continue;
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
