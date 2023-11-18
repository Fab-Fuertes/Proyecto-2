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
public class Simulacion {
    private HashTable<String, Usuario> usuarios;
    private Impresora impresora;

    public Simulacion() {
        usuarios = new HashTable<>(100);
        impresora = new Impresora();
    }

    public void agregarUsuario(String identificador, Prioridad prioridad) {
        Usuario usuario = new Usuario(identificador, prioridad);
        usuarios.put(identificador, usuario);
    }

    public void enviarDocumento(String identificador, Documento documento) {
        Usuario usuario = usuarios.get(identificador);
        if (usuario != null) {
            impresora.agregarDocumento(documento);
        }
    }
    
   public void eliminarUsuario(String identificador) {
        usuarios.remove(identificador);
    }
   
}
