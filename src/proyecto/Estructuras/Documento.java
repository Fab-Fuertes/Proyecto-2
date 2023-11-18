/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Estructuras;

import proyecto.Estructuras.*;

/**
 *
 * @author cehernandez
 */
public class Documento {

    private Usuario usuario;
    private Prioridad prioridad;
    private String nombre;
    private int tamaño;
    private String tipo;

    public Documento(Usuario usuario, String nombre, int tamaño, String tipo) {
        this.usuario = usuario;
        this.prioridad = usuario.getPrioridad();
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
