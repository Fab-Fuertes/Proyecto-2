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
    
   
    private int prioridad;
    private String nombre;
    private int tamaño;
    private String tipo;
    private int tiempo;
    private boolean exists;

    public Documento(int prioridad, String nombre, int tamaño, String tipo) {
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }
    
    
    
    
    public Documento(String nombre, int tamaño, String tipo) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
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

