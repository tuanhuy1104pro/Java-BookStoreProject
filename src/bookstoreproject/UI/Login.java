/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoreproject.UI;
import bookstoreproject.DAO.User;
import bookstoreproject.Entities.Connect;
import bookstoreproject.UI.Admin.Index;
import bookstoreproject.UI.User.IndexU;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Statement;
import java.sql.SQLException;
import  java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Login() {
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
        btnLogin = new javax.swing.JButton();
        txtQuenMk = new javax.swing.JLabel();
        txtNoAccount = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        miExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setSize(new java.awt.Dimension(1080, 720));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Đăng Nhập");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        txtUserName.setText("teominh@gmail.com");

        txtPassword.setText("teo123");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtQuenMk.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtQuenMk.setForeground(new java.awt.Color(255, 0, 0));
        txtQuenMk.setText("Quên mật khẩu?");
        txtQuenMk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuenMkMouseClicked(evt);
            }
        });

        txtNoAccount.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtNoAccount.setForeground(new java.awt.Color(0, 102, 255));
        txtNoAccount.setText("Chưa có tài khoản?");
        txtNoAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNoAccountMouseClicked(evt);
            }
        });

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
                .addComponent(txtQuenMk, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNoAccount)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(143, 143, 143))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addGap(154, 154, 154))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnLogin)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoAccount)
                    .addComponent(txtQuenMk)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuenMkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuenMkMouseClicked
        // TODO add your handling code here:
        //////// trỏ tới index của admin -> Khi form mới close thì form cũ sẽ bật lại
        QuenMatKhau  openNewFormButton = new QuenMatKhau();
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
           
    }//GEN-LAST:event_txtQuenMkMouseClicked

    private void txtNoAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNoAccountMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        //////// trỏ tới index của admin -> Khi form mới close thì form cũ sẽ bật lại
        Register  openNewFormButton = new Register();
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
    }//GEN-LAST:event_txtNoAccountMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        try{
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
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
                if(role.equals("User"))
                {
                    User Userinstance = new User();
                        Userinstance.setUserName(resultSet.getString("UserName"));
                        Userinstance.setUserPass(resultSet.getString("UserPass"));
        
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
                 sqlinstance.conn.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Email hoặc mật khẩu không đúng!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
        
        }catch( Exception ex)
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JLabel txtNoAccount;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JLabel txtQuenMk;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
