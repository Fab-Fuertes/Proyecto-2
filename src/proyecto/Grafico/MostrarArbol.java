/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Grafico;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
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
        Proyecto2.simulacion.getImpresora().getColaDeImpresion().preorder();
    }
    
    public void mostrar() {
        arbol.display();
    }
}
