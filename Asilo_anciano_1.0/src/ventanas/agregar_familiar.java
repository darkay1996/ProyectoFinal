package ventanas;

import clases.usuario;
import conexion_bada.Insert_doctor;
import conexion_bada.Insert_usuario;
import clases.especialidad;
import javax.swing.JOptionPane;
import clases.validaciones;
import conexion_bada.Conexion;
import conexion_bada.Insert;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import conexion_bada.Insert_especialidad;
import clases.familiar;
import conexion_bada.Insert_familiar;
//import conexion_bada.Insert;
import java.awt.Color;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class agregar_familiar extends javax.swing.JFrame {

    DateFormat df = DateFormat.getDateInstance();
    ArrayList<familiar> lista_familiar = new ArrayList();

    validaciones misvalidaciones = new validaciones();
    Insert inser = new Insert();
    Conexion cone = new Conexion();

    public agregar_familiar() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarcod();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genero_familiar = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Masculino_familiar = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RegresarFamiliar = new javax.swing.JButton();
        GuardarFamiliar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Femenino_familiar = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fecha_nacimiento_familiar = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        text_cedula_familiar = new javax.swing.JTextField();
        text_PrimerNombre_familiar = new javax.swing.JTextField();
        text_SegundoNombre_familiar = new javax.swing.JTextField();
        text_PrimerApellido_familiar = new javax.swing.JTextField();
        text_SegundoApellido_familiar = new javax.swing.JTextField();
        text_direccion_familiar = new javax.swing.JTextField();
        text_email_familiar = new javax.swing.JTextField();
        text_celular_familiar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        combo_sangre_familiar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtParentesco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(212, 231, 157));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Primer Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Segundo Nombre:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("E-mail:");

        Genero_familiar.add(Masculino_familiar);
        Masculino_familiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Masculino_familiar.setText("M");
        Masculino_familiar.setOpaque(false);
        Masculino_familiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masculino_familiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Sexo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Segundo Apellido:");

        RegresarFamiliar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegresarFamiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        RegresarFamiliar.setToolTipText("Regresar");
        RegresarFamiliar.setBorder(null);
        RegresarFamiliar.setOpaque(false);
        RegresarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarFamiliarActionPerformed(evt);
            }
        });

        GuardarFamiliar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarFamiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar (1).png"))); // NOI18N
        GuardarFamiliar.setToolTipText("Guardar");
        GuardarFamiliar.setBorder(null);
        GuardarFamiliar.setOpaque(false);
        GuardarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarFamiliarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Dirección:");

        Genero_familiar.add(Femenino_familiar);
        Femenino_familiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Femenino_familiar.setText("F");
        Femenino_familiar.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Primer Apellido:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Cedula:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Fecha de Nacimiento:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Celular:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Datos Personales");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        text_cedula_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_cedula_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_cedula_familiar.setText("Ingrese la cedula");
        text_cedula_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_cedula_familiarMousePressed(evt);
            }
        });
        text_cedula_familiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_cedula_familiarActionPerformed(evt);
            }
        });

        text_PrimerNombre_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_PrimerNombre_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_PrimerNombre_familiar.setText("Ingrese el Primer nombre");
        text_PrimerNombre_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_PrimerNombre_familiarMousePressed(evt);
            }
        });
        text_PrimerNombre_familiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_PrimerNombre_familiarActionPerformed(evt);
            }
        });

        text_SegundoNombre_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_SegundoNombre_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_SegundoNombre_familiar.setText("Ingrese el Segundo nombre");
        text_SegundoNombre_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_SegundoNombre_familiarMousePressed(evt);
            }
        });

        text_PrimerApellido_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_PrimerApellido_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_PrimerApellido_familiar.setText("Ingrese el Primer apellido");
        text_PrimerApellido_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_PrimerApellido_familiarMousePressed(evt);
            }
        });

        text_SegundoApellido_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_SegundoApellido_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_SegundoApellido_familiar.setText("Ingrese el Segundo apellido");
        text_SegundoApellido_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_SegundoApellido_familiarMousePressed(evt);
            }
        });
        text_SegundoApellido_familiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_SegundoApellido_familiarActionPerformed(evt);
            }
        });

        text_direccion_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_direccion_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_direccion_familiar.setText("Ingrese la dirección");
        text_direccion_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_direccion_familiarMousePressed(evt);
            }
        });
        text_direccion_familiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_direccion_familiarActionPerformed(evt);
            }
        });

        text_email_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_email_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_email_familiar.setText("Ingrese el E-mail");
        text_email_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_email_familiarMousePressed(evt);
            }
        });

        text_celular_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_celular_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_celular_familiar.setText("Ingrese el celular");
        text_celular_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_celular_familiarMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Tipo de Sangre:");

        combo_sangre_familiar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Parentesco Familiar:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-documento.png"))); // NOI18N
        jButton1.setToolTipText("MODIFICAR");
        jButton1.setBorder(null);
        jButton1.setOpaque(false);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton2.setToolTipText("CONSULTAR");
        jButton2.setBorder(null);
        jButton2.setOpaque(false);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-eliminar.png"))); // NOI18N
        jButton3.setToolTipText("ELIMINAR");
        jButton3.setBorder(null);
        jButton3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Familiar");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Codigo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("CREAR USUARIO");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("NUEVO USUARIO:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("NUEVA CONTRASEÑA:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_email_familiar)
                            .addComponent(text_SegundoNombre_familiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(text_PrimerNombre_familiar)
                            .addComponent(text_cedula_familiar)
                            .addComponent(text_PrimerApellido_familiar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_SegundoApellido_familiar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_direccion_familiar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel8)
                                .addGap(69, 69, 69)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(33, 33, 33)
                                        .addComponent(Masculino_familiar)
                                        .addGap(32, 32, 32)
                                        .addComponent(Femenino_familiar))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(30, 30, 30)
                                        .addComponent(fecha_nacimiento_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(45, 45, 45)
                                        .addComponent(combo_sangre_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(49, 49, 49)
                                        .addComponent(text_celular_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUsuario)
                                            .addComponent(txtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                                        .addContainerGap(91, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator1)
                                        .addContainerGap())))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GuardarFamiliar)
                            .addComponent(jLabel11))
                        .addGap(42, 42, 42)
                        .addComponent(jButton2)
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)
                        .addGap(61, 61, 61)
                        .addComponent(RegresarFamiliar)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(text_cedula_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_PrimerNombre_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Masculino_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Femenino_familiar))
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(text_SegundoNombre_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(text_PrimerApellido_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fecha_nacimiento_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(text_celular_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(text_SegundoApellido_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(text_direccion_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(text_email_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuardarFamiliar)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(RegresarFamiliar)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(combo_sangre_familiar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Masculino_familiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masculino_familiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Masculino_familiarActionPerformed

    private void text_cedula_familiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_cedula_familiarMousePressed
        text_cedula_familiar.setText("");
        text_cedula_familiar.setForeground(Color.BLACK);
    }//GEN-LAST:event_text_cedula_familiarMousePressed

    private void text_cedula_familiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cedula_familiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cedula_familiarActionPerformed

    private void text_PrimerNombre_familiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_PrimerNombre_familiarMousePressed
        text_PrimerNombre_familiar.setText("");
        text_PrimerNombre_familiar.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_text_PrimerNombre_familiarMousePressed

    private void text_PrimerNombre_familiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_PrimerNombre_familiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_PrimerNombre_familiarActionPerformed

    private void text_SegundoNombre_familiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_SegundoNombre_familiarMousePressed
        text_SegundoNombre_familiar.setText("");
        text_SegundoNombre_familiar.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_text_SegundoNombre_familiarMousePressed

    private void text_PrimerApellido_familiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_PrimerApellido_familiarMousePressed
        text_PrimerApellido_familiar.setText("");
        text_PrimerApellido_familiar.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_text_PrimerApellido_familiarMousePressed

    private void text_SegundoApellido_familiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_SegundoApellido_familiarMousePressed
        text_SegundoApellido_familiar.setText("");
        text_SegundoApellido_familiar.setForeground(Color.BLACK);
    }//GEN-LAST:event_text_SegundoApellido_familiarMousePressed

    private void text_SegundoApellido_familiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_SegundoApellido_familiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_SegundoApellido_familiarActionPerformed

    private void text_direccion_familiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_direccion_familiarMousePressed
        text_direccion_familiar.setText("");
        text_direccion_familiar.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_text_direccion_familiarMousePressed

    private void text_direccion_familiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_direccion_familiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_direccion_familiarActionPerformed

    private void text_email_familiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_email_familiarMousePressed
        text_email_familiar.setText("");
        text_email_familiar.setForeground(Color.BLACK);
    }//GEN-LAST:event_text_email_familiarMousePressed

    private void text_celular_familiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_celular_familiarMousePressed
        text_celular_familiar.setText("");
        text_celular_familiar.setForeground(Color.BLACK);
    }//GEN-LAST:event_text_celular_familiarMousePressed

    private void RegresarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarFamiliarActionPerformed
        this.dispose();
        new crud_familiar().setVisible(true);
    }//GEN-LAST:event_RegresarFamiliarActionPerformed

    private void GuardarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarFamiliarActionPerformed
        try {
            RegistrarFamiliar();
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GuardarFamiliarActionPerformed

    public void cargarcod() {
        txtCodigo.setEnabled(false);
        txtCodigo.setText(String.valueOf(inser.cargarcodigo()));
    }

    public void RegistrarFamiliar() throws SQLException {

        Insert_familiar familiar = new Insert_familiar();
        Insert_usuario usu = new Insert_usuario();

        try {
            if (validaciones()) {
                if (familiar.validarduplicado(text_cedula_familiar.getText())) {
                    if (usu.validarNomduplicado(txtUsuario.getText())) {
                        String genero = "";
                        //familiar.setCodigo(text_codigo_familiar.getText());
                        familiar.setCedula(text_cedula_familiar.getText());
                        familiar.setPri_nomb(text_PrimerNombre_familiar.getText());
                        familiar.setSeg_nombre(text_SegundoNombre_familiar.getText());
                        familiar.setPrim_apell(text_PrimerApellido_familiar.getText());
                        familiar.setSeg_apelli(text_SegundoApellido_familiar.getText());
                        familiar.setDireccion(text_direccion_familiar.getText());
                        if (Masculino_familiar.isSelected()) {
                            genero = "hombre";
                        }
                        if (Femenino_familiar.isSelected()) {
                            genero = "mujer";
                        }
                        familiar.setGenero(genero);
                        familiar.setCorreo(text_email_familiar.getText());

                        String dia = Integer.toString(fecha_nacimiento_familiar.getCalendar().get(Calendar.DAY_OF_MONTH));
                        String mes = Integer.toString(fecha_nacimiento_familiar.getCalendar().get(Calendar.MONTH) + 1);
                        String año = Integer.toString(fecha_nacimiento_familiar.getCalendar().get(Calendar.YEAR));
                        String FechaNacimiento = (dia + "-" + mes + "-" + año);
                        //String FechaNacimiento = df.format(fecha_nacimiento_familiar.getDate());
                        familiar.setFecha_Nacimiento(FechaNacimiento);

                        familiar.setTelefono(text_celular_familiar.getText());
                        familiar.setTipo_sangre(combo_sangre_familiar.getSelectedItem().toString());
                        familiar.InsertarPersona();
                        //Fin Persona
                        ///////////////////////////////////
                        usu.setContraseña(txtContrasenia.getText());
                        usu.setUsuario(txtUsuario.getText());
                        usu.InsertarUsuario();
                        /////////////////////////////////////
                        familiar.setParectesco(txtParentesco.getText());
                        familiar.setCedula(text_cedula_familiar.getText());
                        familiar.setCod_usuario(usu.obtenerUsuario());

                        if (familiar.InsertarFamiliar()) {
                            System.out.println("Conexion Exitosa");
                            limpiar();
                            cargarcod();
                        } else {
                            System.out.println("Conexion Erronea");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El nombre de usuario ya existe");
                        txtUsuario.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El doctor ya existe en el sistema");
                    text_cedula_familiar.setText("");

                }
            }
        } catch (NullPointerException n) {

        }
    }

    public boolean validaciones() {
        boolean validado = true;

        if (text_cedula_familiar.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese la cedula");
        } else {
            if (!misvalidaciones.validar_cedula(text_cedula_familiar.getText())) {
                JOptionPane.showMessageDialog(this, "Cedula incorrecta");
                validado = false;
            }
        }
//
        if (text_PrimerNombre_familiar.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese el nombre");
        } else {
            if (!misvalidaciones.validar_nombre_apellido(text_PrimerNombre_familiar.getText())) {
                JOptionPane.showMessageDialog(this, "Primer nombre incorrecto");
                validado = false;
            }
        }
        if (text_SegundoNombre_familiar.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese el nombre");
        } else {
            if (!misvalidaciones.validar_nombre_apellido(text_SegundoNombre_familiar.getText())) {
                JOptionPane.showMessageDialog(this, "Segundo nombre incorrecto");
                validado = false;
            }
        }
        if (text_PrimerApellido_familiar.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese el primer apellido");
        } else {
            if (!misvalidaciones.validar_nombre_apellido(text_PrimerApellido_familiar.getText())) {
                JOptionPane.showMessageDialog(this, "Primer apellido incorrecto");
                validado = false;
            }
        }
        if (text_SegundoApellido_familiar.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese el segundo apellido");
        } else {
            if (!misvalidaciones.validar_nombre_apellido(text_SegundoApellido_familiar.getText())) {
                JOptionPane.showMessageDialog(this, "Segundo apellido incorrecto");
                validado = false;
            }
        }
        if (text_direccion_familiar.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese la direccion");
        } else {
            if (!misvalidaciones.validarDireccion(text_direccion_familiar.getText())) {
                JOptionPane.showMessageDialog(this, "Direccion invalida");
                validado = false;
            }
        }
        if (text_celular_familiar.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese el celular");
        } else {
            if (!misvalidaciones.validarTelefono(text_celular_familiar.getText())) {
                JOptionPane.showMessageDialog(this, "Celular invalido");
                validado = false;
            }
        }
        if (text_email_familiar.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese el correo");
        } else {
            if (!misvalidaciones.validarCorreo(text_email_familiar.getText())) {
                JOptionPane.showMessageDialog(this, "Correo invalido");
                validado = false;
            }
        }

        if (txtUsuario.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese un usuario");
        } else {
            if (!misvalidaciones.validarUsuario(txtUsuario.getText())) {
                JOptionPane.showMessageDialog(this, "Usuario invalido");
                validado = false;
            }
        }

        if (txtContrasenia.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese una contraseña");
        } else {
            if (!misvalidaciones.validarContrasena(txtContrasenia.getText())) {
                JOptionPane.showMessageDialog(this, "Contraseña invalida");
                validado = false;
            }
        }

        if (txtParentesco.getText().isEmpty()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese el parentesco");
        } else {
            if (!misvalidaciones.validar_nombre_apellido(txtParentesco.getText())) {
                JOptionPane.showMessageDialog(this, "Parentesco incorrecto");
                validado = false;
            }
        }

        if (combo_sangre_familiar.getSelectedIndex() == 0) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Seleccione el tipo de sangre");
        }
//        System.out.println(String.valueOf(fecha_Nacimiento_paciente.getCalendar()));
        if (fecha_nacimiento_familiar.getDate() == null) {
            validado = false;
            JOptionPane.showMessageDialog(this, "Ingrese la fecha de nacimiento");
        }

        if (!Masculino_familiar.isSelected() && !Femenino_familiar.isSelected()) {
            validado = false;
            JOptionPane.showMessageDialog(this, "seleccione un genero");
        }

        return validado;
    }

    public void limpiar() {
        txtCodigo.setText("");
        text_cedula_familiar.setText("");
        text_PrimerNombre_familiar.setText("");
        text_SegundoNombre_familiar.setText("");
        text_PrimerApellido_familiar.setText("");
        text_SegundoApellido_familiar.setText("");
        text_direccion_familiar.setText("");
        text_email_familiar.setText("");
        text_celular_familiar.setText("");
        Genero_familiar.clearSelection();
        combo_sangre_familiar.setSelectedIndex(0);
        txtParentesco.setText("");
        fecha_nacimiento_familiar.setCalendar(null);
        txtUsuario.setText("");
        txtContrasenia.setText("");
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
            java.util.logging.Logger.getLogger(agregar_familiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_familiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_familiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_familiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_familiar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Femenino_familiar;
    private javax.swing.ButtonGroup Genero_familiar;
    private javax.swing.JButton GuardarFamiliar;
    private javax.swing.JRadioButton Masculino_familiar;
    private javax.swing.JButton RegresarFamiliar;
    private javax.swing.JComboBox<String> combo_sangre_familiar;
    private com.toedter.calendar.JDateChooser fecha_nacimiento_familiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField text_PrimerApellido_familiar;
    private javax.swing.JTextField text_PrimerNombre_familiar;
    private javax.swing.JTextField text_SegundoApellido_familiar;
    private javax.swing.JTextField text_SegundoNombre_familiar;
    private javax.swing.JTextField text_cedula_familiar;
    private javax.swing.JTextField text_celular_familiar;
    private javax.swing.JTextField text_direccion_familiar;
    private javax.swing.JTextField text_email_familiar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
