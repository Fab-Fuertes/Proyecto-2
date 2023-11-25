/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Interfaz;

import proyecto.Estructuras.*;
import proyecto.pkg2.*;
import javax.swing.*;

/**
 *
 * @author fabys
 */
public class Eliminar_Documento extends javax.swing.JFrame {

	/**
	 * Creates new form Eliminar_Documento
	 */
	private Usuario usuario_eliminar;

	public Eliminar_Documento() {
		initComponents();
		ComboBox.removeAllItems();
		ComboBox.addItem("Documento a eliminar..");
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                usuario_buscado = new javax.swing.JTextField();
                ComboBox = new javax.swing.JComboBox<>();
                jLabel2 = new javax.swing.JLabel();
                eliminar_documento = new javax.swing.JButton();
                buscar_documentos = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Usuario");

                usuario_buscado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                usuario_buscadoActionPerformed(evt);
                        }
                });

                ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                ComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ComboBoxActionPerformed(evt);
                        }
                });

                jLabel2.setText("Documentos:");

                eliminar_documento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png.48x48.png.36x36.png"))); // NOI18N
                eliminar_documento.setText("Eliminar");
                eliminar_documento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                eliminar_documentoActionPerformed(evt);
                        }
                });

                buscar_documentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png.36x36.png"))); // NOI18N
                buscar_documentos.setText("Buscar Documentos");
                buscar_documentos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buscar_documentosActionPerformed(evt);
                        }
                });

                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png.36x36.png"))); // NOI18N
                jButton1.setText("  Regresar");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(eliminar_documento)
                                                .addGap(35, 35, 35))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(usuario_buscado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(72, 72, 72)
                                                                .addComponent(buscar_documentos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usuario_buscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buscar_documentos))
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eliminar_documento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void usuario_buscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_buscadoActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_usuario_buscadoActionPerformed

        private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_ComboBoxActionPerformed

        private void eliminar_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_documentoActionPerformed
		// TODO add your handling code here:
		usuario_eliminar = Proyecto2.simulacion.getUsuario(usuario_buscado.getText());
		for (Nodo_Lista<Documento> pAux = usuario_eliminar.getDocumentos().getpFirst(); pAux != null; pAux = pAux.getpNext()) {
			if (pAux.getData().getNombre() == ComboBox.getSelectedItem()) {
				usuario_eliminar.getDocumentos().remove(pAux.getData());
			}
		}
                ComboBox.removeAllItems();
        }//GEN-LAST:event_eliminar_documentoActionPerformed

        private void buscar_documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_documentosActionPerformed
		// TODO add your handling code here:
		ComboBox.removeAllItems();
		usuario_eliminar = Proyecto2.simulacion.getUsuario(usuario_buscado.getText());
		for (Nodo_Lista<Documento> pAux = usuario_eliminar.getDocumentos().getpFirst(); pAux != null; pAux = pAux.getpNext()) {
			ComboBox.addItem(pAux.getData().getNombre());
		}
		if (ComboBox.getItemCount() == 0) {	
           			 JOptionPane.showMessageDialog(null, "El Usuario no cuenta con documentos");
		}
        }//GEN-LAST:event_buscar_documentosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	    // TODO add your handling code here:
	    Interfaz_Documentos v2 = new Interfaz_Documentos();
	    v2.setVisible(true);
	    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(Eliminar_Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Eliminar_Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Eliminar_Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Eliminar_Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Eliminar_Documento().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> ComboBox;
        private javax.swing.JButton buscar_documentos;
        private javax.swing.JButton eliminar_documento;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JTextField usuario_buscado;
        // End of variables declaration//GEN-END:variables
}
