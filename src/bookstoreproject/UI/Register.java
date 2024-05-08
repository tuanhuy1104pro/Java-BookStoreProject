/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoreproject.UI;

import bookstoreproject.DAO.User;
import bookstoreproject.Entities.Connect;
import bookstoreproject.UI.Admin.Index;
import bookstoreproject.UI.User.IndexU;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setSize(730, 520);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnRegis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        miExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1080, 720));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Đăng Ký");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        btnRegis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegis.setText("Đăng Ký");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("File");

        miExit.setText("Exit");
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegis)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnRegis)
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        // TODO add your handling code here:
        try{
            Connect ConnectInstance  = new Connect();
            ConnectInstance.Connect();
            Statement statement = ConnectInstance.conn.createStatement();
            String CoutQuery = "select Count(UserId) as CountById from Users;";
            ResultSet countResult = statement.executeQuery(CoutQuery);
            countResult.next();
            int NumberMember = Integer.parseInt(countResult.getString("CountById"));
            //Validation
            String validation ="";
            //
            if(txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty() ||txtConfirmPassword.getText().isEmpty())
            {
                if(txtUserName.getText().isEmpty())
                    validation += "Username must be fill ";
                if(txtPassword.getText().isEmpty())
                    validation += "- Password must be fill ";
                if(txtConfirmPassword.getText().isEmpty())
                    validation += "- Confirm password must be fill ";
                JOptionPane.showMessageDialog(null, validation, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(!txtPassword.getText().equals(txtConfirmPassword.getText()))
            {
                JOptionPane.showMessageDialog(null,"Confirm password phải đúng với pasword đã nhập","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            ////////////////////////Exist validation
            String FindUser = "Select * from Users where UserName ='"
                    +txtUserName.getText()
                    +"' " 
                    +" and"
                    + " UserPass = '"
                    +txtPassword.getText()
                    +"'" ;
             ResultSet FindResult  = statement.executeQuery(FindUser);
            if(FindResult.next()){
                 JOptionPane.showMessageDialog(null, "Tài Khoản đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                 return;
            }
            /////////////////////// exist validation
            //Validation
            
            NumberMember++;
            String InsertQuery = "insert into Users(UserId,UserName,UserPass,FullName,UserRole) values('"
                    +"U"+NumberMember
                    +"','"
                    +txtUserName.getText()
                    +"','"
                    +txtPassword.getText()
                    + "','"
                    +"','User');";
                    
            //Auto Login after Register
            Statement state = ConnectInstance.conn.createStatement();
            int row = state.executeUpdate(InsertQuery);
            if(row == 0)
            {
                ConnectInstance.conn.close();
             JOptionPane.showMessageDialog(null,"error","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
             JOptionPane.showMessageDialog(null,"Tạo tài khoản thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            
             String select = "Select * from Users where UserName ='"
                    +txtUserName.getText()
                    +"' " 
                    +" and"
                    + " UserPass = '"
                    +txtPassword.getText()
                    +"'" ;
                    
            ResultSet resultSet  = statement.executeQuery(select);
            if(resultSet.next()){
                String role = resultSet.getString("UserRole");
                if(role.equals("Admin"))
                {
                     User Userinstance = new User();
                        Userinstance.setUserName(resultSet.getString("UserName"));
                        Userinstance.setUserPass(resultSet.getString("UserPass"));
                        Userinstance.setFullName(resultSet.getString("FullName"));
                        Userinstance.setUserAddress(resultSet.getString("UserAddress"));
                        Userinstance.setPhoneNumber(resultSet.getString("PhoneNumber"));
                        Userinstance.setUserRole(resultSet.getString("UserRole"));
        
                    Index  openNewFormButton = new Index(Userinstance);
                    openNewFormButton.setDefaultCloseOperation(openNewFormButton.DISPOSE_ON_CLOSE);
                    openNewFormButton.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        // Khi form mới đóng, hiện lại form cũ
                         setVisible(true);
                    }
                });
                 setVisible(false);
                 openNewFormButton.setVisible(true);
                 /////// trỏ tới index
                }
                //Thật ra thì thằng admin nó chẳng bao giờ tới đâu, chỉ là để phòng hờ lỗi thôi -> xóa cũng được do lúc đăng ký thì thằng nào chả là User :))
                if(role.equals("User"))
                {
                    User Userinstance = new User();
                        Userinstance.setUserName(resultSet.getString("UserName"));
                        Userinstance.setUserPass(resultSet.getString("UserPass"));
                        Userinstance.setFullName(resultSet.getString("FullName"));
                        Userinstance.setUserAddress(resultSet.getString("UserAddress"));
                        Userinstance.setPhoneNumber(resultSet.getString("PhoneNumber"));
                        Userinstance.setUserRole(resultSet.getString("UserRole"));
        
                    IndexU  openNewFormButton = new IndexU(Userinstance);
                    openNewFormButton.setDefaultCloseOperation(openNewFormButton.DISPOSE_ON_CLOSE);
                    openNewFormButton.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        // Khi form mới đóng, hiện lại form cũ
                         setVisible(true);
                    }
                    });
                    setVisible(false);
                    openNewFormButton.setVisible(true);
                 /////// trỏ tới index
                }
                 //////// trỏ tới index của admin -> Khi form mới close thì form cũ sẽ bật lại
                 
                 //CLsoe instance sql
                
            }
           //Auto Login after Register
             ConnectInstance.conn.close();
             
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
