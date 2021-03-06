/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_parcial2.arz;

import ConexionDAO.Conexion;
import DTO.Datos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


 //* @author ABITA

public class JFPrincipal extends javax.swing.JFrame {
List<Datos> listadatos = new ArrayList<Datos>(); String[] titulo = new String[]{"nombre","telefono","celular,direccion"}; 
DefaultTableModel mimodelo = new DefaultTableModel(null, titulo);
    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
         btngrabar.setEnabled(false);
        txtnombre.setEditable(false);
        txttelefono.setEditable(false);
        txtcelular.setEditable(false);
        txtdireccion.setEditable(false);
        Conexion conexion = new Conexion();
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcell = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Agenda");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel3.setText("Telefono:");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setText("Direccion:");

        txtcell.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        txtcell.setText("Celular");

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        btnagregar.setBackground(new java.awt.Color(255, 204, 204));
        btnagregar.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneditar.setBackground(new java.awt.Color(255, 204, 204));
        btneditar.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btngrabar.setBackground(new java.awt.Color(255, 204, 204));
        btngrabar.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        btngrabar.setText("Grabar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 204, 204));
        btneliminar.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        TablaDatos.setBackground(new java.awt.Color(204, 204, 255));
        TablaDatos.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Telefono", "Cell", "Eliminar"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaDatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        btncancelar.setBackground(new java.awt.Color(204, 204, 255));
        btncancelar.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(txtcell))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtnombre)
                                            .addComponent(txttelefono)
                                            .addComponent(txtcelular)
                                            .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btneditar)
                                            .addComponent(btnagregar))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btngrabar, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btncancelar)
                                        .addGap(72, 72, 72)))))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregar)
                            .addComponent(btngrabar))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneliminar)
                            .addComponent(btneditar))
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcell))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        // TODO add your handling code here:
         Conexion conexion = new Conexion();
        Datos datos = new Datos();
        datos.setNombre(txtnombre.getText());
        datos.setTelefono(Integer.valueOf(txttelefono.getText()));
        datos.setCell(Integer.valueOf(txtcell.getText()));
        datos.setDireccion(txtdireccion.getText());
       if(conexion.insertar(datos)){
                JOptionPane.showMessageDialog(this, "se grabo corretamente....");
    }else{
             
                JOptionPane.showMessageDialog(this,"Error al grabar...");
            }
           
                if(conexion.actualizar(datos)){
                    JOptionPane.showMessageDialog(null,"Se actualizo corretamente","Actualizacion",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Error al actualizar","Actualizacion",JOptionPane.INFORMATION_MESSAGE);
                }   
            
        btneditar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnagregar.setEnabled(true);
        btngrabar.setEnabled(false);
        txtnombre.setEditable(false);
        txttelefono.setEditable(false);
        txtcelular.setEditable(false);
        txtdireccion.setEditable(false);
        btncancelar.setEnabled(false);
        
     btngrabar.setText("Grabar");
        
            
    
        
    }//GEN-LAST:event_btngrabarActionPerformed

    private void TablaDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Se preciono algun lugar de la tabla","Seleccio",JOptionPane.INFORMATION_MESSAGE);
        int columna = TablaDatos.getSelectedColumn();
        int fila = TablaDatos.getSelectedRow();
     String cadena = TablaDatos.getValueAt(fila,columna).toString();
     JOptionPane.showMessageDialog(null, "columna ->" + columna + "\n informacion en la celda ->" + cadena, "Posicion seleccionada " ,JOptionPane.INFORMATION_MESSAGE);
     txtnombre.setText(TablaDatos.getValueAt(fila,1).toString());
     txttelefono.setText(TablaDatos.getValueAt(fila,2).toString());
     txtcelular.setText(TablaDatos.getValueAt(fila,1).toString());
      txtdireccion.setText(TablaDatos.getValueAt(fila,1).toString());
       btncancelar.setText(TablaDatos.getValueAt(fila,1).toString());
   
    }//GEN-LAST:event_TablaDatosMousePressed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
         txtnombre.setText("");
        txttelefono.setText("");
        txtcelular.setText("");
        btneditar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnagregar.setEnabled(false);
        btngrabar.setEnabled(true);
        txtnombre.setEditable(true);
        txttelefono.setEditable(true);
        txtcelular.setEditable(true);
        txtdireccion.setEditable(true);
         btncancelar.setEnabled(false);
        
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        btneditar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnagregar.setEnabled(false);
        btngrabar.setEnabled(true);
        txtnombre.setEditable(true);
        txttelefono.setEditable(true);
        txtcelular.setEditable(true);
         txtdireccion.setEditable(true);
        
        btngrabar.setText("Actualizar");
        
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        Datos datos = new Datos();
        Conexion conexion = new  Conexion();
        if(conexion.eliminar(datos)){
            JOptionPane.showMessageDialog(this, "Se elimino correctamente...");
           
        } else{
                    
            JOptionPane.showMessageDialog(this, "Error de eliminado  ...");        }
        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
         btneditar.setEnabled(true);
        btneliminar.setEnabled(true);
        btngrabar.setEnabled(true);
        btngrabar.setEnabled(false);
        txtnombre.setEditable(false);
        txttelefono.setEditable(false);
        txtcelular.setEditable(false);
        txtdireccion.setEditable(false);
       
        
    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtcell;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
