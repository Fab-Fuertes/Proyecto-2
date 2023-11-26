/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Interfaz;

import proyecto.Estructuras.*;
import proyecto.pkg2.Proyecto2;
import static proyecto.pkg2.Proyecto2.funciones;

/**
 *
 * @author fabys
 */
public class Liberar_Documento extends javax.swing.JFrame {

	Nodo_Arbol<Documento> hola = Proyecto2.simulacion.getImpresora().getColaDeImpresion().getRoot();
	Lista<Documento> documentos_en_cola = new Lista<Documento>();
	Documento documento_seleccionado;

	private Usuario usuario_imprimir;

	/**
	 * Creates new form Imprimir_Documento
	 */
	public Liberar_Documento() {
		initComponents();
		ComboBox.removeAllItems();
		preorden_documento(hola);
	}

	public void preorden_documento(Nodo_Arbol<Documento> root) {
		System.out.println("hola");
		if (root != null) {
			ComboBox.addItem(root.getData().getNombre());
			documentos_en_cola.InsertLast(root.getData());
			this.preorden_documento(root.getpLeft());
			this.preorden_documento(root.getpRight());
		}
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel2 = new javax.swing.JLabel();
                ComboBox = new javax.swing.JComboBox<>();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel2.setText("Documentos: ");

                ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                ComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ComboBoxActionPerformed(evt);
                        }
                });

                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png.36x36.png"))); // NOI18N
                jButton2.setText("Eliminar");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png.36x36.png"))); // NOI18N
                jButton3.setText("Regresar");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3))
                                .addGap(48, 48, 48)
                                .addComponent(jButton2)
                                .addContainerGap(75, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	    // TODO add your handling code here:
	
	 for(Nodo_Lista<Documento> pAux = documentos_en_cola.getpFirst(); pAux != null; pAux = pAux.getpNext() ) {
		 if(pAux.getData().getNombre() == ComboBox.getSelectedItem()) {
			 documento_seleccionado = pAux.getData();
			 System.out.println("this works");
		 }
	 }

	 Proyecto2.simulacion.getImpresora().getColaDeImpresion().remove(documento_seleccionado);
	 ComboBox.removeItem(ComboBox.getSelectedItem());
	 documentos_en_cola.remove(documento_seleccionado);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
	    // TODO add your handling code here:
	    InterfazPrincipal v2 = new InterfazPrincipal();
	    v2.setVisible(true);
	    this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

        private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_ComboBoxActionPerformed

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
			java.util.logging.Logger.getLogger(Imprimir_Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Imprimir_Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Imprimir_Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Imprimir_Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Imprimir_Documento().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> ComboBox;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel2;
        // End of variables declaration//GEN-END:variables
}
