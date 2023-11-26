/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Estructuras;

/**
 *
 * @author cehernandez
 */
public class Impresora {
    
    private MinHeap_Arbol colaDeImpresion;
    private HashTable<String, Documento> documentosPorUsuario;
    public static Lista<Documento> listaDeDocumentos;

    // Constructor
    public Impresora() {
        this.colaDeImpresion = new MinHeap_Arbol();
        this.documentosPorUsuario = new HashTable<String, Documento>(20); // Tamaño inicial de 10
        this.listaDeDocumentos = new Lista<Documento>();
    }

    public void agregarDocumento(Documento doc, int prioridad) { 
        getColaDeImpresion().insert(doc, prioridad);
        documentosPorUsuario.put(doc.getNombre(), doc);
    }

    public void eliminarDocumento(String nombreDocumento) {
        Documento doc = documentosPorUsuario.get(nombreDocumento);

        if (doc != null) {
            getColaDeImpresion().remove(doc);
            documentosPorUsuario.remove(nombreDocumento);
        }
    }

    public Documento siguienteDocumento() {
        return getColaDeImpresion().removeMin();
    }

    public void liberarImpresora() {
        Documento doc = getColaDeImpresion().removeMin();

        for (int i = 0; i < listaDeDocumentos.getSize(); i++) {
            if (listaDeDocumentos.searchByIndex(i).getData().equals(doc)) {
                listaDeDocumentos.remove(i);
                break;
            }
        }
        documentosPorUsuario.remove(doc.getNombre());
    }

    /**
     * @return the colaDeImpresion
     */
    public MinHeap_Arbol getColaDeImpresion() {
        return colaDeImpresion;
    }

    /**
     * @param colaDeImpresion the colaDeImpresion to set
     */
    public void setColaDeImpresion(MinHeap_Arbol colaDeImpresion) {
        this.colaDeImpresion = colaDeImpresion;
    }
}
