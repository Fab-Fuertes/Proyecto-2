/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Estructuras;

/**
 *
 * @author fabys
 */
public class Usuario {
    private String usuario;
    private Prioridad prioridad;
    private Lista<Documento> documentos;
    
    public Usuario(String usuario, Prioridad prioridad){
        this.usuario = usuario;
        this.prioridad = prioridad;
        this.documentos = new Lista<>();
    }
    
    public void agregarDocumento(Documento documento) {
        this.documentos.InsertLast(documento);
    }

    public Documento getDocumento(int index) {
        return this.documentos.searchByIndex(index).getData();
    }
    
    public void eliminarDocumento(Documento documento) {
        this.documentos.remove(documento);
    }

    public Lista<Documento> getDocumentos() {
        return this.documentos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void print() {
        System.out.println("Usuario: " + this.usuario + " // Prioridad:" + this.prioridad);
    }    
    
    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
}