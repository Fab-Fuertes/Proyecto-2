/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Grafico;

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
import java.util.*;
/**
 *
 * @author fabys
 */
public class Mostrar {
    private MinHeap_Arbol colaDeImpresion;
    private Lista<Documento> listaDeDocumentos; 
    private Graph arbol;
    private Graph cola;
    
    public Mostrar() {
    }
    
    public void construirSecuencia(StringBuilder fr) {
        Nodo_Arbol<Documento> raiz = Proyecto2.simulacion.getImpresora().getColaDeImpresion().getRoot();
        if (raiz == null) {
            System.out.println("Error: El nodo raíz es nulo.");
            return;
        }
        agregarNodo(raiz, null, fr);
    }
    
    public void agregarNodo(Nodo_Arbol<Documento> nodo, String idPadre, StringBuilder fr) {
        if (nodo == null) {
            return;
        }
        
        String idNodo = nodo.getData().getNombre();
	fr.append(idNodo + "<< ");
        
        agregarNodo(nodo.getpLeft(), idNodo, fr);
        agregarNodo(nodo.getpRight(), idNodo, fr);
    }

    
}


