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
    public static Lista listaDeDocumentos;
    private Graph lista;
    
    public MostrarLista(){
        listaDeDocumentos = new Lista();
        lista = new SingleGraph("Tutorial");
    }

    public static Lista getListaDeDocumentos() {
        return listaDeDocumentos;
    }

    public static void setListaDeDocumentos(Lista listaDeDocumentos) {
        MostrarLista.listaDeDocumentos = listaDeDocumentos;
    }

    public Graph getLista() {
        return lista;
    }

    public void setLista(Graph lista) {
        this.lista = lista;
    }
    

    public MostrarLista(Lista<Documento> listaDeDocumentos) {
        this.listaDeDocumentos = listaDeDocumentos;
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

    public void mostrarLista() {
        lista.display();
    }
}
