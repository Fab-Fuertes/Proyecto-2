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
    private Lista<Documento> listaDeDocumentos;

    // Constructor
    public Impresora() {
        this.colaDeImpresion = new MinHeap();
        this.listaDeDocumentos = new Lista<>();
    }

    // Método para agregar un documento a la cola de impresión
    public void agregarDocumentoCola(Documento doc) {
        // Agregar el documento a la cola de impresión
        colaDeImpresion.insert(doc);
    }
    
    // Método para agregar un documento a la lista de documentos
    public void agregarDocumentoLista(Documento doc){
        // Agregar el documento a la lista de documentos
        listaDeDocumentos.InsertLast(doc);
    }

    // Método para eliminar un documento de la cola de impresión
    public void eliminarDocumento(String nombreDocumento) {
        // Buscar el documento en la lista de documentos
        for (int i = 0; i < listaDeDocumentos.getSize(); i++) {
            Documento doc = listaDeDocumentos.searchByIndex(i).getData();
            if (doc.getNombre().equals(nombreDocumento)) {
                // Eliminar el documento de la lista de documentos
                listaDeDocumentos.remove(i);

                // Eliminar el documento de la cola de impresión
                colaDeImpresion.remove(doc);
                break;
            }
        }
    }

    // Método para obtener el siguiente documento a imprimir
    public Documento siguienteDocumento() {
        return colaDeImpresion.removeMin();
    }
    
}
