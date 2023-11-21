/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Grafico;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import proyecto.Estructuras.Lista;
import proyecto.Estructuras.Documento;

/**
 *
 * @author fabys
 */
public class MostrarLista {
    private Graph lista;
    
    public MostrarLista(Lista<Documento> listaDeDocumentos) {
        this.lista = new SingleGraph("Lista");
        Node nodoAnterior = null;
        for (int i = 0; i < listaDeDocumentos.getSize(); i++) {
            Documento doc = listaDeDocumentos.searchByIndex(i).getData();
            Node nodoActual = lista.addNode(doc.getNombre());
            nodoActual.setAttribute("ui.label", doc.getNombre());
            if (nodoAnterior != null) {
                lista.addEdge(nodoAnterior.getId() + "-" + nodoActual.getId(), nodoAnterior, nodoActual);
            }
            nodoAnterior = nodoActual;
        }
    }
    
    public void mostrar() {
        lista.display();
    }
}
