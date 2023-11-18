/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Grafico;

import proyecto.Estructuras.Documento;
import proyecto.Estructuras.MinHeap;
import proyecto.Estructuras.Impresora;
import proyecto.Estructuras.Lista;
import proyecto.Estructuras.Nodo_Arbol;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

/**
 *
 * @author fabys
 */
public class Mostrar {
    public static MinHeap colaDeImpresion;
    public static Lista<Documento> listaDeDocumentos; 
    private Graph arbol;
    private Graph cola;
    
    
    public Mostrar() {
        colaDeImpresion = new MinHeap();
        arbol = new SingleGraph("Tutorial");
    }
    
    public void mostrar() {
        arbol.display();
    }

}
    
    


