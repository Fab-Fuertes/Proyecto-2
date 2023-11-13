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

    private Impresora impresora;

    public Simulacion() {
        impresora = new Impresora();
    }

    public void agregarUsuario(String identificador, Prioridad prioridad) {
        Usuario usuario = new Usuario(identificador, prioridad);
        Documento documento = new Documento(usuario);
        impresora.agregarDocumento(documento);
    }

    public Documento siguienteDocumento() {
        return impresora.siguienteDocumento();
    }
}
