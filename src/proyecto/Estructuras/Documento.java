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

    public Documento(Usuario usuario) {
        this.usuario = usuario;
        this.prioridad = usuario.getPrioridad();
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

}
