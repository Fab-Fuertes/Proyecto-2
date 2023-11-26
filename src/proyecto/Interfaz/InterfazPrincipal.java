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
        System.setProperty("org.graphstream.ui", "swing");
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
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Agregar_usuario = new javax.swing.JButton();
        Modificar_documentos = new javax.swing.JButton();
        Modificar_documentos1 = new javax.swing.JButton();
        Modificar_documentos2 = new javax.swing.JButton();
        etiquetaTiempo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("—(••Sistema de Impresión••)—");

        Agregar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png.36x36.png"))); // NOI18N
        Agregar_usuario.setText("Modificar Usuarios");
        Agregar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_usuarioActionPerformed(evt);
            }
        });

        Modificar_documentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escritura.png.36x36.png"))); // NOI18N
        Modificar_documentos.setText("Modificar Documentos");
        Modificar_documentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_documentosActionPerformed(evt);
            }
        });

        Modificar_documentos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver-grafico.png.36x36.png"))); // NOI18N
        Modificar_documentos1.setText("Ver cola de Impresión");
        Modificar_documentos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_documentos1ActionPerformed(evt);
            }
        });

        Modificar_documentos2.setText("Eliminar de la Cola");
        Modificar_documentos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_documentos2ActionPerformed(evt);
            }
        });

        etiquetaTiempo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        etiquetaTiempo.setText("00:00:00:00");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel2.setText("--------------------------------------------------");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carga-en-la-nube.png.36x36.png"))); // NOI18N
        jButton3.setText("Cargar Usuarios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png.36x36.png"))); // NOI18N
        jButton2.setText("Mandar a imprimir ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/liberar.png"))); // NOI18N
        jButton6.setText("Liberar Impresora");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Agregar_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Modificar_documentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Modificar_documentos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Modificar_documentos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(113, 113, 113)
                            .addComponent(etiquetaTiempo))
                        .addComponent(jLabel2)))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(Modificar_documentos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addGap(5, 5, 5)
                .addComponent(Modificar_documentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Modificar_documentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaTiempo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
        private void Modificar_documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_documentosActionPerformed
            // TODO add your handling code here:
            Interfaz_Documentos v2 = new Interfaz_Documentos();
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
	    Liberar_Documento v2 = new Liberar_Documento();
	    this.setVisible(false);
	    v2.setVisible(true);
        }//GEN-LAST:event_Modificar_documentos2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo csv", "csv");

        seleccionarArchivo.setFileFilter(filtro);

        int seleccionar = seleccionarArchivo.showOpenDialog(this);

        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File Reservas = seleccionarArchivo.getSelectedFile();
            Proyecto2.funciones.leer_txt(Reservas);
            //Proyecto2.funciones.mostrar_usuarios();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Imprimir_Documento v2 = new Imprimir_Documento();
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
       Liberar_impresora v2 = new Liberar_impresora();
        v2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

//    private void añadirComponentes() {
//        jTextFieldIdentificador = new JTextField();
//        jComboBoxPrioridad = new JComboBox<>(Prioridad.values());
//        jButtonAgregarUsuario = new JButton("Agregar Usuario");
//
//        jButtonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButtonAgregarUsuarioActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout layout = (javax.swing.GroupLayout)getContentPane().getLayout();
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addGroup(layout.createSequentialGroup()
//                    .addGap(43, 43, 43)
//                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(jButton1)
//                        .addComponent(jTextFieldIdentificador)
//                        .addComponent(jComboBoxPrioridad)
//                        .addComponent(jButtonAgregarUsuario)) // Agrega el botón a la interfaz gráfica
//                    .addContainerGap(294, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addGroup(layout.createSequentialGroup()
//                    .addGap(34, 34, 34)
//                    .addComponent(jButton1)
//                    .addComponent(jTextFieldIdentificador)
//                    .addComponent(jComboBoxPrioridad)
//                    .addComponent(jButtonAgregarUsuario) // Agrega el botón a la interfaz gráfica
//                    .addContainerGap(245, Short.MAX_VALUE))
//        );
//
//        pack();
//    }
//    private void jButtonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // Obtén el identificador del usuario del campo de texto correspondiente
//        String identificador = jTextFieldIdentificador.getText();
//
//        // Obtén el tipo de prioridad del combo box correspondiente
//        Prioridad prioridad = (Prioridad) jComboBoxPrioridad.getSelectedItem();
//
//        // Agrega el nuevo usuario a tu simulación
//        simulacion.agregarUsuario(identificador, prioridad);
//
//        // Opcional: limpia los campos para la próxima entrada
//        jTextFieldIdentificador.setText("");
//        jComboBoxPrioridad.setSelectedIndex(0);
//    }
    
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
