/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto.Estructuras.Usuario;
import proyecto.Funciones.*;
import javax.swing.JButton;
import javax.swing.Timer;
import proyecto.pkg2.Proyecto2;
import proyecto.Estructuras.Prioridad;
import proyecto.Estructuras.*;
import proyecto.Funciones.Funciones;
import proyecto.Grafico.*;


/**
 *
 * @author fabys
 */
public class InterfazPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form InterfazPrincipal
     */
    
    private Timer tiempo;
    private Funciones funcion;
    private Simulacion simulacion;
    private JTextField jTextFieldIdentificador;
    private JComboBox<Prioridad> jComboBoxPrioridad;
    private JButton jButtonAgregarUsuario;
    MostrarLista listaDeDocumentos;
    
    public InterfazPrincipal() {
        simulacion = new Simulacion();
        funcion = Funciones.getInstancia();
        tiempo = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funcion.Cronometro();
                actualizarEtiquetaTiempo();
            }
        });
        tiempo.start();
        initComponents();
    }

    private void actualizarEtiquetaTiempo() {
        String texto = funcion.actualizarEtiquetaTiempo();
        etiquetaTiempo.setText(texto);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                Agregar_usuario = new javax.swing.JButton();
                Modificar_documentos = new javax.swing.JButton();
                Modificar_documentos1 = new javax.swing.JButton();
                Modificar_documentos2 = new javax.swing.JButton();
                etiquetaTiempo = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jButton1.setText("Cargar Usuarios");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
                jLabel1.setText("Sistema de Impresión ");

                Agregar_usuario.setText("Modificar Usuarios");
                Agregar_usuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Agregar_usuarioActionPerformed(evt);
                        }
                });

                Modificar_documentos.setText("Modificar Documentos");
                Modificar_documentos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Modificar_documentosActionPerformed(evt);
                        }
                });

                Modificar_documentos1.setText("Ver cola de Impresión");
                Modificar_documentos1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Modificar_documentos1ActionPerformed(evt);
                        }
                });

                Modificar_documentos2.setText("Modificar cola");
                Modificar_documentos2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Modificar_documentos2ActionPerformed(evt);
                        }
                });

                etiquetaTiempo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
                etiquetaTiempo.setText("00:00:00:00");

                jButton2.setText("Mandar a imprimir ");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(130, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(125, 125, 125))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Modificar_documentos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Modificar_documentos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Modificar_documentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Agregar_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaTiempo)
                                .addGap(31, 31, 31))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(etiquetaTiempo))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Agregar_usuario)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Modificar_documentos)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Modificar_documentos1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Modificar_documentos2)
                                .addContainerGap(23, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo csv", "csv");

        seleccionarArchivo.setFileFilter(filtro);

        int seleccionar = seleccionarArchivo.showOpenDialog(this);

        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File Reservas = seleccionarArchivo.getSelectedFile();
            Proyecto2.funciones.leer_txt(Reservas);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

        private void Modificar_documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_documentosActionPerformed
            // TODO add your handling code here:
            Interfaz_Documentos v2 = new Interfaz_Documentos(listaDeDocumentos);
            v2.setVisible(true);
            this.setVisible(false);

        }//GEN-LAST:event_Modificar_documentosActionPerformed

        private void Agregar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_usuarioActionPerformed
            // TODO add your handling code here:
            Interfaz_Usuarios v2 = new Interfaz_Usuarios();
            v2.setVisible(true);
            this.setVisible(false);
        }//GEN-LAST:event_Agregar_usuarioActionPerformed

        private void Modificar_documentos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_documentos1ActionPerformed
            // TODO add your handling code here:
            Interfaz_mostrar v2 = new Interfaz_mostrar();
                v2.setVisible(true);
                this.setVisible(false);
        }//GEN-LAST:event_Modificar_documentos1ActionPerformed

        private void Modificar_documentos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_documentos2ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_Modificar_documentos2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Agregar_usuario;
        private javax.swing.JButton Modificar_documentos;
        private javax.swing.JButton Modificar_documentos1;
        private javax.swing.JButton Modificar_documentos2;
        private javax.swing.JLabel etiquetaTiempo;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        // End of variables declaration//GEN-END:variables

}
