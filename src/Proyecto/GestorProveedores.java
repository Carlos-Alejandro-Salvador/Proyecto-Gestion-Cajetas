/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author MEMO
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GestorProveedores extends javax.swing.JFrame {

    /**
     * Creates new form GestorProveedores
     */
    
    PreparedStatement stmt = null;
    ResultSet rs = null;
    boolean existe = false;
    
    public GestorProveedores() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestión de Proveedores");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 490, 60));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Agregar Proveedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Consultar Proveedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 290, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Modificar Proveedores");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Eliminar Proveedores");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 110, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Consulta General Proveedores");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 220, 290, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1009, 572));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        super.dispose();
        ProveedoresForm form = new ProveedoresForm(1);
        form.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                    + "password = 123;encrypt=true;trustServerCertificate=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
            for(int i = 1; i<99; i ++){
                if(i < 10){
                    stmt = conect.prepareStatement("SELECT ClaveProveedor FROM Proveedores where ClaveProveedor = 'p-0" + i + "'");
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        existe = true;
                        break;
                    }
                }   else    {
                    stmt = conect.prepareStatement("SELECT ClaveProveedor FROM Proveedores where ClaveProveedor = 'p-" + i + "'");
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        existe = true;
                        break;
                    }
                }
            }
            if(existe){
                super.dispose();
        ProveedoresForm form = new ProveedoresForm(2);
        form.setVisible(true);
            }   else    {
                JOptionPane.showMessageDialog(null, "No se han ingresado Proveedores");
            }
         } 
        catch (SQLException ex) 
        {
          System.out.println("Error." + ex.getMessage());
        } 
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                    + "password = 123;encrypt=true;trustServerCertificate=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
            for(int i = 1; i<99; i ++){
                if(i < 10){
                    stmt = conect.prepareStatement("SELECT ClaveProveedor FROM Proveedores where ClaveProveedor = 'p-0" + i + "'");
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        existe = true;
                        break;
                    }
                }   else    {
                    stmt = conect.prepareStatement("SELECT ClaveProveedor FROM Proveedores where ClaveProveedor = 'p-" + i + "'");
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        existe = true;
                        break;
                    }
                }
            }
            if(existe){
                super.dispose();
                ProveedoresForm form = new ProveedoresForm(3);
                form.setVisible(true);
            }   else    {
                JOptionPane.showMessageDialog(null, "No se han ingresado Proveedores");
            }
         } 
        catch (SQLException ex) 
        {
          System.out.println("Error." + ex.getMessage());
        } 
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        super.dispose();
        Principal pi = new Principal();
        pi.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                    + "password = 123;encrypt=true;trustServerCertificate=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
            for(int i = 1; i<99; i ++){
                if(i < 10){
                    stmt = conect.prepareStatement("SELECT ClaveProveedor FROM Proveedores where ClaveProveedor = 'p-0" + i + "'");
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        existe = true;
                        break;
                    }
                }   else    {
                    stmt = conect.prepareStatement("SELECT ClaveProveedor FROM Proveedores where ClaveProveedor = 'p-" + i + "'");
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        existe = true;
                        break;
                    }
                }
            }
            if(existe){
                super.dispose();
                GeneralProveedores gen = new GeneralProveedores();
                gen.setVisible(true);
            }   else    {
                JOptionPane.showMessageDialog(null, "No se han ingresado Proveedores");
            }
         } 
        catch (SQLException ex) 
        {
          System.out.println("Error." + ex.getMessage());
        } 
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                    + "password = 123;encrypt=true;trustServerCertificate=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
            for(int i = 1; i<99; i ++){
                if(i < 10){
                    stmt = conect.prepareStatement("SELECT ClaveProveedor FROM Proveedores where ClaveProveedor = 'p-0" + i + "'");
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        existe = true;
                        break;
                    }
                }   else    {
                    stmt = conect.prepareStatement("SELECT ClaveProveedor FROM Proveedores where ClaveProveedor = 'p-" + i + "'");
                    rs = stmt.executeQuery();
                    if(rs.next()){
                        existe = true;
                        break;
                    }
                }
            }
            if(existe){
                super.dispose();
                ProveedoresForm form = new ProveedoresForm(4);
                form.setVisible(true);      
            }   else    {
                JOptionPane.showMessageDialog(null, "No se han ingresado Proveedores");
            }
         } 
        catch (SQLException ex) 
        {
          System.out.println("Error." + ex.getMessage());
        } 
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GestorProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
