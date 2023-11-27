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

    public void agregarUsuario(String identificador, int prioridad) {
        Usuario usuario = new Usuario(identificador, prioridad);
        usuarios.put(identificador, usuario);
    }
    
    public String usartoString(){
        return usuarios.toString();
    }
    
    public boolean usuarioExiste(String identificador) {
        return usuarios.get(identificador) != null;
    }
    
    public void enviarDocumento(String identificador, Documento documento) {
        Usuario usuario = usuarios.get(identificador);
        if (usuario != null) {
            getImpresora().agregarDocumento(documento);
        }
    }
    
    public void imprimirDocumento(String identificadorUsuario, int indexDocumento) {
        Usuario usuario = usuarios.get(identificadorUsuario);
        if (usuario != null) {
            Documento documento = usuario.getDocumento(indexDocumento);
            getImpresora().agregarDocumento(documento);
        }
    }
    
    public void eliminarUsuario(String identificador) {
        usuarios.remove(identificador);
    }
   
    public void crearDocumento(String identificadorUsuario, String nombre, int tamaño, String tipo, int tiempo) {
        Usuario usuario = usuarios.get(identificadorUsuario);
        if (usuario != null) {
            int prioridad = usuario.getPrioridad();
            Documento documento = new Documento(prioridad, nombre, tamaño, tipo, tiempo);
            usuario.agregarDocumento(documento);
        }
    }
    
    public Usuario getUsuario(String identificador) {
        return usuarios.get(identificador);
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }
}
