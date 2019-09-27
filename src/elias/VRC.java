package elias;

import java.io.Console;
import javax.swing.table.DefaultTableModel;

public class VRC extends javax.swing.JFrame {

    private String [] codeBinary = null;
    private int longArray = 0;
    
    public VRC() {   
        initComponents();
    }

    public String[] convertToBinary(String palabra){
        String charBinary;
        int x = 0, total = palabra.length();
        String [] codeBin = new String[total];
        
        for (int i = 0; i < palabra.length(); i++){        
            x = palabra.charAt(i);
            charBinary = Integer.toBinaryString(x);
            codeBin[i] = charBinary;
        }
        return codeBin;        
    } 
    
    public  int countOnes(String codAscii){
        int cont = 0;          
        for (int i = 0; i < codAscii.length(); i++){
            if (codAscii.charAt(i) == '1'){
                cont++;
            }
        }
        System.out.println(cont);
        return cont;
        }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_inputWord = new rscomponentshade.RSTextFieldShade();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_restart = new rojerusan.RSMaterialButton();
        btn_sendString = new rojerusan.RSMaterialButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_codeOutput = new rscomponentshade.RSTextFieldShade();
        jLabel17 = new javax.swing.JLabel();
        btn_addBitPar = new rojerusan.RSMaterialButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_outputFinal = new rscomponentshade.RSTextFieldShade();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(222, 222, 222), 1, true), "Captura de Datos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel11.setText("Palabra o frase:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 100, 20));

        txt_inputWord.setBgShade(new java.awt.Color(153, 255, 153));
        txt_inputWord.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_inputWord.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_inputWord.setPlaceholder("Ejemplo: \"Hola\"");
        txt_inputWord.setRound(10);
        jPanel2.add(txt_inputWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 220, 30));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 106, -1, -1));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 65, -1, -1));

        btn_restart.setBackground(new java.awt.Color(13, 71, 161));
        btn_restart.setText("Reiniciar");
        btn_restart.setOpaque(true);
        btn_restart.setTypeBorder(rojerusan.RSMaterialButton.TYPEBORDER.ROUND);
        btn_restart.setTypeButton(rojerusan.RSMaterialButton.TYPEBUTTON.SECONDARY);
        btn_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restartActionPerformed(evt);
            }
        });
        jPanel2.add(btn_restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 140, 30));

        btn_sendString.setBackground(new java.awt.Color(13, 71, 161));
        btn_sendString.setText("Enviar");
        btn_sendString.setOpaque(true);
        btn_sendString.setTypeBorder(rojerusan.RSMaterialButton.TYPEBORDER.ROUND);
        btn_sendString.setTypeButton(rojerusan.RSMaterialButton.TYPEBUTTON.PRIMARY);
        btn_sendString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendStringActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sendString, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 140, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(222, 222, 222), 1, true), "Resultado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 106, -1, -1));
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 65, -1, -1));

        txt_codeOutput.setBgShade(new java.awt.Color(153, 255, 153));
        txt_codeOutput.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_codeOutput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_codeOutput.setPlaceholder("");
        txt_codeOutput.setRound(10);
        jPanel3.add(txt_codeOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 270, 30));

        jLabel17.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        jLabel17.setText("Codigo ASCCI");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 100, 20));

        btn_addBitPar.setBackground(new java.awt.Color(13, 71, 161));
        btn_addBitPar.setText("Agregar Paridad");
        btn_addBitPar.setOpaque(true);
        btn_addBitPar.setTypeBorder(rojerusan.RSMaterialButton.TYPEBORDER.ROUND);
        btn_addBitPar.setTypeButton(rojerusan.RSMaterialButton.TYPEBUTTON.PRIMARY);
        btn_addBitPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBitParActionPerformed(evt);
            }
        });
        jPanel3.add(btn_addBitPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 140, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(222, 222, 222), 1, true), "Codigo + VRC", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 106, -1, -1));
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 65, -1, -1));

        txt_outputFinal.setBgShade(new java.awt.Color(153, 255, 153));
        txt_outputFinal.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_outputFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_outputFinal.setPlaceholder("");
        txt_outputFinal.setRound(10);
        jPanel4.add(txt_outputFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 490, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sendStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendStringActionPerformed
        String textInit=txt_inputWord.getText(), binario = "";
        codeBinary = convertToBinary(textInit);
        longArray = codeBinary.length;
        
         for(int i = 0; i < longArray; i++){ 
            binario = binario + codeBinary[i] + " - ";
        }
        txt_codeOutput.setText(binario);          
    }//GEN-LAST:event_btn_sendStringActionPerformed

    private void btn_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restartActionPerformed
        txt_inputWord.setText("");
        txt_codeOutput.setText("");
        txt_outputFinal.setText("");
    }//GEN-LAST:event_btn_restartActionPerformed

    private void btn_addBitParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBitParActionPerformed
        String binario = "";
        longArray = codeBinary.length;
        String [] vrc = new String[longArray];
        int par = 0;
        for(int i = 0; i < longArray; i++){           
            par = countOnes(codeBinary[i]);
            if(par % 2 == 0){
                  vrc[i] = "0";
            }else{
                vrc[i] = "1";
            }
        }       
        
        for(int i = 0; i < longArray; i++){
            codeBinary[i] = codeBinary[i] + "[" + vrc[i] + "] - ";
        }
        for(int i = 0; i < longArray; i++){
            binario = binario + codeBinary[i] + "\n";
        }
        txt_outputFinal.setText(binario);
    }//GEN-LAST:event_btn_addBitParActionPerformed

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
            java.util.logging.Logger.getLogger(VRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButton btn_addBitPar;
    private rojerusan.RSMaterialButton btn_restart;
    private rojerusan.RSMaterialButton btn_sendString;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private rscomponentshade.RSTextFieldShade txt_codeOutput;
    private rscomponentshade.RSTextFieldShade txt_inputWord;
    private rscomponentshade.RSTextFieldShade txt_outputFinal;
    // End of variables declaration//GEN-END:variables
}
