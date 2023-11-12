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
    
    public Usuario(String usuario, Prioridad prioridad){
        this.usuario = usuario;
        this.prioridad = prioridad;
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