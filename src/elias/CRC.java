package elias;

import javax.swing.JOptionPane;

public class CRC extends javax.swing.JFrame {
    int[] mensaje;
    int[] div;
    int[] divisor;
    int[] rem;
    int[] crc_code;
    int totalBitsMsnj, totalBitsDiv, tot_length, i = 0, j = 0;
    
    public CRC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_crc = new rscomponentshade.RSTextFieldShade();
        btn_comproCRC = new javax.swing.JButton();
        lbl_message = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_bitMsn = new rscomponentshade.RSTextFieldShade();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_numberBitMsn = new rscomponentshade.RSTextFieldShade();
        txt_numberBitDiv = new rscomponentshade.RSTextFieldShade();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_bitDiv = new rscomponentshade.RSTextFieldShade();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_sendBitDiv = new rojerusan.RSMaterialButton();
        btn_checkNumberBitsDiv = new rojerusan.RSMaterialButton();
        btn_checkNumberBits = new rojerusan.RSMaterialButton();
        btn_sendBitMsnj = new rojerusan.RSMaterialButton();
        btn_sendData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(589, 415));
        setMinimumSize(new java.awt.Dimension(589, 415));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(589, 415));
        jPanel1.setMinimumSize(new java.awt.Dimension(589, 415));
        jPanel1.setPreferredSize(new java.awt.Dimension(589, 415));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(222, 222, 222), 1, true), "Resultados", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 106, -1, -1));
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 65, -1, -1));

        jLabel20.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel20.setText("Mensaje despues de dividir:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 20));

        txt_crc.setBgShade(new java.awt.Color(51, 255, 51));
        txt_crc.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_crc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_crc.setPlaceholder("");
        txt_crc.setRound(10);
        jPanel3.add(txt_crc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 15, 220, 30));

        btn_comproCRC.setBackground(new java.awt.Color(255, 255, 255));
        btn_comproCRC.setText("Comprobar Mensaje");
        btn_comproCRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comproCRCActionPerformed(evt);
            }
        });
        jPanel3.add(btn_comproCRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        lbl_message.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(lbl_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(222, 222, 222), 1, true), "Captura de Datos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 106, -1, -1));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 65, -1, -1));

        txt_bitMsn.setBgShade(new java.awt.Color(0, 255, 204));
        txt_bitMsn.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_bitMsn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_bitMsn.setPlaceholder("");
        txt_bitMsn.setRound(10);
        jPanel2.add(txt_bitMsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 70, 30));

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel12.setText("Ingrese bit por bit:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 20));

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel11.setText("Total de bits del mensaje:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 20));

        txt_numberBitMsn.setBgShade(new java.awt.Color(255, 51, 51));
        txt_numberBitMsn.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_numberBitMsn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_numberBitMsn.setPlaceholder("");
        txt_numberBitMsn.setRound(10);
        jPanel2.add(txt_numberBitMsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 15, 70, 30));

        txt_numberBitDiv.setBgShade(new java.awt.Color(255, 51, 51));
        txt_numberBitDiv.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_numberBitDiv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_numberBitDiv.setPlaceholder("");
        txt_numberBitDiv.setRound(10);
        jPanel2.add(txt_numberBitDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 95, 70, 30));

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel13.setText("Total de bits del divisor:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 20));

        jLabel16.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel16.setText("Ingrese bits del divisor:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, 20));

        txt_bitDiv.setBgShade(new java.awt.Color(0, 255, 204));
        txt_bitDiv.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_bitDiv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_bitDiv.setPlaceholder("");
        txt_bitDiv.setRound(10);
        jPanel2.add(txt_bitDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 135, 70, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elias/baseline_check_black_18dp.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elias/baseline_check_black_18dp.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elias/baseline_send_black_18dp.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elias/baseline_send_black_18dp.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 60, -1, -1));

        btn_sendBitDiv.setBackground(new java.awt.Color(13, 71, 161));
        btn_sendBitDiv.setOpaque(true);
        btn_sendBitDiv.setTypeBorder(rojerusan.RSMaterialButton.TYPEBORDER.ROUND);
        btn_sendBitDiv.setTypeButton(rojerusan.RSMaterialButton.TYPEBUTTON.PRIMARY);
        btn_sendBitDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendBitDivActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sendBitDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 135, 40, 30));

        btn_checkNumberBitsDiv.setBackground(new java.awt.Color(0, 102, 102));
        btn_checkNumberBitsDiv.setOpaque(true);
        btn_checkNumberBitsDiv.setTypeBorder(rojerusan.RSMaterialButton.TYPEBORDER.ROUND);
        btn_checkNumberBitsDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkNumberBitsDivActionPerformed(evt);
            }
        });
        jPanel2.add(btn_checkNumberBitsDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 95, 40, 30));

        btn_checkNumberBits.setBackground(new java.awt.Color(0, 102, 102));
        btn_checkNumberBits.setOpaque(true);
        btn_checkNumberBits.setTypeBorder(rojerusan.RSMaterialButton.TYPEBORDER.ROUND);
        btn_checkNumberBits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkNumberBitsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_checkNumberBits, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 15, 40, 30));

        btn_sendBitMsnj.setBackground(new java.awt.Color(13, 71, 161));
        btn_sendBitMsnj.setOpaque(true);
        btn_sendBitMsnj.setTypeBorder(rojerusan.RSMaterialButton.TYPEBORDER.ROUND);
        btn_sendBitMsnj.setTypeButton(rojerusan.RSMaterialButton.TYPEBUTTON.PRIMARY);
        btn_sendBitMsnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendBitMsnjActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sendBitMsnj, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 55, 40, 30));

        btn_sendData.setBackground(new java.awt.Color(255, 255, 255));
        btn_sendData.setText("Enviar Datos");
        btn_sendData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendDataActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sendData, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sendBitDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendBitDivActionPerformed
        
        String bits = txt_bitDiv.getText();
        if("".equals(txt_bitDiv.getText())){
            JOptionPane.showMessageDialog(null, "Falta llenar campos");
        } else {
            int bit;
            for (int k = 0; k < txt_bitDiv.getText().length(); k++) {
                bit = Character.getNumericValue(bits.charAt(k));
                System.out.println(bit);
                divisor[k] = bit;
            }
            txt_bitDiv.setEditable(false);
            btn_sendBitDiv.setEnabled(false);
        }
    }//GEN-LAST:event_btn_sendBitDivActionPerformed

    private void btn_sendBitMsnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendBitMsnjActionPerformed
        String bits = txt_bitMsn.getText();
        
        if("".equals(txt_bitMsn.getText())){
            JOptionPane.showMessageDialog(null, "Falta llenar campos");
        } else {
            int bit;
            for (int k = 0; k < txt_bitMsn.getText().length(); k++) {
                bit = Character.getNumericValue(bits.charAt(k));
                System.out.println(bit);
                mensaje[k] = bit;
            }
            txt_bitMsn.setEditable(false);
            btn_sendBitMsnj.setEnabled(false);
        }
    }//GEN-LAST:event_btn_sendBitMsnjActionPerformed

    private void btn_checkNumberBitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkNumberBitsActionPerformed
        if("".equals(txt_numberBitMsn.getText())){
            JOptionPane.showMessageDialog(null, "Falta llenar campos");
        } else {
            totalBitsMsnj = Integer.parseInt(txt_numberBitMsn.getText());
            mensaje = new int[totalBitsMsnj];
            btn_checkNumberBits.setEnabled(false);
        }
    }//GEN-LAST:event_btn_checkNumberBitsActionPerformed

    private void btn_checkNumberBitsDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkNumberBitsDivActionPerformed
        if("".equals(txt_numberBitDiv.getText())){
            JOptionPane.showMessageDialog(null, "Falta llenar campos");
        } else {
            totalBitsDiv = Integer.parseInt(txt_numberBitDiv.getText());
            divisor = new int[totalBitsDiv];
            btn_checkNumberBitsDiv.setEnabled(false);
            txt_numberBitDiv.setEditable(false);
        }
    }//GEN-LAST:event_btn_checkNumberBitsDivActionPerformed

    private void btn_sendDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendDataActionPerformed
        tot_length = totalBitsMsnj + totalBitsDiv - 1;
        div = new int[tot_length];
        rem = new int[tot_length];
        crc_code = new int[tot_length];
        getCRC();
        
        
        
    }//GEN-LAST:event_btn_sendDataActionPerformed

    private void btn_comproCRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comproCRCActionPerformed
        int bit;
        String bits = txt_crc.getText();
        for (int k = 0; k < txt_crc.getText().length(); k++) {
            bit = Character.getNumericValue(bits.charAt(k));
            crc_code[k] = bit;
        }
               
        for(int j = 0; j < crc_code.length; j++){
              rem[j] = crc_code[j];
        }
   
        rem = divide(crc_code, divisor, rem);
       
        for(int i = 0; i < rem.length; i++)
        {
            if(rem[i] != 0)
            {
                lbl_message.setText("Error");
                break;
            }
            if(i == rem.length-1)
                lbl_message.setText("El mensaje no contiene errores");
        }
    }//GEN-LAST:event_btn_comproCRCActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(CRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButton btn_checkNumberBits;
    private rojerusan.RSMaterialButton btn_checkNumberBitsDiv;
    private javax.swing.JButton btn_comproCRC;
    private rojerusan.RSMaterialButton btn_sendBitDiv;
    private rojerusan.RSMaterialButton btn_sendBitMsnj;
    private javax.swing.JButton btn_sendData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_message;
    private rscomponentshade.RSTextFieldShade txt_bitDiv;
    private rscomponentshade.RSTextFieldShade txt_bitMsn;
    private rscomponentshade.RSTextFieldShade txt_crc;
    private rscomponentshade.RSTextFieldShade txt_numberBitDiv;
    private rscomponentshade.RSTextFieldShade txt_numberBitMsn;
    // End of variables declaration//GEN-END:variables
    private void getCRC(){
        for(int i = 0; i < mensaje.length; i++)
            div[i] = mensaje[i];
       
       
        for(int k = 0; k < div.length; k++){
              rem[k] = div[k];
        }
   
        rem = divide(div, divisor, rem);
       
        for(int l = 0; l < div.length; l++)          
        {
            crc_code[l] = (div[l] ^ rem[l]);
        }
        String code = "";
        for(int i = 0; i < crc_code.length; i++){
           code = code + Integer.toString(crc_code[i]);
        }
            txt_crc.setText(code);
    }
    
    private static int[] divide(int div[], int divisor[], int rem[])
    {
        int cur = 0;
        while(true)
        {
            for(int i = 0; i < divisor.length; i++)
                rem[cur + i] = (rem[cur + i] ^ divisor[i]);
           
            while(rem[cur] == 0 && cur != rem.length - 1)
                cur++;
   
            if((rem.length - cur) < divisor.length)
                break;
        }
        return rem;
    }
}

