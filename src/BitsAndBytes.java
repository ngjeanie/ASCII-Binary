
/*
 *Name: Jeanie (Tsz-Ying) Ng
 *Date: July 16th 2018
 *Title: Secret Message Converter 
 *Purpose: To convert a secret message written in Enlgish to ASCII and then into binary to output
 */

public class BitsAndBytes extends javax.swing.JFrame {

    public BitsAndBytes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblSecretMessageConverter = new javax.swing.JLabel();
        lblEnterMessage = new javax.swing.JLabel();
        txtSecretMessage = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();
        lblOutputB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(204, 204, 255));

        lblSecretMessageConverter.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        lblSecretMessageConverter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSecretMessageConverter.setText("Secret Message Converter");

        lblEnterMessage.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lblEnterMessage.setText("<html> Enter Your Secret Message Here <br> (approximately 15 characters): <html>");

        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        lblOutput.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblOutput.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblOutputB.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblOutputB.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOutputB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSecretMessageConverter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConvert))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblEnterMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSecretMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSecretMessageConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSecretMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConvert)
                .addGap(13, 13, 13)
                .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutputB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String strSecretMessage, strASCII, strBinary, strBinaryOutput; //Declaration of string variables
    int i; //Declaration of integer variables 
    
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
    strSecretMessage = this.txtSecretMessage.getText(); //Converts the message input into txtSecretMessage into a string variable stored in strSecretMessage
    
    strASCII = " "; //Gives a value of " " to strASCII so that it doesn't read "null" before any text is added onto it
    strBinaryOutput = " "; //Gives a value of " " to strBinaryOutput so that it doesn't read "null" before any text is added onto it
    for (i = 0; i < strSecretMessage.length(); i++){
        lblOutput.setText("ASCII: " + (strASCII += (int) strSecretMessage.charAt(i) + " "));
        strBinary = Integer.toBinaryString(strSecretMessage.charAt(i));
        lblOutputB.setText("Binary: " + (strBinaryOutput += strBinary + " "));
    } /*Integer i starts at zero and will increase at intervals of "1" until the length of the message is reached 
        When we start i at 0, the program will read the characters of the message that is input into the program at index zero until the last character of the message
        strASCII adds on the additional ASCII character of the next letter everytime the loop runs via the += operation
        In order to get the ASCII code of a specific letter (int) strSecretMessage.charAt(i) is used, i is used as the integer because i will increase by 1 (will shift one letter to the right) until the length of the message is read
        The ASCII characters are displayed in lblOutput along with "ASCII: " and a space is added into strASCII to separate the ASCII characters
        Integer.toBinaryString converts integers into binary; because the ASCII characters stored in strSecretMessage are integers, the ASCII characters representing the English characters in the code will be converted to binary and stored in strBinary
        strBinaryOutput adds on the additional binary codes of the following letters in the message as the loop repeats and is displayed in lblOutputB along with "Binary: " and a space to separate the binary codes for each individual letter 
      */
    }//GEN-LAST:event_btnConvertActionPerformed

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
            java.util.logging.Logger.getLogger(BitsAndBytes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BitsAndBytes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BitsAndBytes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BitsAndBytes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BitsAndBytes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel lblEnterMessage;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblOutputB;
    private javax.swing.JLabel lblSecretMessageConverter;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtSecretMessage;
    // End of variables declaration//GEN-END:variables
}
