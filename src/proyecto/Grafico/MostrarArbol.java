/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Grafico;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import proyecto.Estructuras.Documento;
import proyecto.Estructuras.Nodo_Arbol;
import proyecto.pkg2.Proyecto2;
/**
 *
 * @author fabys
 */
public class MostrarArbol {
    private Graph arbol;
    
    public MostrarArbol() {
        this.arbol = new SingleGraph("Arbol");
        construirGrafico();
    }
    
    private void construirGrafico() {
        Nodo_Arbol<Documento> raiz = Proyecto2.simulacion.getImpresora().getColaDeImpresion().getRoot();
        if (raiz == null) {
            System.out.println("Error: El nodo raíz es nulo.");
            return;
        }
        agregarNodo(raiz, null);
    }
    
    private void agregarNodo(Nodo_Arbol<Documento> nodo, String idPadre) {
        if (nodo == null) {
            return;
        }
        
        String idNodo = String.valueOf(nodo.hashCode());
        arbol.addNode(idNodo);
        arbol.getNode(idNodo).setAttribute("ui.label", nodo.getData().toString());
        
        if (idPadre != null) {
            arbol.addEdge(idPadre + "-" + idNodo, idPadre, idNodo);
        }
        
        agregarNodo(nodo.getpLeft(), idNodo);
        agregarNodo(nodo.getpRight(), idNodo);
    }
    
    public void mostrar() {
        arbol.display();
    }
}




