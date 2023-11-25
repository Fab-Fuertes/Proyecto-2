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
    
    public String usartoString(String identificador){
        return usuarios.toString();
        
    }
    

    
    public void enviarDocumento(String identificador, Documento documento) {
        Usuario usuario = usuarios.get(identificador);
        if (usuario != null) {
            impresora.agregarDocumento(documento);
        }
    }
    
    public void imprimirDocumento(String identificadorUsuario, int indexDocumento) {
        Usuario usuario = usuarios.get(identificadorUsuario);
        if (usuario != null) {
            Documento documento = usuario.getDocumento(indexDocumento);
            impresora.agregarDocumento(documento);
        }
    }
    
   public void eliminarUsuario(String identificador) {
        usuarios.remove(identificador);
    }
   
    public void crearDocumento(String identificadorUsuario, String nombre, int tamaño, String tipo) {
        Usuario usuario = usuarios.get(identificadorUsuario);
        if (usuario != null) {
            Prioridad prioridad = usuario.getPrioridad();
            Documento documento = new Documento(prioridad, nombre, tamaño, tipo);
            usuario.agregarDocumento(documento);
        }
    }
    
    public Usuario getUsuario(String identificador) {
        return usuarios.get(identificador);
    }
    

    
    
}
