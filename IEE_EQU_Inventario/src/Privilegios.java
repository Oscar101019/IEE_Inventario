/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author franciscoemanuelcardenasramos
 */
public class Privilegios extends javax.swing.JFrame {

    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    /**
     * Creates new form Privilegios
     */
    public Privilegios() {
        initComponents();
        setLocationRelativeTo(null);
        mostrartabla();
        mostrarcomboarea();
        mostrarcombopuesto();

        
    }

    void mostrartabla(){
       
            DefaultTableModel modelo= new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("RFC");
            tabladatos.setModel(modelo);
            
            String sql="SELECT CONCAT(Nombre_Per, ' ', Ape_Pat_Per,' ',Ape_Mat_Per) As Nombre , RFC_Emp From Persona INNER JOIN Empleado WHERE Persona.idPersona= Empleado.Persona_idPersona";
            
            String datos[] = new String [2];
           try {
               Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                datos [0]=rs.getString(1);
                 datos [1]=rs.getString(2);
            modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Privilegios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
}
    
    
     
     
     
    void mostrarcomboarea(){
       
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            
            cmbarea.setModel(modelo);
            
            String sql="SELECT Area_Pues FROM Puestos GROUP BY Area_Pues";
            
            ArrayList datos[] = new ArrayList [1];
           modelo.addElement("Seleccione un Area");
            cmbarea.setModel(modelo);
            
            try {
               Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                modelo.addElement(rs.getObject("Area_Pues"));
                cmbarea.setModel(modelo);
                 
            
            }
            cmbarea.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Privilegios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
}
     
    
void mostrarcombopuesto(){
       
            DefaultComboBoxModel modelo2 = new DefaultComboBoxModel();
            
            cmbpuesto.setModel(modelo2);
            
            String sql="SELECT Nom_Pues FROM Puestos GROUP BY Nom_Pues";
            
            ArrayList datos2[] = new ArrayList [1];
           modelo2.addElement("Seleccione un Puesto");
            cmbpuesto.setModel(modelo2);
            
            try {
               Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                modelo2.addElement(rs.getObject("Nom_Pues"));
                cmbpuesto.setModel(modelo2);
                 
            
            }
            cmbpuesto.setModel(modelo2);
        } catch (SQLException ex) {
            Logger.getLogger(Privilegios.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
}
     
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtpaterno = new javax.swing.JTextField();
        txtmaterno = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtcalle = new javax.swing.JTextField();
        txtcolonia = new javax.swing.JTextField();
        txtcp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtnolic = new javax.swing.JTextField();
        txtrfc = new javax.swing.JTextField();
        txtcred = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbarea = new javax.swing.JComboBox<String>();
        cmbpuesto = new javax.swing.JComboBox<String>();
        btnAgregar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Usuarios", jPanel2);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Insertar nuevo"));

        jLabel7.setText("Nombre");

        jLabel8.setText("Ap. Panterno");

        jLabel9.setText("Ap. Materno");

        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });

        txtpaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpaternoFocusLost(evt);
            }
        });

        txtmaterno.setToolTipText("");

        jSeparator2.setToolTipText("Direccion");

        jLabel10.setText("Calle");

        jLabel12.setText("Colonia");

        jLabel13.setText("CP");

        txtcalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcalleFocusLost(evt);
            }
        });
        txtcalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcalleKeyReleased(evt);
            }
        });

        txtcolonia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcoloniaFocusLost(evt);
            }
        });

        txtcp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcpFocusLost(evt);
            }
        });
        txtcp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcpKeyPressed(evt);
            }
        });

        jLabel14.setText("Telefono");

        jLabel15.setText("RFC");

        jLabel16.setText("NoLic");

        jLabel17.setText("# Credencial");

        txttelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttelefonoFocusLost(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
        });

        txtnolic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnolicFocusLost(evt);
            }
        });
        txtnolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnolicKeyPressed(evt);
            }
        });

        txtrfc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtrfcFocusLost(evt);
            }
        });

        txtcred.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcredFocusLost(evt);
            }
        });
        txtcred.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcredKeyPressed(evt);
            }
        });

        jLabel18.setText("Area");

        jLabel19.setText("Puesto");

        cmbarea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escoja uno", "Direccion", "Informatica", "Administración" }));
        cmbarea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbareaItemStateChanged(evt);
            }
        });
        cmbarea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbareaFocusLost(evt);
            }
        });
        cmbarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbareaActionPerformed(evt);
            }
        });

        cmbpuesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar area" }));
        cmbpuesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbpuestoItemStateChanged(evt);
            }
        });
        cmbpuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbpuestoFocusLost(evt);
            }
        });
        cmbpuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbpuestoMouseClicked(evt);
            }
        });
        cmbpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpuestoActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar");

        jLabel22.setText("Usuario");

        jLabel23.setText("Contraseña");

        txtcontraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcontraseñaFocusLost(evt);
            }
        });

        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusuarioFocusLost(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(255, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("TODOS LOS CAMPOS OBLIGATORIOS");

        jLabel4.setText("sueldo");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                        .addComponent(txtpaterno)
                                        .addComponent(txtmaterno)))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcalle)
                                        .addComponent(txtcolonia)
                                        .addComponent(txtcp))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbarea, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtcred))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtnolic))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtrfc))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtusuario)
                                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtnolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtcred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(cmbpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cmbarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Agregar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(383, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
        // TODO add your handling code here:
      //  esNulo(txtnombre.getText(),txtnombre);
    }//GEN-LAST:event_txtnombreFocusLost

    private void txtpaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpaternoFocusLost
        // TODO add your handling code here:
        //esNulo(txtpaterno.getText(),txtpaterno);
    }//GEN-LAST:event_txtpaternoFocusLost

    private void txtcalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcalleFocusLost
        // TODO add your handling code here:
        //esNulo(txtcalle.getText(),txtcalle);
    }//GEN-LAST:event_txtcalleFocusLost

    private void txtcalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcalleKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcalleKeyReleased

    private void txtcoloniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcoloniaFocusLost
        // TODO add your handling code here:
        //esNulo(txtcolonia.getText(),txtcolonia);
    }//GEN-LAST:event_txtcoloniaFocusLost

    private void txtcpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcpFocusLost
        // TODO add your handling code here:
        //esNulo(txtcp.getText(),txtcp);
    }//GEN-LAST:event_txtcpFocusLost

    private void txtcpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcpKeyPressed
        // TODO add your handling code here:
        //tieneNum(evt.getKeyChar(),txtcp);
    }//GEN-LAST:event_txtcpKeyPressed

    private void txttelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttelefonoFocusLost
        // TODO add your handling code here:
        //esNulo(txttelefono.getText(),txttelefono);
    }//GEN-LAST:event_txttelefonoFocusLost

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        // TODO add your handling code here:
        //tieneNum(evt.getKeyChar(),txttelefono);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txtnolicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnolicFocusLost
        // TODO add your handling code here:
        //esNulo(txtnolic.getText(),txtnolic);
    }//GEN-LAST:event_txtnolicFocusLost

    private void txtnolicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnolicKeyPressed
        // TODO add your handling code here:
        //tieneNum(evt.getKeyChar(),txtnolic);
    }//GEN-LAST:event_txtnolicKeyPressed

    private void txtrfcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrfcFocusLost
        //esNulo(txtrfc.getText(),txtrfc);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrfcFocusLost

    private void txtcredFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcredFocusLost
        // TODO add your handling code here:
        //esNulo(txtcred.getText(),txtcred);
    }//GEN-LAST:event_txtcredFocusLost

    private void txtcredKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcredKeyPressed
        // TODO add your handling code here:
        //tieneNum(evt.getKeyChar(),txtcred);
    }//GEN-LAST:event_txtcredKeyPressed

    private void cmbareaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbareaItemStateChanged
        // TODO add your handling code here:
        //cmbInit();
    }//GEN-LAST:event_cmbareaItemStateChanged

    private void cmbareaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbareaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbareaFocusLost

    private void cmbareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbareaActionPerformed

    private void cmbpuestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbpuestoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbpuestoItemStateChanged

    private void cmbpuestoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbpuestoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbpuestoFocusLost

    private void cmbpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbpuestoActionPerformed

    private void txtcontraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcontraseñaFocusLost
        // TODO add your handling code here:
        //esNulo(txtcontraseña.getText(),txtcontraseña);
    }//GEN-LAST:event_txtcontraseñaFocusLost

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost
        // TODO add your handling code here:
        //esNulo(txtusuario.getText(),txtusuario);
    }//GEN-LAST:event_txtusuarioFocusLost

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

String nombre,appat,apmat,calle,id,colonia,cp,usuario,contraseña,telefono,rfc,nolic,nocred,area,puesto,sueldo;
String sql="",sql2="",sql3="";
            
            nombre = txtnombre.getText();
            appat = txtpaterno.getText();
            apmat= txtmaterno.getText();
            calle=txtcalle.getText();
            colonia= txtcolonia.getText();
            cp=txtcp.getText();
            telefono=txttelefono.getText();
            nolic= txtnolic.getText();
            nocred= txtcred.getText();
            sueldo=txtsueldo.getText();
            
            rfc=txtrfc.getText();
            
            
            
            
            sql="INSERT INTO Persona (Nombre_Per,Ape_Pat_Per,Ape_Mat_Per,Calle_Per,Colonia_Per,CP_Per,Tel_Per,NoLic_Per,NoCred_Per) VALUES(?,?,?,?,?,?,?,?,?)";
            try{
            PreparedStatement pst= cn.prepareStatement(sql);
            
            pst.setString( 1,nombre );
            pst.setString( 2,appat);
            pst.setString( 3,apmat );
            pst.setString( 4,calle);
            pst.setString( 5,colonia );
            pst.setString( 6,cp);
            pst.setString( 7,telefono );
            pst.setString( 8,nolic);
            pst.setString( 9,nocred);
            
            int n=pst.executeUpdate();
            if(n>0){JOptionPane.showMessageDialog(null, "Se inserto en tabla:Persona");}
            
          
            
            
               } catch (SQLException ex) {
            Logger.getLogger(Ventanta.class.getName()).log(Level.SEVERE, null, ex);
        
    }
     
          
     
     
      
       
      
       /*sql3="INSERT INTO Puestos (Nom_Pues,Area_Pues) VALUES(?,?)";
           
        try{
            PreparedStatement pst= cn.prepareStatement(sql3);
            
            pst.setString( 1,a);
            pst.setString( 2,p);
      
            int n=pst.executeUpdate();
            if(n>0){JOptionPane.showMessageDialog(null, "Se inserto en tabla:Puestos");}
               } catch (SQLException ex) {
            Logger.getLogger(Ventanta.class.getName()).log(Level.SEVERE, null, ex);
        
    }    
       */ 
       
        String a = cmbarea.getSelectedItem().toString();
        String p = cmbpuesto.getSelectedItem().toString();
          
           String idpersona ="SELECT idPersona FROM Persona WHERE Nombre_Per = '"+nombre+"'and Ape_Pat_Per= '"+appat+"' and Ape_Mat_Per ='"+apmat;
           
           sql2="INSERT INTO Empleado (RFC_Emp,sueldo_Emp,Persona_idPersona,Puestos_idPuesto) VALUES(?,?,?,?)";
           
           String idpue = "SELECT idPuesto FROM Puestos WHERE Nom_Pues ='"+p+"'AND Area_Pues = '"+a;
           int b=Integer.parseInt(idpersona);
           
           try{
               
               
               
            PreparedStatement pst= cn.prepareStatement(sql2);
           pst.setString(1,rfc); 
           pst.setString(2, sueldo);
           pst.setString(3, idpersona);
           pst.setString(4,idpue);
          
           
            int n=pst.executeUpdate();
           if(n>0){JOptionPane.showMessageDialog(null, "Se inserto en tabla:Puestos");}
            
            
            
            
               } catch (SQLException ex) {
            Logger.getLogger(Ventanta.class.getName()).log(Level.SEVERE, null, ex);
        
    }    
            
           
           
           
         
            
            
            
              
  
            
         
               
           
           
           



            
            
             mostrartabla();
            
            
            
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbpuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbpuestoMouseClicked
      
        
             // TODO add your handling code here:
    }//GEN-LAST:event_cmbpuestoMouseClicked

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
            java.util.logging.Logger.getLogger(Privilegios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Privilegios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Privilegios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Privilegios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Privilegios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmbarea;
    private javax.swing.JComboBox<String> cmbpuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcolonia;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcp;
    private javax.swing.JTextField txtcred;
    private javax.swing.JTextField txtmaterno;
    private javax.swing.JTextField txtnolic;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpaterno;
    private javax.swing.JTextField txtrfc;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
