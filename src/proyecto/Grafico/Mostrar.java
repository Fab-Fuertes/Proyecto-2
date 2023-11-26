/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Grafico;

import proyecto.Estructuras.Documento;
import proyecto.Estructuras.Impresora;
import proyecto.Estructuras.Lista;
import proyecto.Estructuras.Nodo_Arbol;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import proyecto.Estructuras.MinHeap_Arbol;

/**
 *
 * @author fabys
 */
public class Mostrar {
    private MinHeap_Arbol colaDeImpresion;
    private Lista<Documento> listaDeDocumentos; 
    private Graph arbol;
    private Graph cola;
    
    public Mostrar(MinHeap_Arbol colaDeImpresion, Lista<Documento> listaDeDocumentos) {
        this.colaDeImpresion = colaDeImpresion;
        this.listaDeDocumentos = listaDeDocumentos;
        this.arbol = new SingleGraph("Arbol");
        this.cola = new SingleGraph("Cola");
    }
    
    public void mostrarArbol() {
        if (this.colaDeImpresion.isEmpty()) {
            System.out.println("El árbol está vacío.");
        } else {
            // Aquí debes agregar el código para visualizar el arbol
            arbol.display();
        }
    }
    
    public void mostrarCola() {
        // Aquí debes agregar el código para visualizar la cola
        cola.display();
    }
}


