package forms;


public class Form_pagos extends javax.swing.JFrame {

  
    public Form_pagos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cbo_membresia = new javax.swing.JComboBox();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        cbo_dias_nuevo = new javax.swing.JComboBox();
        jLabel59 = new javax.swing.JLabel();
        cbo_meses_nuevo = new javax.swing.JComboBox();
        cbo_anios_nuevo = new javax.swing.JComboBox();
        jLabel60 = new javax.swing.JLabel();
        btn_guardar_pago = new javax.swing.JButton();
        btn_cancelar_pago = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        txt_cedula_nuevo = new javax.swing.JTextField();
        btn_nuevo_pago = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbo_dias_nuevo1 = new javax.swing.JComboBox();
        cbo_meses_nuevo1 = new javax.swing.JComboBox();
        cbo_anios_nuevo1 = new javax.swing.JComboBox();
        btn_cancelar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cbo_dias = new javax.swing.JComboBox();
        cbo_meses = new javax.swing.JComboBox();
        cbo_años = new javax.swing.JComboBox();
        txt_dir = new javax.swing.JTextField();
        txt_apellildos = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_result_cedula = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        cbo_dias2 = new javax.swing.JComboBox();
        cbo_meses2 = new javax.swing.JComboBox();
        cbo_años2 = new javax.swing.JComboBox();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(252, 250, 250));
        jTabbedPane1.setForeground(new java.awt.Color(110, 110, 110));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N

        jScrollPane1.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel56.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(110, 110, 110));
        jLabel56.setText("Últimos pagos");

        jSeparator2.setBackground(new java.awt.Color(51, 204, 255));

        cbo_membresia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_membresia.setForeground(new java.awt.Color(110, 110, 110));
        cbo_membresia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elije membresia" }));
        cbo_membresia.setToolTipText("");
        cbo_membresia.setBorder(null);
        cbo_membresia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_membresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_membresiaActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(110, 110, 110));
        jLabel58.setText("Membresia:");

        jLabel57.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(110, 110, 110));
        jLabel57.setText("Costo:");

        txt_costo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_costo.setForeground(new java.awt.Color(110, 110, 110));
        txt_costo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        cbo_dias_nuevo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias_nuevo.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias_nuevo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias_nuevo.setToolTipText("");
        cbo_dias_nuevo.setBorder(null);
        cbo_dias_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel59.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(110, 110, 110));
        jLabel59.setText("Fecha pago:");

        cbo_meses_nuevo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_meses_nuevo.setForeground(new java.awt.Color(110, 110, 110));
        cbo_meses_nuevo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_meses_nuevo.setToolTipText("");
        cbo_meses_nuevo.setBorder(null);
        cbo_meses_nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_meses_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_meses_nuevoActionPerformed(evt);
            }
        });

        cbo_anios_nuevo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_anios_nuevo.setForeground(new java.awt.Color(110, 110, 110));
        cbo_anios_nuevo.setToolTipText("");
        cbo_anios_nuevo.setBorder(null);
        cbo_anios_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_anios_nuevoActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(110, 110, 110));
        jLabel60.setText("Proximo pago:");

        btn_guardar_pago.setBackground(new java.awt.Color(0, 153, 204));
        btn_guardar_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_guardar_pago.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar_pago.setText("Guardar");
        btn_guardar_pago.setBorder(null);
        btn_guardar_pago.setBorderPainted(false);
        btn_guardar_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar_pago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_cancelar_pago.setBackground(new java.awt.Color(0, 153, 204));
        btn_cancelar_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar_pago.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar_pago.setText("Cancelar");
        btn_cancelar_pago.setBorder(null);
        btn_cancelar_pago.setBorderPainted(false);
        btn_cancelar_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel61.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(110, 110, 110));
        jLabel61.setText("Cédula:");

        txt_cedula_nuevo.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula_nuevo.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula_nuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));

        btn_nuevo_pago.setBackground(new java.awt.Color(0, 153, 204));
        btn_nuevo_pago.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_nuevo_pago.setForeground(new java.awt.Color(255, 255, 255));
        btn_nuevo_pago.setText("Nuevo");
        btn_nuevo_pago.setBorder(null);
        btn_nuevo_pago.setBorderPainted(false);
        btn_nuevo_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel62.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(110, 110, 110));
        jLabel62.setText("Pagos");

        jSeparator3.setBackground(new java.awt.Color(51, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        cbo_dias_nuevo1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias_nuevo1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias_nuevo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias_nuevo1.setToolTipText("");
        cbo_dias_nuevo1.setBorder(null);
        cbo_dias_nuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbo_meses_nuevo1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_meses_nuevo1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_meses_nuevo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_meses_nuevo1.setToolTipText("");
        cbo_meses_nuevo1.setBorder(null);
        cbo_meses_nuevo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_meses_nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_meses_nuevo1ActionPerformed(evt);
            }
        });

        cbo_anios_nuevo1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_anios_nuevo1.setForeground(new java.awt.Color(110, 110, 110));
        cbo_anios_nuevo1.setToolTipText("");
        cbo_anios_nuevo1.setBorder(null);
        cbo_anios_nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_anios_nuevo1ActionPerformed(evt);
            }
        });

        btn_cancelar1.setBackground(new java.awt.Color(250, 250, 250));
        btn_cancelar1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_cancelar1.setForeground(new java.awt.Color(110, 110, 110));
        btn_cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_home_64.png"))); // NOI18N
        btn_cancelar1.setText("Volver");
        btn_cancelar1.setAutoscrolls(true);
        btn_cancelar1.setBorder(null);
        btn_cancelar1.setBorderPainted(false);
        btn_cancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar1.setFocusPainted(false);
        btn_cancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelar1.setIconTextGap(-8);
        btn_cancelar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_cancelar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(497, 497, 497))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel61)
                        .addGap(67, 67, 67)
                        .addComponent(txt_cedula_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cbo_membresia, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btn_guardar_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_nuevo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_cancelar_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel57)
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbo_dias_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_dias_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_meses_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_meses_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_anios_nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_anios_nuevo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_cancelar1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jLabel62))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_cancelar1))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel61))
                    .addComponent(txt_cedula_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel58))
                    .addComponent(cbo_membresia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel57))
                    .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_dias_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(cbo_meses_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_anios_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_dias_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_meses_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_anios_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jLabel56)
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Nuevos", jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 110, 110));
        jLabel26.setText("Buscar  pagos");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 39, 197, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 110, 110));
        jLabel13.setText("Cédula:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 139, -1, -1));

        txt_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 202, 202), 1, true));
        jPanel2.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 129, 242, 39));

        btn_buscar.setBackground(new java.awt.Color(0, 153, 204));
        btn_buscar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 129, 100, 40));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 110, 110));
        jLabel20.setText("Resultados de búsqueda");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 229, 310, -1));

        btn_editar.setBackground(new java.awt.Color(0, 153, 204));
        btn_editar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.setBorder(null);
        btn_editar.setBorderPainted(false);
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 289, 100, 40));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 110, 110));
        jLabel16.setText("Acciones:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 299, 100, -1));

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 204));
        btn_actualizar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(null);
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 100, 40));

        btn_eliminar.setBackground(new java.awt.Color(0, 153, 204));
        btn_eliminar.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 289, 100, 40));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 110, 110));
        jLabel19.setText("Cédula:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 110, 110));
        jLabel17.setText("Nombres:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 110, 110));
        jLabel18.setText("Apellidos:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 110, 110));
        jLabel21.setText("Dirección:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 110, 110));
        jLabel22.setText("Fecha pago:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, -1, -1));

        cbo_dias.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias.setToolTipText("");
        cbo_dias.setBorder(null);
        cbo_dias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cbo_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 80, 33));

        cbo_meses.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_meses.setForeground(new java.awt.Color(110, 110, 110));
        cbo_meses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_meses.setToolTipText("");
        cbo_meses.setBorder(null);
        cbo_meses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_meses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_mesesActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 140, 33));

        cbo_años.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_años.setForeground(new java.awt.Color(110, 110, 110));
        cbo_años.setToolTipText("");
        cbo_años.setBorder(null);
        cbo_años.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_añosActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_años, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 640, 110, 33));

        txt_dir.setBackground(new java.awt.Color(197, 230, 197));
        txt_dir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_dir.setForeground(new java.awt.Color(110, 110, 110));
        txt_dir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 431, 39));

        txt_apellildos.setBackground(new java.awt.Color(197, 230, 197));
        txt_apellildos.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_apellildos.setForeground(new java.awt.Color(110, 110, 110));
        txt_apellildos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_apellildos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 431, 39));

        txt_nombres.setBackground(new java.awt.Color(197, 230, 197));
        txt_nombres.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_nombres.setForeground(new java.awt.Color(110, 110, 110));
        txt_nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 431, 39));

        txt_result_cedula.setBackground(new java.awt.Color(197, 230, 197));
        txt_result_cedula.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        txt_result_cedula.setForeground(new java.awt.Color(110, 110, 110));
        txt_result_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 214, 162), 1, true));
        jPanel2.add(txt_result_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 431, 39));

        jSeparator4.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 359, 589, 11));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 110, 110));
        jLabel23.setText("Fecha prox pago:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, -1, -1));

        cbo_dias2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_dias2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_dias2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbo_dias2.setToolTipText("");
        cbo_dias2.setBorder(null);
        cbo_dias2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(cbo_dias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 80, 33));

        cbo_meses2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_meses2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_meses2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbo_meses2.setToolTipText("");
        cbo_meses2.setBorder(null);
        cbo_meses2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_meses2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_meses2ActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_meses2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 700, 140, 33));

        cbo_años2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbo_años2.setForeground(new java.awt.Color(110, 110, 110));
        cbo_años2.setToolTipText("");
        cbo_años2.setBorder(null);
        cbo_años2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_años2ActionPerformed(evt);
            }
        });
        jPanel2.add(cbo_años2, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 700, 110, 33));

        jSeparator5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 98, 589, 11));

        jScrollPane3.setViewportView(jPanel2);

        jTabbedPane1.addTab("Detalles de Pagos", jScrollPane3);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_membresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_membresiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_membresiaActionPerformed

    private void cbo_meses_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_meses_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_meses_nuevoActionPerformed

    private void cbo_anios_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_anios_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_anios_nuevoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void cbo_mesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_mesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_mesesActionPerformed

    private void cbo_añosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_añosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_añosActionPerformed

    private void cbo_meses2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_meses2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_meses2ActionPerformed

    private void cbo_años2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_años2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_años2ActionPerformed

    private void cbo_meses_nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_meses_nuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_meses_nuevo1ActionPerformed

    private void cbo_anios_nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_anios_nuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_anios_nuevo1ActionPerformed

    
    
/*-----------------------------------------------------------------------------
  Metodo para volver al menu de inicio  
 ------------------------------------------------------------------------------*/
    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        Home frm_home =new Home();
        frm_home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_cancelar_pago;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar_pago;
    private javax.swing.JButton btn_nuevo_pago;
    private javax.swing.JComboBox cbo_anios_nuevo;
    private javax.swing.JComboBox cbo_anios_nuevo1;
    private javax.swing.JComboBox cbo_años;
    private javax.swing.JComboBox cbo_años2;
    private javax.swing.JComboBox cbo_dias;
    private javax.swing.JComboBox cbo_dias2;
    private javax.swing.JComboBox cbo_dias_nuevo;
    private javax.swing.JComboBox cbo_dias_nuevo1;
    private javax.swing.JComboBox cbo_membresia;
    private javax.swing.JComboBox cbo_meses;
    private javax.swing.JComboBox cbo_meses2;
    private javax.swing.JComboBox cbo_meses_nuevo;
    private javax.swing.JComboBox cbo_meses_nuevo1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_apellildos;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cedula_nuevo;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_result_cedula;
    // End of variables declaration//GEN-END:variables
}