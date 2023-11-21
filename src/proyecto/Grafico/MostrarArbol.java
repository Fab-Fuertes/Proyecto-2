/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Grafico;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import proyecto.Estructuras.Nodo_Arbol;
/**
 *
 * @author fabys
 */
public class MostrarArbol {
    private Graph arbol;
    
    public MostrarArbol(Nodo_Arbol raiz) {
        this.arbol = new SingleGraph("Arbol");
        construirGrafico(raiz, null);
    }
    
    private void construirGrafico(Nodo_Arbol nodo, Nodo_Arbol padre) {
        if (nodo != null) {
            arbol.addNode(nodo.getData().toString());
            if (padre != null) {
                arbol.addEdge(padre.getData().toString() + "-" + nodo.getData().toString(), padre.getData().toString(), nodo.getData().toString());
            }
            construirGrafico(nodo.getpLeft(), nodo);
            construirGrafico(nodo.getpRight(), nodo);
        }
    }
    
    public void mostrar() {
        arbol.display();
    }
}
