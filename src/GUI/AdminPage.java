/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Files.ScaleImage;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AdminPage extends javax.swing.JFrame {
    Files.AdminPage adminPage = new Files.AdminPage();
    SimpleDateFormat format;
    DateFormat  dateFormat ;
    ScaleImage sImage = new ScaleImage();
    /**
     * Creates new form adminPage
     */
    public AdminPage() {
        initComponents();
        profileImage();
    }

    private void profileImage(){
        String imagePath = "/image/login.png";
        profileLabel.setIcon(sImage.scaledImage(profileLabel, imagePath));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reserveButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        roomManag = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableField = new javax.swing.JTable();
        logOut = new javax.swing.JButton();
        profileLabel = new javax.swing.JLabel();
        searchBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        returnLabel = new javax.swing.JLabel();
        editUpdate = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedUserField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        expandButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        reserveButton.setText("Reserve");
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        addUserButton.setText("New User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        roomManag.setText("Room-Manag");
        roomManag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomManagActionPerformed(evt);
            }
        });

        tableField.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User-ID", "First Name", "Last Name", "Age", "Email", "Phone "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFieldMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableField);

        logOut.setText("LogOut");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        searchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User-ID", "First Name", "Last Name", "Email", "Ph-Number" }));

        searchButton.setText("Search  BY");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        editUpdate.setText("Edit");
        editUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUpdateActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("selected user");

        selectedUserField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                selectedUserFieldFocusGained(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        expandButton.setText("userInfo");
        expandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(selectedUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(expandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addUserButton)
                                    .addComponent(roomManag))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(returnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(searchButton)
                                .addGap(18, 18, 18)
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logOut)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(selectedUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reserveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expandButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomManag)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        CreateUser newUser = new CreateUser();
        newUser.setVisible(true);
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
        int userID = 0;
        try{
            userID = Integer.parseInt(selectedUserField.getText());
            }catch(NumberFormatException ex){}
        AddReservePage reserveRoom = new AddReservePage();
        reserveRoom.getUserID(userID);
        reserveRoom.setVisible(true);
    }//GEN-LAST:event_reserveButtonActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        LoginPage page = new LoginPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tableField.getModel();
        tblModel.setRowCount(0);
        
        ResultSet rs = adminPage.searchBy(searchBox.getSelectedIndex(), searchField.getText());
        System.out.println(rs.toString()+"here ");
        if(rs == null || "".equalsIgnoreCase(rs.toString())){
            returnLabel.setText("Invalid Input or Input is not available");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        else{
            try {
                while(rs.next()){
                    String userID = Integer.toString(rs.getInt("USERID"));
                    String FName = rs.getString("FNAME");
                    String LName = rs.getString("LNAME");
                    String age = Integer.toString(rs.getInt("AGE"));
                    String email = rs.getString("EMAIL");
                    String phone = rs.getString("PHONE");

                    String custData[] = new String[]{userID, FName, LName, age, email, phone};
                    tblModel.addRow(custData);
                    returnLabel.setText("");
                } 
                
            } catch (SQLException ex) {
                Logger.getLogger(ReservationPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tableField.getModel();
        String userID = "";
        String fName = "";
        String lName = "";
        String age = "";
        String email = "";
        String phone = "";
        for(int i=0; i<tableField.getRowCount(); i++){
            userID = (String) tblModel.getValueAt(i, 0);
            fName = (String) tblModel.getValueAt(i, 1);
            lName = (String) tblModel.getValueAt(i, 2);
            age = (String) tblModel.getValueAt(i, 3);
            email = (String) tblModel.getValueAt(i, 4);
            phone = (String) tblModel.getValueAt(i, 5);
        }
        if(userID==null || userID.equalsIgnoreCase("") ){
            returnLabel.setText("There is no data/vale to be updated");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else if(fName==null || fName.equalsIgnoreCase("") ){
            returnLabel.setText("There is no data/vale to be updated");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else if(lName==null || lName.equalsIgnoreCase("") ){
            returnLabel.setText("There is no data/vale to be updated");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else if(age==null || age.equalsIgnoreCase("") ){
            returnLabel.setText("There is no data/vale to be updated");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else if(email==null || email.equalsIgnoreCase("") ){
            returnLabel.setText("There is no data/vale to be updated");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else if(phone==null || phone.equalsIgnoreCase("") ){
            returnLabel.setText("There is no data/vale to be updated");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else{
            adminPage.dataChange(userID, fName, lName, age, email, phone);
            System.out.println(userID+fName+lName+age+email+phone);  
        }
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void editUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUpdateActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tableField.getModel();
        int row = tableField.getSelectedRow();
        int column = tableField.getSelectedColumn();
      
        switch (tableField.getSelectedColumn()) {
            case 0:
                returnLabel.setText("You can not edit the User-ID");
                returnLabel.setForeground(Color.red);
                returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case 1:
                String fName = JOptionPane.showInputDialog("Input First Name");
                if(fName != null){
                    tblModel.setValueAt(fName, row, column);
                }
                else{}
                tableField.clearSelection();
                break;
            case 2:
                String lName = JOptionPane.showInputDialog("Input Last Name");
                if(lName != null){
                    tblModel.setValueAt(lName, row, column);
                }
                else{}
                tableField.clearSelection();
                break;
            case 3:
                String age = JOptionPane.showInputDialog("Input Age");
                if(age != null){
                    tblModel.setValueAt(age, row, column);
                }
                else{}
                tableField.clearSelection();
                break;
            case 4:
                String email = JOptionPane.showInputDialog("Input Email Address");
                if(email != null){
                    tblModel.setValueAt(email, row, column);
                }
                else{}
                tableField.clearSelection();
                break;
            case 5:
                String phone = JOptionPane.showInputDialog("Input Phone Number");
                if(phone != null){
                    tblModel.setValueAt(phone, row, column);
                }
                else{}
                tableField.clearSelection();
                break;
            default:
                break;
        }
 
    }//GEN-LAST:event_editUpdateActionPerformed

    private void tableFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFieldMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)tableField.getModel();
        selectedUserField.setText((String) tblModel.getValueAt(tableField.getSelectedRow(), 0));
    }//GEN-LAST:event_tableFieldMouseClicked

    private void selectedUserFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selectedUserFieldFocusGained
        selectedUserField.setEditable(false);
    }//GEN-LAST:event_selectedUserFieldFocusGained

    private void roomManagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomManagActionPerformed
        RoomManag roomManage = new RoomManag();
        roomManage.setVisible(true);
    }//GEN-LAST:event_roomManagActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(tableField.getValueAt(tableField.getSelectedRow(), 0) == null || "".equals(tableField.getValueAt(tableField.getSelectedRow(), 0))){
            returnLabel.setText("There is no data/vale selected");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        else{
            int reply = JOptionPane.showConfirmDialog(null, "are you sure, you want to delete selected row. All data will be lost and cant be retrieved", "confirm", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION){
                adminPage.deleteRecord(tableField.getValueAt(tableField.getSelectedRow(), 0).toString());
            }
            DefaultTableModel tblModel = (DefaultTableModel)tableField.getModel();
            tblModel.setRowCount(0);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        selectedUserField.setCaretColor(Color.WHITE);
    }//GEN-LAST:event_formWindowOpened

    private void expandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expandButtonActionPerformed
       if(selectedUserField.getText()==null || "".equalsIgnoreCase(selectedUserField.getText())){
            returnLabel.setText("There is no data/value selected");
            returnLabel.setForeground(Color.red);
            returnLabel.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else{
            int userID = 0;
            try{
                userID = Integer.parseInt(selectedUserField.getText());
            }catch(NumberFormatException ex){
            }
            ProfilePage proPage = new ProfilePage();
            proPage.getID(userID);
            proPage.setVisible(true);
        }
    }//GEN-LAST:event_expandButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editUpdate;
    private javax.swing.JButton expandButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOut;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JButton reserveButton;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JButton roomManag;
    private javax.swing.JComboBox<String> searchBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField selectedUserField;
    private javax.swing.JTable tableField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
