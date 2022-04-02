/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import clases.administrador;
//import conexion_bada.Insert_familiar;
//import conexion_bada.Insert;
import conexion_bada.Insert_administrador;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author User
 */
public class Agregar_administrador extends javax.swing.JFrame {

    DateFormat df = DateFormat.getDateInstance();
    ArrayList<administrador> lista_administrador = new ArrayList();
    public Agregar_administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genero_administrador = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txt_cedula_administrador = new javax.swing.JTextField();
        txt_PrimerNombre_administrador = new javax.swing.JTextField();
        txt_SegundoNombre_administrador = new javax.swing.JTextField();
        txt_PrimerApellido_administrador = new javax.swing.JTextField();
        txt_SegundoApellido_administrador = new javax.swing.JTextField();
        txt_direccion_administrador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Masculino_administrador = new javax.swing.JRadioButton();
        Femenino_administrador = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txt_codigo_administrador = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_email_administrador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_celular_administrador = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        combo_sangre_administrador = new javax.swing.JComboBox<>();
        Guardar_administrador = new javax.swing.JButton();
        Regresar_administrador = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_nivelDeeducacion_administrador = new javax.swing.JTextField();
        Fecha_Nacimiento_administrador = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR ADMINISTRADOR");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 153, 255));
        jLabel13.setText("Datos Personales");

        jLabel2.setText("Cédula:");

        jLabel3.setText("Primer Nombre:");

        jLabel4.setText("Segundo Nombre:");

        jLabel5.setText("Primer Apellido:");

        jLabel6.setText("Segundo Apellido:");

        jLabel12.setText("Dirección:");

        txt_cedula_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_cedula_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cedula_administrador.setText("Ingrese la cedula");
        txt_cedula_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cedula_administradorMousePressed(evt);
            }
        });
        txt_cedula_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedula_administradorActionPerformed(evt);
            }
        });

        txt_PrimerNombre_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_PrimerNombre_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PrimerNombre_administrador.setText("Ingrese el Primer nombre");
        txt_PrimerNombre_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_PrimerNombre_administradorMousePressed(evt);
            }
        });
        txt_PrimerNombre_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrimerNombre_administradorActionPerformed(evt);
            }
        });

        txt_SegundoNombre_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_SegundoNombre_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_SegundoNombre_administrador.setText("Ingrese el Segundo nombre");
        txt_SegundoNombre_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_SegundoNombre_administradorMousePressed(evt);
            }
        });

        txt_PrimerApellido_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_PrimerApellido_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PrimerApellido_administrador.setText("Ingrese el Primer apellido");
        txt_PrimerApellido_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_PrimerApellido_administradorMousePressed(evt);
            }
        });

        txt_SegundoApellido_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_SegundoApellido_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_SegundoApellido_administrador.setText("Ingrese el Segundo apellido");
        txt_SegundoApellido_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_SegundoApellido_administradorMousePressed(evt);
            }
        });
        txt_SegundoApellido_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SegundoApellido_administradorActionPerformed(evt);
            }
        });

        txt_direccion_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_direccion_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion_administrador.setText("Ingrese la dirección");
        txt_direccion_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_direccion_administradorMousePressed(evt);
            }
        });
        txt_direccion_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_administradorActionPerformed(evt);
            }
        });

        jLabel8.setText("Sexo");

        Masculino_administrador.setText("M");
        Masculino_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masculino_administradorActionPerformed(evt);
            }
        });

        Femenino_administrador.setText("F");

        jLabel7.setText("Código:");

        txt_codigo_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_codigo_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo_administrador.setText("Código de admin");
        txt_codigo_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_codigo_administradorMousePressed(evt);
            }
        });
        txt_codigo_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_administradorActionPerformed(evt);
            }
        });

        jLabel14.setText("Fecha de nacimiento:");

        jLabel9.setText("E-mail");

        txt_email_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_email_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_email_administrador.setText("Ingrese el E-mail");
        txt_email_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_email_administradorMousePressed(evt);
            }
        });

        jLabel10.setText("Celular");

        txt_celular_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_celular_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_celular_administrador.setText("Ingrese el celular");
        txt_celular_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_celular_administradorMousePressed(evt);
            }
        });

        jLabel11.setText("Tipo de sangre");

        combo_sangre_administrador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        Guardar_administrador.setText("GUARDAR");
        Guardar_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_administradorActionPerformed(evt);
            }
        });

        Regresar_administrador.setText("REGRESAR");
        Regresar_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar_administradorActionPerformed(evt);
            }
        });

        jLabel15.setText("Nivel de educacion");

        txt_nivelDeeducacion_administrador.setForeground(new java.awt.Color(102, 102, 102));
        txt_nivelDeeducacion_administrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nivelDeeducacion_administrador.setText("Ingrese el nivel de educacion");
        txt_nivelDeeducacion_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nivelDeeducacion_administradorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(txt_cedula_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_codigo_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Masculino_administrador)
                                .addGap(18, 18, 18)
                                .addComponent(Femenino_administrador))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(Guardar_administrador)
                                                    .addGap(60, 60, 60)
                                                    .addComponent(Regresar_administrador))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txt_SegundoApellido_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_PrimerApellido_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_SegundoNombre_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_PrimerNombre_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txt_email_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txt_celular_administrador))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(combo_sangre_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txt_direccion_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_nivelDeeducacion_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Fecha_Nacimiento_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cedula_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_codigo_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PrimerNombre_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_SegundoNombre_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_PrimerApellido_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_SegundoApellido_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)))
                    .addComponent(Fecha_Nacimiento_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Masculino_administrador)
                    .addComponent(Femenino_administrador))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_email_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_celular_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_nivelDeeducacion_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(combo_sangre_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar_administrador)
                    .addComponent(Regresar_administrador))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedula_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cedula_administradorMousePressed

        txt_cedula_administrador.setText("");
        txt_cedula_administrador.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedula_administradorMousePressed

    private void txt_cedula_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedula_administradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedula_administradorActionPerformed

    private void txt_PrimerNombre_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PrimerNombre_administradorMousePressed
        txt_PrimerNombre_administrador.setText("");
        txt_PrimerNombre_administrador.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrimerNombre_administradorMousePressed

    private void txt_PrimerNombre_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrimerNombre_administradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrimerNombre_administradorActionPerformed

    private void txt_SegundoNombre_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_SegundoNombre_administradorMousePressed
        txt_SegundoNombre_administrador.setText("");
        txt_SegundoNombre_administrador.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SegundoNombre_administradorMousePressed

    private void txt_PrimerApellido_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_PrimerApellido_administradorMousePressed
        txt_PrimerApellido_administrador.setText("");
        txt_PrimerApellido_administrador.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrimerApellido_administradorMousePressed

    private void txt_SegundoApellido_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_SegundoApellido_administradorMousePressed
        txt_SegundoApellido_administrador.setText("");
        txt_SegundoApellido_administrador.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_SegundoApellido_administradorMousePressed

    private void txt_SegundoApellido_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SegundoApellido_administradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SegundoApellido_administradorActionPerformed

    private void txt_direccion_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_direccion_administradorMousePressed
        txt_direccion_administrador.setText("");
        txt_direccion_administrador.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_administradorMousePressed

    private void txt_direccion_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_administradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_administradorActionPerformed

    private void Masculino_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masculino_administradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Masculino_administradorActionPerformed

    private void txt_codigo_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_codigo_administradorMousePressed
        txt_codigo_administrador.setText("");
        txt_codigo_administrador.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_codigo_administradorMousePressed

    private void txt_codigo_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_administradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_administradorActionPerformed

    private void txt_email_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_email_administradorMousePressed
        txt_email_administrador.setText("");
        txt_email_administrador.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_email_administradorMousePressed

    private void txt_celular_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_celular_administradorMousePressed
        txt_celular_administrador.setText("");
        txt_celular_administrador.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_celular_administradorMousePressed

    private void Guardar_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_administradorActionPerformed

        RegistrarAdministrador();
        limpiar();
    }//GEN-LAST:event_Guardar_administradorActionPerformed

    private void Regresar_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar_administradorActionPerformed
        this.dispose();
        new crud_administrador().setVisible(true);
    }//GEN-LAST:event_Regresar_administradorActionPerformed

    private void txt_nivelDeeducacion_administradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nivelDeeducacion_administradorMousePressed
        
        txt_nivelDeeducacion_administrador.setText("");
        txt_nivelDeeducacion_administrador.setForeground(Color.BLACK);
    }//GEN-LAST:event_txt_nivelDeeducacion_administradorMousePressed

    public void RegistrarAdministrador() {

        String genero = "";
        Insert_administrador administrador = new Insert_administrador();
        administrador.setCodigo(txt_codigo_administrador.getText());
        administrador.setCedula(txt_cedula_administrador.getText());
        administrador.setPri_nomb(txt_PrimerNombre_administrador.getText());
        administrador.setSeg_nombre(txt_SegundoNombre_administrador.getText());
        administrador.setPrim_apell(txt_PrimerApellido_administrador.getText());
        administrador.setSeg_apelli(txt_SegundoApellido_administrador.getText());
        administrador.setDireccion(txt_direccion_administrador.getText());
        if (Masculino_administrador.isSelected()) {
            genero = "hombre";
        }
        if (Femenino_administrador.isSelected()) {
            genero = "mujer";
        }
        administrador.setGenero(genero);
        administrador.setCorreo(txt_email_administrador.getText());
        
        
        String dia = Integer.toString(Fecha_Nacimiento_administrador.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(Fecha_Nacimiento_administrador.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(Fecha_Nacimiento_administrador.getCalendar().get(Calendar.YEAR));
        String fecha = (dia + "-" + mes + "-" + año);
        
        //String FechaNacimiento = df.format(Fecha_Nacimiento_administrador.getDate());
        administrador.setFecha_Nacimiento(fecha);
        
        administrador.setTelefono(txt_celular_administrador.getText());
        administrador.setTipo_sangre(combo_sangre_administrador.getSelectedItem().toString());
        administrador.setNivel_educacion(txt_nivelDeeducacion_administrador.getText());


        if (administrador.InsertarAdministrador()) {
            System.out.println("Conexion Exitosa");
        } else {
            System.out.println("Conexion Erronea");
        }
    }

    public void limpiar() {
        txt_codigo_administrador.setText("");
        txt_cedula_administrador.setText("");
        txt_PrimerNombre_administrador.setText("");
        txt_SegundoNombre_administrador.setText("");
        txt_PrimerApellido_administrador.setText("");
        txt_SegundoApellido_administrador.setText("");
        txt_direccion_administrador.setText("");
        txt_email_administrador.setText("");
        txt_celular_administrador.setText("");
        Genero_administrador.clearSelection();
        combo_sangre_administrador.setSelectedIndex(0);
        txt_nivelDeeducacion_administrador.setText("");

    }
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
            java.util.logging.Logger.getLogger(Agregar_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha_Nacimiento_administrador;
    private javax.swing.JRadioButton Femenino_administrador;
    private javax.swing.ButtonGroup Genero_administrador;
    private javax.swing.JButton Guardar_administrador;
    private javax.swing.JRadioButton Masculino_administrador;
    private javax.swing.JButton Regresar_administrador;
    private javax.swing.JComboBox<String> combo_sangre_administrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txt_PrimerApellido_administrador;
    private javax.swing.JTextField txt_PrimerNombre_administrador;
    private javax.swing.JTextField txt_SegundoApellido_administrador;
    private javax.swing.JTextField txt_SegundoNombre_administrador;
    private javax.swing.JTextField txt_cedula_administrador;
    private javax.swing.JTextField txt_celular_administrador;
    private javax.swing.JTextField txt_codigo_administrador;
    private javax.swing.JTextField txt_direccion_administrador;
    private javax.swing.JTextField txt_email_administrador;
    private javax.swing.JTextField txt_nivelDeeducacion_administrador;
    // End of variables declaration//GEN-END:variables
}
