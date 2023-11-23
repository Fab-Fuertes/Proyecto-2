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
    
    private MinHeap colaDeImpresion;
<<<<<<< HEAD
    private HashTable<String, Documento> documentosPorUsuario;
    private Lista<Documento> listaDeDocumentos;
    public static Lista<Documento> listaDeDocumentos;

    // Constructor
    public Impresora() {
        this.colaDeImpresion = new MinHeap();
        this.documentosPorUsuario = new HashTable<String, Documento>(20); // Tamaño inicial de 10
        this.listaDeDocumentos = new Lista<Documento>();
    }


    public void agregarDocumentoCola(Documento doc) {
        colaDeImpresion.insert(doc);
    }
    
    public void agregarDocumentoLista(Documento doc){
        listaDeDocumentos.InsertLast(doc);
    }

    public void agregarDocumento(Documento doc) { 
        colaDeImpresion.insert(doc);
        documentosPorUsuario.put(doc.getNombre(), doc);
    }

    public void eliminarDocumento(String nombreDocumento) {
        Documento doc = documentosPorUsuario.get(nombreDocumento);

        if (doc != null) {
            colaDeImpresion.remove(doc);
            documentosPorUsuario.remove(nombreDocumento);
        }
    }

    public Documento siguienteDocumento() {
        return colaDeImpresion.removeMin();
    }

    public void liberarImpresora() {
        Documento doc = colaDeImpresion.removeMin();

        for (int i = 0; i < listaDeDocumentos.getSize(); i++) {
            if (listaDeDocumentos.searchByIndex(i).getData().equals(doc)) {
                listaDeDocumentos.remove(i);
                break;
            }
        }
        documentosPorUsuario.remove(doc.getNombre());
    }
}
