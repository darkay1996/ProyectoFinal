package ventanas;

import clases.doctor;
import clases.especialidad;
import java.text.DateFormat;
import conexion_bada.Insert_doctor;
import conexion_bada.Insert;
import conexion_bada.Insert_especialidad;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class agregar_doctor extends javax.swing.JFrame {


    DateFormat df = DateFormat.getDateInstance();
    ArrayList<doctor> lista_doctor = new ArrayList();
    public agregar_doctor() {
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

        grupo_sexo = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_cedula_doctor = new javax.swing.JTextField();
        text_PrimerNombre_doctor = new javax.swing.JTextField();
        text_SegundoNombre_doctor = new javax.swing.JTextField();
        text_PrimerApellido_doctor = new javax.swing.JTextField();
        text_SegundoApellido_doctor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        Femenino_doctor = new javax.swing.JRadioButton();
        Masculino_doctor = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        text_email_doctor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        text_celular_doctor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        combo_especialidad_doctor = new javax.swing.JComboBox<>();
        Guardar_doctor = new javax.swing.JButton();
        Regresar_doctor = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        text_direccion_doctor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        combo_sangre_doctor = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        Fecha_Nacimiento_doctor = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR DOCTOR");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cedula:");

        jLabel3.setText("Primer Nombre:");

        jLabel4.setText("Segundo Nombre:");

        jLabel5.setText("Primer Apellido:");

        jLabel6.setText("Segundo Apellido:");

        text_cedula_doctor.setForeground(new java.awt.Color(102, 102, 102));
        text_cedula_doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_cedula_doctor.setText("Ingrese la cedula");
        text_cedula_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_cedula_doctorMousePressed(evt);
            }
        });
        text_cedula_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_cedula_doctorActionPerformed(evt);
            }
        });

        text_PrimerNombre_doctor.setForeground(new java.awt.Color(102, 102, 102));
        text_PrimerNombre_doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_PrimerNombre_doctor.setText("Ingrese el Primer nombre");
        text_PrimerNombre_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_PrimerNombre_doctorMousePressed(evt);
            }
        });
        text_PrimerNombre_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_PrimerNombre_doctorActionPerformed(evt);
            }
        });

        text_SegundoNombre_doctor.setForeground(new java.awt.Color(102, 102, 102));
        text_SegundoNombre_doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_SegundoNombre_doctor.setText("Ingrese el Segundo nombre");
        text_SegundoNombre_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_SegundoNombre_doctorMousePressed(evt);
            }
        });

        text_PrimerApellido_doctor.setForeground(new java.awt.Color(102, 102, 102));
        text_PrimerApellido_doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_PrimerApellido_doctor.setText("Ingrese el Primer apellido");
        text_PrimerApellido_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_PrimerApellido_doctorMousePressed(evt);
            }
        });

        text_SegundoApellido_doctor.setForeground(new java.awt.Color(102, 102, 102));
        text_SegundoApellido_doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_SegundoApellido_doctor.setText("Ingrese el Segundo apellido");
        text_SegundoApellido_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_SegundoApellido_doctorMousePressed(evt);
            }
        });
        text_SegundoApellido_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_SegundoApellido_doctorActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 153, 255));
        jLabel13.setText("Datos Personales");

        grupo_sexo.add(Femenino_doctor);
        Femenino_doctor.setText("F");

        grupo_sexo.add(Masculino_doctor);
        Masculino_doctor.setText("M");
        Masculino_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masculino_doctorActionPerformed(evt);
            }
        });

        jLabel8.setText("Sexo");

        jLabel9.setText("E-mail");

        text_email_doctor.setForeground(new java.awt.Color(102, 102, 102));
        text_email_doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_email_doctor.setText("Ingrese el E-mail");
        text_email_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_email_doctorMousePressed(evt);
            }
        });

        jLabel10.setText("Celular");

        text_celular_doctor.setForeground(new java.awt.Color(102, 102, 102));
        text_celular_doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_celular_doctor.setText("Ingrese el celular");
        text_celular_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_celular_doctorMousePressed(evt);
            }
        });

        jLabel11.setText("Especialidad");

        combo_especialidad_doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "CARDIOLOGIA", "ODONTOLOGIA", "MEDICINA GENERAL", "DERMATOLOGO", "GASTROENTEROLOGO", "GERIATRIA" }));

        Guardar_doctor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Guardar_doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar (1).png"))); // NOI18N
        Guardar_doctor.setText("GUARDAR");
        Guardar_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_doctorActionPerformed(evt);
            }
        });

        Regresar_doctor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Regresar_doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        Regresar_doctor.setText("REGRESAR");
        Regresar_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar_doctorActionPerformed(evt);
            }
        });

        jLabel14.setText("Dirección:");

        text_direccion_doctor.setForeground(new java.awt.Color(102, 102, 102));
        text_direccion_doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_direccion_doctor.setText("Ingrese la dirección");
        text_direccion_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_direccion_doctorMousePressed(evt);
            }
        });
        text_direccion_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_direccion_doctorActionPerformed(evt);
            }
        });

        jLabel15.setText("Tipo de sangre");

        combo_sangre_doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel16.setText("Fecha de nacimiento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text_direccion_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(text_PrimerNombre_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(text_SegundoNombre_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(text_PrimerApellido_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(text_SegundoApellido_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(text_cedula_doctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Fecha_Nacimiento_doctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_especialidad_doctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_sangre_doctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(107, 107, 107))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Masculino_doctor)
                                        .addGap(18, 18, 18)
                                        .addComponent(Femenino_doctor)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_celular_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_email_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(68, 68, 68))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Guardar_doctor)
                        .addGap(46, 46, 46)
                        .addComponent(Regresar_doctor)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text_cedula_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_PrimerNombre_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(Fecha_Nacimiento_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(text_SegundoNombre_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(text_PrimerApellido_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Masculino_doctor)
                                .addComponent(Femenino_doctor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_SegundoApellido_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_especialidad_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(text_direccion_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(text_email_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_celular_doctor))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Guardar_doctor)
                            .addComponent(Regresar_doctor))
                        .addGap(159, 159, 159))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(combo_sangre_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_cedula_doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_cedula_doctorMousePressed

        text_cedula_doctor.setText("");
        text_cedula_doctor.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_text_cedula_doctorMousePressed

    private void text_cedula_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cedula_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cedula_doctorActionPerformed

    private void text_PrimerNombre_doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_PrimerNombre_doctorMousePressed
        text_PrimerNombre_doctor.setText("");
        text_PrimerNombre_doctor.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_text_PrimerNombre_doctorMousePressed

    private void text_PrimerNombre_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_PrimerNombre_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_PrimerNombre_doctorActionPerformed

    private void text_SegundoNombre_doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_SegundoNombre_doctorMousePressed
        text_SegundoNombre_doctor.setText("");
        text_SegundoNombre_doctor.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_text_SegundoNombre_doctorMousePressed

    private void text_PrimerApellido_doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_PrimerApellido_doctorMousePressed
        text_PrimerApellido_doctor.setText("");
        text_PrimerApellido_doctor.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_text_PrimerApellido_doctorMousePressed

    private void text_SegundoApellido_doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_SegundoApellido_doctorMousePressed
        text_SegundoApellido_doctor.setText("");
        text_SegundoApellido_doctor.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_text_SegundoApellido_doctorMousePressed

    private void text_SegundoApellido_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_SegundoApellido_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_SegundoApellido_doctorActionPerformed

    private void Masculino_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Masculino_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Masculino_doctorActionPerformed

    private void text_email_doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_email_doctorMousePressed
         text_email_doctor.setText("");
        text_email_doctor.setForeground(Color.BLACK);
    }//GEN-LAST:event_text_email_doctorMousePressed

    private void text_celular_doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_celular_doctorMousePressed
        text_celular_doctor.setText("");
        text_celular_doctor.setForeground(Color.BLACK);
    }//GEN-LAST:event_text_celular_doctorMousePressed

    private void Regresar_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar_doctorActionPerformed
        this.dispose();
        new doctor_crud().setVisible(true);
    }//GEN-LAST:event_Regresar_doctorActionPerformed

    private void Guardar_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_doctorActionPerformed
        RegistrarDoctor();
        limpiar();
        
    }//GEN-LAST:event_Guardar_doctorActionPerformed

    private void text_direccion_doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_direccion_doctorMousePressed
        text_direccion_doctor.setText("");
        text_direccion_doctor.setForeground(Color.BLACK);
    }//GEN-LAST:event_text_direccion_doctorMousePressed

    private void text_direccion_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_direccion_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_direccion_doctorActionPerformed

    public void RegistrarDoctor() {
        
        String genero="";
        Insert_doctor doctor = new Insert_doctor();
        //doctor.setCodigo(text_codigo_doctor.getText());
        doctor.setCedula(text_cedula_doctor.getText());
        doctor.setPri_nomb(text_PrimerNombre_doctor.getText());
        doctor.setSeg_nombre(text_SegundoNombre_doctor.getText());
        doctor.setPrim_apell(text_PrimerApellido_doctor.getText());
        doctor.setSeg_apelli(text_SegundoApellido_doctor.getText());
        
        if (Masculino_doctor.isSelected()) {
            genero = "hombre";
        }
        if (Femenino_doctor.isSelected()) {
            genero = "mujer";
        }
        doctor.setGenero(genero);
        
        
        String dia = Integer.toString(Fecha_Nacimiento_doctor.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(Fecha_Nacimiento_doctor.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(Fecha_Nacimiento_doctor.getCalendar().get(Calendar.YEAR));
        String FechaNacimiento = (dia + "-" + mes + "-" + año);
        //String FechaNacimiento = df.format(Fecha_Nacimiento_doctor.getDate());
        doctor.setFecha_Nacimiento(FechaNacimiento);
        
        doctor.setDireccion(text_direccion_doctor.getText());
        doctor.setCorreo(text_email_doctor.getText());
        doctor.setTipo_sangre(combo_sangre_doctor.getSelectedItem().toString());
        doctor.setTelefono(text_celular_doctor.getText());
        doctor.setEspecialidad(combo_especialidad_doctor.getSelectedItem().toString());
        
        if (doctor.InsertarDoctor()) {
            System.out.println("Conexion Exitosa");
        } else {
            System.out.println("Conexion Erronea");
        }
    }
    public void limpiar() {
        //text_codigo_doctor.setText("");
        text_PrimerApellido_doctor.setText("");
        text_PrimerNombre_doctor.setText("");
        text_SegundoApellido_doctor.setText("");
        text_SegundoNombre_doctor.setText("");
        text_cedula_doctor.setText("");
        text_celular_doctor.setText("");
        text_email_doctor.setText("");
        grupo_sexo.clearSelection();
        text_direccion_doctor.setText("");
        combo_sangre_doctor.setSelectedIndex(0);
        combo_especialidad_doctor.setSelectedIndex(0);
        
    }
    
     //Llenar especialidad
    public void LLenarComboBoxEspecialidad() {
        Insert_especialidad inser = new Insert_especialidad();
        List<especialidad> com = inser.ListaEspecialidades();

        for (int i = 0; i < com.size(); i++) {
            combo_especialidad_doctor.addItem(com.get(i).getNombre_especialidad());
        }
    }
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
            java.util.logging.Logger.getLogger(agregar_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha_Nacimiento_doctor;
    private javax.swing.JRadioButton Femenino_doctor;
    private javax.swing.JButton Guardar_doctor;
    private javax.swing.JRadioButton Masculino_doctor;
    private javax.swing.JButton Regresar_doctor;
    private javax.swing.JComboBox<String> combo_especialidad_doctor;
    private javax.swing.JComboBox<String> combo_sangre_doctor;
    private javax.swing.ButtonGroup grupo_sexo;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField text_PrimerApellido_doctor;
    private javax.swing.JTextField text_PrimerNombre_doctor;
    private javax.swing.JTextField text_SegundoApellido_doctor;
    private javax.swing.JTextField text_SegundoNombre_doctor;
    private javax.swing.JTextField text_cedula_doctor;
    private javax.swing.JTextField text_celular_doctor;
    private javax.swing.JTextField text_direccion_doctor;
    private javax.swing.JTextField text_email_doctor;
    // End of variables declaration//GEN-END:variables
}
