/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Files.Registration;
import Files.LoginPage;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author User
 */
public class ProfilePage extends javax.swing.JFrame {
    Registration register = new Registration();
    LoginPage logPage = new LoginPage();
    private int userID;
    /**
     * Creates new form ProfilePage
     */
    public ProfilePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        userNField = new javax.swing.JTextField();
        pwField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        pNField = new javax.swing.JTextField();
        returnMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        updateButton.setText("update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lNameField))
                    .addComponent(EmailField, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(userNField, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pwField, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(pNField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lNameField)
                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ageField)
                    .addComponent(pNField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userNField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void getID(int userID){
        this.userID = userID;
    }
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ResultSet rs = register.getUser(userID);
        ResultSet bRS = logPage.getLogin(userID);
        try {
                while(rs.next()){
                    String FName = rs.getString("FNAME");
                    String LName = rs.getString("LNAME");
                    String age = Integer.toString(rs.getInt("AGE"));
                    String email = rs.getString("EMAIL");
                    String phone = rs.getString("PHONE");
                    
                    fNameField.setText(FName);
                    lNameField.setText(LName);
                    ageField.setText(age);
                    EmailField.setText(email);
                    pNField.setText(phone);  
                } 
                while(bRS.next()){
                    String userName = bRS.getString("USERNAME");
                    String password = bRS.getString("PASSWORD");
                    
                    userNField.setText(userName);
                    pwField.setText(password);
                }
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
    }//GEN-LAST:event_formWindowOpened

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        while(register.check(fNameField.getText(), lNameField.getText(), ageField.getText(), pNField.getText(), EmailField.getText())==false ){
           returnMessage.setText(register.checkInfo(fNameField.getText(), lNameField.getText(), ageField.getText(), pNField.getText(), EmailField.getText()));
           returnMessage. setHorizontalAlignment(SwingConstants. CENTER);
           returnMessage.setForeground(Color.red);
            break;
        }
        if(logPage.checkUserName(userID, userNField.getText())==false){
            returnMessage.setText("This username is used");
            returnMessage. setHorizontalAlignment(SwingConstants. CENTER);
            returnMessage.setForeground(Color.red);
        }
        else if("Password".equalsIgnoreCase(pwField.getText())){
            returnMessage.setText("Please enter a password");
            returnMessage. setHorizontalAlignment(SwingConstants. CENTER);
            returnMessage.setForeground(Color.red);     
        }
        else if(register.check(fNameField.getText(), lNameField.getText(), ageField.getText(), pNField.getText(), EmailField.getText())==true){
            int reply = JOptionPane.showConfirmDialog(null, "All data that has been altered will be lost and cant be retrieved after this update",
                    "confirm", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION){
                register.updateReg(userID, fNameField.getText(), lNameField.getText(), ageField.getText(), EmailField.getText(), pNField.getText());
                logPage.updateLogin(userID, userNField.getText().replaceAll("\\s+",""), pwField.getText());
                ReservationPage reserve = new ReservationPage();
                reserve.getuserName(userNField.getText());   
                this.dispose();   
            } 
        }
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ProfilePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField fNameField;
    private javax.swing.JTextField lNameField;
    private javax.swing.JTextField pNField;
    private javax.swing.JTextField pwField;
    private javax.swing.JLabel returnMessage;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userNField;
    // End of variables declaration//GEN-END:variables
}
