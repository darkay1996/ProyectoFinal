
package ventanas;
import clases.familiar;
import conexion_bada.Insert_familiar;
//import conexion_bada.Insert;
import java.awt.Color;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;



public class agregar_familiar extends javax.swing.JFrame {

    //Varibales auxiliares
    
    String codigoAux;
    String cedulaAux;
    String pri_nombAux;
    String seg_nombreAux;
    String prim_apellAux;
    String seg_apelliAux;
    String correoAux;
    String generoAux;
    String fecha_NacimientoAux;
    String direccionAux;
    String telefonoAux;
    String tipo_sangreAux;
    String codigo_de_pacienteAux;
    String fecha_de_visitaAux;
    String hora_inicioAux;
    String hora_finAux;

    DateFormat df = DateFormat.getDateInstance();
    ArrayList<familiar> lista_familiar = new ArrayList();
    public agregar_familiar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genero_familiar = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RegresarFamiliar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Masculino_familiar = new javax.swing.JRadioButton();
        Femenino_familiar = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        GuardarFamiliar = new javax.swing.JButton();
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Familiar");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 250, -1));

        jLabel3.setText("Primer Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 10));

        jLabel4.setText("Segundo Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setText("Primer Apellido:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel6.setText("Segundo Apellido:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        RegresarFamiliar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegresarFamiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        RegresarFamiliar.setText("Regresar");
        RegresarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarFamiliarActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jLabel7.setText("Sexo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        Genero_familiar.add(Masculino_familiar);
        Masculino_familiar.setText("M");
        Masculino_familiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Masculino_familiarActionPerformed(evt);
            }
        });
        getContentPane().add(Masculino_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 40, -1));

        Genero_familiar.add(Femenino_familiar);
        Femenino_familiar.setText("F");
        getContentPane().add(Femenino_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, -1, -1));

        jLabel11.setText("E-mail");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel12.setText("Dirección:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 20));

        GuardarFamiliar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarFamiliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar (1).png"))); // NOI18N
        GuardarFamiliar.setText("Guardar");
        GuardarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarFamiliarActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel13.setText("Cedula:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel15.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));
        getContentPane().add(fecha_nacimiento_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 130, -1));

        jLabel17.setText("Celular");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Datos Personales");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

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
        getContentPane().add(text_cedula_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 190, 20));

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
        getContentPane().add(text_PrimerNombre_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, -1));

        text_SegundoNombre_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_SegundoNombre_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_SegundoNombre_familiar.setText("Ingrese el Segundo nombre");
        text_SegundoNombre_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_SegundoNombre_familiarMousePressed(evt);
            }
        });
        getContentPane().add(text_SegundoNombre_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, -1));

        text_PrimerApellido_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_PrimerApellido_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_PrimerApellido_familiar.setText("Ingrese el Primer apellido");
        text_PrimerApellido_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_PrimerApellido_familiarMousePressed(evt);
            }
        });
        getContentPane().add(text_PrimerApellido_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, -1));

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
        getContentPane().add(text_SegundoApellido_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 190, -1));

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
        getContentPane().add(text_direccion_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 190, -1));

        text_email_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_email_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_email_familiar.setText("Ingrese el E-mail");
        text_email_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_email_familiarMousePressed(evt);
            }
        });
        getContentPane().add(text_email_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 210, -1));

        text_celular_familiar.setForeground(new java.awt.Color(102, 102, 102));
        text_celular_familiar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_celular_familiar.setText("Ingrese el celular");
        text_celular_familiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_celular_familiarMousePressed(evt);
            }
        });
        getContentPane().add(text_celular_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 210, -1));

        jLabel19.setText("Tipo de sangre:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        combo_sangre_familiar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        getContentPane().add(combo_sangre_familiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel2.setText("Parentesco Familiar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 230, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-documento.png"))); // NOI18N
        jButton1.setText("MODIFICAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jButton2.setText("CONSULTAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-eliminar.png"))); // NOI18N
        jButton3.setText("ELIMINAR");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

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
        RegistrarFamiliar();
        limpiar();
    }//GEN-LAST:event_GuardarFamiliarActionPerformed

    public void RegistrarFamiliar() {

        String genero = "";
        Insert_familiar familiar = new Insert_familiar();
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
        
        
        //String diaV = Integer.toString(fecha_visita_familiar.getCalendar().get(Calendar.DAY_OF_MONTH));
        //String mesV = Integer.toString(fecha_visita_familiar.getCalendar().get(Calendar.MONTH) + 1);
        //String añoV = Integer.toString(fecha_visita_familiar.getCalendar().get(Calendar.YEAR));
        //String FechaVisita = (diaV + "-" + mesV + "-" + añoV);
        
        //String FechaVisita = df.format(fecha_visita_familiar.getDate());
        //familiar.setFecha_de_visita(FechaVisita);
        
        
       //String Hingreso,Mingreso,Hsalida,Msalida;
        //Hingreso = Spinner_horaIniciovisita_familiar.getValue().toString();
       // Mingreso = Spinner_minutosIniciovisita_familiar.getValue().toString();
        //Hsalida = Spinner_hora_finalvisita_familiar.getValue().toString();
        //Msalida = Spinner_minutos_finalvisita_familiar.getValue().toString();
        
//        if (String.valueOf(Hingreso).length() == 1) {
//            Hingreso = "0"+Hingreso;
//        }
//        if (String.valueOf(Mingreso).length() == 1) {
//            Mingreso = "0"+Mingreso;
//        }
//        
//        if (String.valueOf(Hsalida).length() == 1) {
//            Hsalida = "0"+Hsalida;
//        }
//        if (String.valueOf(Msalida).length() == 1) {
//            Msalida="0"+Msalida;
//        }
//        
//        hora_inicioAux = Hingreso+":" + Mingreso;
//        hora_finAux = Hsalida+ ":" + Msalida;
//        
//        familiar.setHora_inicio(hora_inicioAux);
//        familiar.setHora_fin(hora_finAux);
//        familiar.setCodigo_de_paciente(text_codigoPaciente_familiar.getText());
//
//
//        if (familiar.InsertarFamiliar()) {
//            System.out.println("Conexion Exitosa");
//        } else {
//            System.out.println("Conexion Erronea");
//        }
    }

    public void limpiar() {
        //text_codigo_familiar.setText("");
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
        //text_codigoPaciente_familiar.setText("");
        //Spinner_horaIniciovisita_familiar.setValue(0);
        //Spinner_minutosIniciovisita_familiar.setValue(0);
       // Spinner_hora_finalvisita_familiar.setValue(0);
        //Spinner_minutos_finalvisita_familiar.setValue(0);

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField text_PrimerApellido_familiar;
    private javax.swing.JTextField text_PrimerNombre_familiar;
    private javax.swing.JTextField text_SegundoApellido_familiar;
    private javax.swing.JTextField text_SegundoNombre_familiar;
    private javax.swing.JTextField text_cedula_familiar;
    private javax.swing.JTextField text_celular_familiar;
    private javax.swing.JTextField text_direccion_familiar;
    private javax.swing.JTextField text_email_familiar;
    // End of variables declaration//GEN-END:variables
}
