/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administrador.GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AgregarSede extends javax.swing.JFrame {

    /**
     * Creates new form AgregarSede
     */
    public AgregarSede() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jTextNIT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextNombreContacto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextTelefonoContacto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextCorreoContacto = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonBusqueda = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Se agregara la sede a la entidad con Nit: ");

        titulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        titulo.setText("Agregar Sede");

        jLabel3.setText("Nombre sede:");

        jLabel4.setText("Nombre contacto:");

        jLabel5.setText("Telefono contacto:");

        jLabel6.setText("Correo contacto:");

        jTextCorreoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoContactoActionPerformed(evt);
            }
        });

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonBusqueda.setText("Cambiar Entidad (Nit)");
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });

        jButtonInicio.setText("Inicio");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNombreContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jTextTelefonoContacto)
                            .addComponent(jTextCorreoContacto)
                            .addComponent(jTextNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBusqueda)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAgregar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jTextNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextCorreoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonBusqueda)
                    .addComponent(jButtonInicio))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCorreoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoContactoActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        // TODO add your handling code here:
        MenuAdmin menu = new MenuAdmin();
        menu.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        // TODO add your handling code here:
        BuscarEntidad buscar = new BuscarEntidad();
        buscar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        
        boolean[] campos=  new boolean[5];
        
        String Entidad = this.jTextNIT.getText();
        campos[0]=this.jTextNIT.getText().isEmpty();
        String Nombre = this.jTextNombre.getText();
        campos[1]= this.jTextNombre.getText().isEmpty();
        String NombreContacto = this.jTextNombreContacto.getText();
        campos[2]= this.jTextNombreContacto.getText().isEmpty();
        String TelefonoContacto = this.jTextTelefonoContacto.getText();
        campos[3]= this.jTextTelefonoContacto.getText().isEmpty();
        String correo = this.jTextCorreoContacto.getText();
        campos[4]= this.jTextCorreoContacto.getText().isEmpty();
        
        
        if (!campos[0] && !campos[1] && !campos[2] && !campos[3] && !campos[4] ){
            
            int codigoSede = agregarSede(Entidad, Nombre, NombreContacto, TelefonoContacto, correo);
            if( codigoSede != 0){
                 JOptionPane.showMessageDialog(null ,"La sede a sido agregada" );
                
                 
                
                 int respuesta = JOptionPane.showConfirmDialog(null ,"Desea Agregar un empleado a la sede :"+ Nombre,"Agregar Empleado", JOptionPane.YES_NO_OPTION );
                 if(respuesta==JOptionPane.YES_OPTION){
                       
                     AgregarEmpleado nuevo = new AgregarEmpleado();

                     nuevo.setVisible(true);
                     nuevo.jTextNit.setText(Entidad);
                     nuevo.jTextNombreSede.setText(Nombre);
                     nuevo.jTextSede.setText(String.valueOf(codigoSede));

                        }else{
                    

                            AgregarSede nuevaSede= new AgregarSede();
                            nuevaSede.jTextNIT.setText(Entidad);
                            nuevaSede.setVisible(true);
                            this.setVisible(false);

                        }
            }else{
            
            JOptionPane.showMessageDialog(null ,"Error. El Nombre de la sede que desea agregar ya existe" ,"Problema proceso",JOptionPane.ERROR_MESSAGE);
    
    
        }
        
        }else{
            
            JOptionPane.showMessageDialog(null ,"Todos los campos son obligatorios" );
    
    
        }
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarSede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextCorreoContacto;
    public static javax.swing.JTextField jTextNIT;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNombreContacto;
    private javax.swing.JTextField jTextTelefonoContacto;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private static int agregarSede(java.lang.String nitEntidad, java.lang.String nombre, java.lang.String nombreContacto, java.lang.String telefonoContacto, java.lang.String correo) {
        com.esperapp.ws.AsignarTurnos_Service service = new com.esperapp.ws.AsignarTurnos_Service();
        com.esperapp.ws.AsignarTurnos port = service.getAsignarTurnosPort();
        return port.agregarSede(nitEntidad, nombre, nombreContacto, telefonoContacto, correo);
    }

 

   
}
