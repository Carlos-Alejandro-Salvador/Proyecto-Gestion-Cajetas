/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MEMO
 */
public class ClientesForm extends javax.swing.JFrame {

    /**
     * Creates new form ClientesForm
     */
    static int caso;
    
    public ClientesForm(int x) {
        caso = x;
        initComponents();
        switch (caso){
            case 1:
                btnEliminar.setVisible(false);
                btnBuscar.setVisible(false);
                btnGuardar.setVisible(true);
                txtCliente.setEnabled(false);
                PreparedStatement stmt = null;
                ResultSet rs = null;
                try {
                    String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                            + "password = 123;encrypt=true;trustServerCertificate=true;";
                    Connection conect = DriverManager.getConnection(connectionUrl);
                    for(int i = 1; i<99; i ++){
                        if(i < 10){
                            stmt = conect.prepareStatement("SELECT ClaveCliente FROM Clientes where ClaveCliente = 'cl-0" + i + "'");
                            rs = stmt.executeQuery();
                            if(!rs.next()){
                                txtCliente.setText("cl-0" + i);
                                break;
                            }
                            
                        }   else    {
                            stmt = conect.prepareStatement("SELECT ClaveCliente FROM Clientes where ClaveCliente = 'cl-" + i + "'");
                            rs = stmt.executeQuery();
                            if(!rs.next()){
                                txtCliente.setText("cl-" + i);
                                break;
                            }
                            
                        }
                    }
                 } 
                catch (SQLException ex) 
                {
                  System.out.println("Error." + ex.getMessage());
                }  
                break;
            case 2:
                btnEliminar.setVisible(false);
                btnBuscar.setVisible(true);
                btnGuardar.setVisible(false);
                txtMaterno.setEnabled(false);
                txtNombre.setEnabled(false);
                txtPaterno.setEnabled(false);
                txtCol.setEnabled(false);
                txtCalle.setEnabled(false);
                txtNumero.setEnabled(false);
                txtTelefono.setEnabled(false);
                break;
            case 3:
                btnBuscar.setVisible(true);
                btnGuardar.setEnabled(false);
                btnEliminar.setVisible(false);                
                txtMaterno.setEnabled(false);
                txtNombre.setEnabled(false);
                txtPaterno.setEnabled(false);
                txtCol.setEnabled(false);
                txtCalle.setEnabled(false);
                txtNumero.setEnabled(false);
                txtTelefono.setEnabled(false);
                break;
            case 4:
                btnEliminar.setEnabled(false);
                btnBuscar.setVisible(true);
                btnGuardar.setVisible(false);
                txtMaterno.setEnabled(false);
                txtNombre.setEnabled(false);
                txtPaterno.setEnabled(false);
                txtCol.setEnabled(false);
                txtCalle.setEnabled(false);
                txtNumero.setEnabled(false);
                txtTelefono.setEnabled(false);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtCol = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel1.setText("Clave del Cliente:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel2.setText("Nombre del Cliente");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel5.setText("Dirección del Cliente");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel6.setText("Colonia:");

        txtCliente.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtPaterno.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });

        txtMaterno.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });

        txtCol.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColActionPerformed(evt);
            }
        });

        txtCalle.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Clientes");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel10.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel7.setText("Calle:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel8.setText("Número:");

        txtNumero.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel11.setText("Telefono del Cliente:");

        txtTelefono.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegresar))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaternoActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaternoActionPerformed

    private void txtColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String cliente = validacionClave(txtCliente.getText(), "Clave del Cliente", "cl-", 5);
        String nombre = validacionTexto(txtNombre.getText(), "Nombre", 20, false, false);
        String paterno = validacionTexto(txtPaterno.getText(), "Apellido Paterno", 15, false, false);
        String materno = validacionTexto(txtMaterno.getText(), "Apellido Materno", 15, false, false);
        String col = validacionTexto(txtCol.getText(), "Colonia", 15, false, false);
        String calle = validacionTexto(txtCalle.getText(), "Calle", 20, false, true);
        int numero = validacionInt(txtNumero.getText(), "Numero", 4);
        int auxTelefono = validacionInt(txtTelefono.getText(), "Telefono", 15);
        String telefono = String.valueOf(auxTelefono);
        PreparedStatement stmt = null;
        if(!(cliente == "no" || nombre == "no" || paterno == "no" || materno == "no" || col == "no" || calle == "no" ||  numero == -1 || auxTelefono == -1)){
            try {
             String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                     + "password = 123;encrypt=true;trustServerCertificate=true;";
             Connection conect = DriverManager.getConnection(connectionUrl);
             if(caso == 1){
                stmt = conect.prepareStatement("insert into Clientes values('" + cliente + "', '" + nombre +"', '" + paterno + "', '" + materno + "', '" + numero +"', '" + col + "', '" + calle +"', '" + telefono + "')");
                JOptionPane.showMessageDialog(null, "Cliente ingresado con exito.");
                super.dispose();
                GestorClientes gestor = new GestorClientes();
                gestor.setVisible(true);
                stmt.executeQuery();
             }  else    {
                stmt = conect.prepareStatement("update Clientes set NomCli = '" + nombre + "', APCli = '" + paterno +
                        "', AMCli = '" + materno + "', Numero = '" +  numero + "', Colonia = '" +  col + "', Calle = '" +  calle + "', TelefonoCliente = '" + telefono + 
                        "' where ClaveCliente = '" + cliente + "'"
                        );
                 JOptionPane.showMessageDialog(null, "Cliente modificado con exito.");
                stmt.executeQuery(); 
             }

            } 
            catch (SQLException ex) 
            {
              System.out.println("Error." + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        super.dispose();
        GestorClientes gpc = new GestorClientes();
        gpc.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        String cliente = validacionClave(txtCliente.getText(), "Clave del Cliente", "cl-", 5);
        if(cliente != "no"){
            PreparedStatement stmt = null;
            ResultSet rs = null;

            if(caso == 2){
                try {
                    String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                            + "password = 123;encrypt=true;trustServerCertificate=true;";
                    Connection conect = DriverManager.getConnection(connectionUrl);
                    stmt = conect.prepareStatement("select ClaveCliente from Clientes where ClaveCliente = '" + cliente + "'");
                    rs = stmt.executeQuery();
                    if(!rs.next()){
                        System.out.println("Asd");
                    }   else    {
                        stmt = conect.prepareStatement("select * from Clientes where ClaveCliente = '" + cliente + "'");
                        rs = stmt.executeQuery();
                        while(rs.next()) {
                            for (int y=1;y<=rs.getMetaData().getColumnCount();y++){
                                switch(y){
                                    case 2:
                                        txtNombre.setText(rs.getString(y));
                                        break;
                                    case 3:    
                                        txtPaterno.setText(rs.getString(y));
                                        break;
                                    case 4:    
                                        txtMaterno.setText(rs.getString(y));
                                        break;
                                    case 5:    
                                        txtNumero.setText(rs.getString(y));
                                        break;
                                    case 6:
                                        txtCol.setText(rs.getString(y));
                                        break;
                                    case 7:    
                                        txtCalle.setText(rs.getString(y));
                                        break;
                                    case 8:
                                        txtTelefono.setText(rs.getString(y));
                                        break;
                                }
                            }
                        }                        
                    }
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Error." + ex.getMessage());
                }  
            }   else if(caso == 3)    {
                try {
                    String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                            + "password = 123;encrypt=true;trustServerCertificate=true;";
                    Connection conect = DriverManager.getConnection(connectionUrl);
                    stmt = conect.prepareStatement("select ClaveCliente from Clientes where ClaveCliente = '" + cliente + "'");
                    rs = stmt.executeQuery();
                    if(!rs.next()){
                        System.out.println("Asd");
                    }   else    {
                        stmt = conect.prepareStatement("select * from Clientes where ClaveCliente = '" + cliente + "'");
                        rs = stmt.executeQuery();
                        while(rs.next()) {
                            for (int y=1;y<=rs.getMetaData().getColumnCount();y++){
                                switch(y){
                                    case 2:
                                        txtNombre.setText(rs.getString(y));
                                        break;
                                    case 3:    
                                        txtPaterno.setText(rs.getString(y));
                                        break;
                                    case 4:    
                                        txtMaterno.setText(rs.getString(y));
                                        break;
                                    case 5:    
                                        txtNumero.setText(rs.getString(y));
                                        break;
                                    case 6:
                                        txtCol.setText(rs.getString(y));
                                        break;
                                    case 7:    
                                        txtCalle.setText(rs.getString(y));
                                        break;
                                    case 8:
                                        txtTelefono.setText(rs.getString(y));
                                        break;
                                }
                            }
                        }                
                        btnGuardar.setEnabled(true);                
                        txtMaterno.setEnabled(true);
                        txtNombre.setEnabled(true);
                        txtPaterno.setEnabled(true);
                        txtCol.setEnabled(true);
                        txtCalle.setEnabled(true);
                        txtNumero.setEnabled(true);
                        txtTelefono.setEnabled(true);                 
                   }
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Error." + ex.getMessage());
                }
            }   else    {
                try {
                    String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                            + "password = 123;encrypt=true;trustServerCertificate=true;";
                    Connection conect = DriverManager.getConnection(connectionUrl);
                    stmt = conect.prepareStatement("select ClaveCliente from Clientes where ClaveCliente = '" + cliente + "'");
                    rs = stmt.executeQuery();
                    if(!rs.next()){
                        System.out.println("Asd");
                    }   else    {
                        stmt = conect.prepareStatement("select * from Clientes where ClaveCliente = '" + cliente + "'");
                        rs = stmt.executeQuery();
                        while(rs.next()) {
                            for (int y=1;y<=rs.getMetaData().getColumnCount();y++){
                                switch(y){
                                    case 2:
                                        txtNombre.setText(rs.getString(y));
                                        break;
                                    case 3:    
                                        txtPaterno.setText(rs.getString(y));
                                        break;
                                    case 4:    
                                        txtMaterno.setText(rs.getString(y));
                                        break;
                                    case 5:    
                                        txtNumero.setText(rs.getString(y));
                                        break;
                                    case 6:
                                        txtCol.setText(rs.getString(y));
                                        break;
                                    case 7:    
                                        txtCalle.setText(rs.getString(y));
                                        break;
                                    case 8:
                                        txtTelefono.setText(rs.getString(y));
                                        break;
                                }
                            }
                        } 
                        btnEliminar.setEnabled(true);                
                   }
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Error." + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        PreparedStatement stmt = null;
        String cliente = txtCliente.getText();
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GestionCajetas;user=user; "
                    + "password = 123;encrypt=true;trustServerCertificate=true;";
            Connection conect = DriverManager.getConnection(connectionUrl);
           
            stmt = conect.prepareStatement("Delete FROM Clientes where ClaveCliente = '" + cliente + "'");
            JOptionPane.showMessageDialog(null, "Cliente eliminado con éxito.");
            super.dispose();
            GestorClientes gestor = new GestorClientes();
            gestor.setVisible(true);
            stmt.executeQuery();
            
         } 
        catch (SQLException ex) 
        {
          System.out.println("Error." + ex.getMessage());
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static String validacionClave(String Cadena, String valor, String tipo, int caracteres){
        boolean validado = false;
        float num;
        if(Cadena.length()!= caracteres) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor para " + valor + ".");
            validado = false;
        } else if (Cadena.substring(0, tipo.length()).equals(tipo)) {
            for(int x = caracteres-2; x < Cadena.length(); x++){
                if(Cadena.charAt(x) >= '0' && Cadena.charAt(x) <= '9') {
                    validado = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor correcto para " + valor + ".");
                    validado = false;
                    break;               
                }   
            }  
        }
        if (validado) {
            return Cadena;
        }
        return "no";
    }

    public static String validacionTexto(String Cadena, String valor, int caracteres, boolean gato, boolean numeros){
        boolean validado = false;
        if(Cadena.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor para " + valor + ".");
            validado = false;
        } else if (Cadena.length() >= caracteres) {
            JOptionPane.showMessageDialog(null, "Ingrese dentro del rango establecido para " + valor + ".");
            validado = false;
            return "no";
        }
        for(int x = 0; x < Cadena.length(); x++){
            int num = (int) Cadena.charAt(x);
            if(((num >= 97 && num <= 122) || (num >= 65 && num <= 90)) || (Cadena.charAt(x) == '#' && gato) || ((Cadena.charAt(x) >= '0' && Cadena.charAt(x) <= '9')&&(numeros))) {
                validado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto para " + valor + ".");
                validado = false;
                break;               
            }
        }  
        if (validado) {
            return Cadena;
        }
        return "no";
    }

    public static int validacionInt(String numeroCad, String valor, int longitud){
        boolean validado = false;
        int num, cont = 0;
        if(numeroCad.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor para " + valor + ".");
            validado = false;
        }
        for(int x = 0; x < numeroCad.length(); x++){
            if(numeroCad.charAt(x) >= '0' && numeroCad.charAt(x) <= '9') {
                validado = true;
                cont++;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto para " + valor + ".");
                validado = false;
                break;               
            }
            if(cont > longitud) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor dentro del rango para " + valor + ".");
                validado = false;
                break;
            }
        }  
        if (validado) {
            num = Integer.parseInt(numeroCad);
            return num;
        }
        return -1;
    }

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCol;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
