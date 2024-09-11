/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practico5_laboratorio;

import javax.swing.JOptionPane;


/**
 *
 * @author gRUPO 5
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        this.setTitle("Formulario de contactos");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
    }
Directorio x = new Directorio();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDirec = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTDirec = new javax.swing.JTextField();
        jTCiudad = new javax.swing.JTextField();
        jBBuscarTell = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBBuscarDireccion = new javax.swing.JButton();
        jBBuscarApellido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabelTitulo.setText("Formulario de Contacto");
        jLabelTitulo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLabelTituloComponentMoved(evt);
            }
        });

        jLabelDNI.setText("DNI:");

        jLabelNombre.setText("Nombre:");

        jLabelApellido.setText("Apellido:");

        jLabelDirec.setText("Direccion:");

        jLabelCiudad.setText("Ciudad:");

        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jTCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCiudadActionPerformed(evt);
            }
        });

        jBBuscarTell.setText("Buscar");
        jBBuscarTell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTellActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefono:");

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBAgregar.setText("Guardar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");

        jBSalir.setText("Salir");

        jBBuscarDireccion.setText("Buscar");

        jBBuscarApellido.setText("Buscar");
        jBBuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarApellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jBBuscarDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBBuscarTell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBBuscarApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                        .addGap(2, 2, 2))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTNombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTApellido))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelDirec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTDirec)
                                        .addComponent(jTCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDNI)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDirec)
                    .addComponent(jTDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBBuscarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCiudad)
                        .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarTell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBAgregar)
                    .addComponent(jBBorrar)
                    .addComponent(jBSalir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTituloComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabelTituloComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelTituloComponentMoved

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jTCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCiudadActionPerformed

    private void jBBuscarTellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTellActionPerformed
        
        long input_telefono = Long.parseLong( jTTelefono.getText());
        
        JOptionPane.showMessageDialog(this, x.buscarContacto(input_telefono).toString());
    }//GEN-LAST:event_jBBuscarTellActionPerformed

    
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
       long input_dni = Long.parseLong(jTDni.getText());
       String input_nombre = jTNombre.getText();
       String input_apellido = jTApellido.getText();
       String input_direccion = jTDirec.getText();
       String input_ciudad = jTCiudad.getText();
       long input_telefono = Long.parseLong( jTTelefono.getText());
     
        System.out.println(input_dni);
        System.out.println(input_nombre);
        System.out.println(input_apellido);
        System.out.println(input_direccion);
        System.out.println(input_ciudad);
        System.out.println(input_telefono);
       
      Contacto chaval = new Contacto();
      chaval.setDni(input_dni);
      chaval.setNombre(input_nombre);
      chaval.setApellido(input_apellido);
      chaval.setDireccion(input_direccion);
      chaval.setCiudad(input_ciudad);
     
      
      
      x.agregarContacto(input_telefono, chaval);
      
      
      
       
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
       
    }//GEN-LAST:event_jTDniActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

     jTDni.setText("");
       jTNombre.setText("");
       jTCiudad.setText("");
       jTApellido.setText("");
       jTDirec.setText("");
       jTTelefono.setText("");

    }//GEN-LAST:event_jBNuevoActionPerformed

    
    /*FUNCION PARA BUSCAR CONTACTOS EN BASE A SU APELLIDO, RETORNA EL NRO DE TELEFONO*/
    private void jBBuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarApellidoActionPerformed

        
        /*SE GUARDA EN LA VARIABLE EL TELEFONO ASOCIADO A ESE APELLIDO*/
        Long TelAsociado = x.buscarTelefono(jTApellido.getText());
        
        /*SE IMPRIME EL NUMERO ASOCIADO*/
        JOptionPane.showMessageDialog(this, "Numero Asociado: " + TelAsociado);
        
    }//GEN-LAST:event_jBBuscarApellidoActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscarApellido;
    private javax.swing.JButton jBBuscarDireccion;
    private javax.swing.JButton jBBuscarTell;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDirec;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTDirec;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}
