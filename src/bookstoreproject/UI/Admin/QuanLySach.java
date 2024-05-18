/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoreproject.UI.Admin;

import bookstoreproject.DAO.Connect;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Acer
 */
public class QuanLySach extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public QuanLySach() {
        initComponents();
        setSize(670, 600);
        setLocationRelativeTo(null);
        LoadCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTheLoai = new javax.swing.JTextField();
        btnAddCate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboCategory = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTonKho = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGioiThieu = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
        btnDelCategory = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        miExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);
        getContentPane().add(txtTheLoai);
        txtTheLoai.setBounds(100, 80, 183, 22);

        btnAddCate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddCate.setText("Add");
        btnAddCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCateActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCate);
        btnAddCate.setBounds(300, 80, 100, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Tên Sách:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(6, 217, 74, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tác Giả");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(348, 217, 70, 25);
        getContentPane().add(txtAuthor);
        txtAuthor.setBounds(430, 221, 183, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Thể Loại");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 80, 80, 25);
        getContentPane().add(cboCategory);
        cboCategory.setBounds(91, 265, 184, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Giá Tiền");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(348, 261, 70, 25);
        getContentPane().add(txtGiaTien);
        txtGiaTien.setBounds(430, 265, 183, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Tồn Kho:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(348, 305, 70, 25);
        getContentPane().add(txtTonKho);
        txtTonKho.setBounds(430, 309, 183, 22);

        txtGioiThieu.setColumns(20);
        txtGioiThieu.setRows(5);
        jScrollPane1.setViewportView(txtGioiThieu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(258, 349, 355, 101);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Giới Thiệu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(91, 349, 100, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Thêm Thể Loại");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 20, 180, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Thêm Sách");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(266, 173, 122, 32);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Thể Loại");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(6, 261, 80, 25);
        getContentPane().add(txtTenSach);
        txtTenSach.setBounds(92, 221, 183, 22);

        btnAddBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddBook.setText("Add");
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBook);
        btnAddBook.setBounds(182, 462, 346, 32);

        btnDelCategory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelCategory.setText("Xóa");
        btnDelCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelCategory);
        btnDelCategory.setBounds(420, 80, 100, 32);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("File");

        miExit.setText("Exit");
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCateActionPerformed
        // TODO add your handling code here:
        /////Validation
            String validation ="";
            //
            if(txtTheLoai.getText().isEmpty())
            {
                if(txtTheLoai.getText().isEmpty())
                    validation += "Cần phải nhập thể loại cần add";   
                JOptionPane.showMessageDialog(null, validation, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            ////Validation
            
           try{
                Connect ConnectInstance  = new Connect();
            ConnectInstance.Connect();
            Statement statement = ConnectInstance.conn.createStatement();
            
             //////////////////////Exist validation
            String FindCate = "Select * from Category where CategoryName ='"
                    +txtTheLoai.getText()
                    +"';";
                    
             ResultSet FindResult  = statement.executeQuery(FindCate);
            if(FindResult.next()){
                 JOptionPane.showMessageDialog(null, "Category đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                 return;
            }
            //////////////////////Exist validation
            
            /////////////////// add User stage
            // Get all existing IDs
            String IdQuery = "select CategoryId from Category order by CategoryId;";
            ResultSet idResult = statement.executeQuery(IdQuery);

            // Find the first missing ID
            int expectedId = 1;
            while(idResult.next()){
                    String currentId = idResult.getString("CategoryId"); // Remove 'C' prefix
                    int currentIdNumber = Integer.parseInt(currentId);
                    if(currentIdNumber != expectedId){
                        break;
                     }
                    expectedId++;
            }
            ///Begin add User
            String InsertQuery = "insert into Category(CategoryId,CategoryName) values("
                    +expectedId
                    +",'"
                    +txtTheLoai.getText()
                     + "');";
                    
            
            Statement state = ConnectInstance.conn.createStatement();
            int row = state.executeUpdate(InsertQuery);
            if(row != 0)
            {
                JOptionPane.showMessageDialog(null, "Add Category thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                txtTheLoai.setText("");
                
                /////
                
                LoadCombobox();
                /////
                ConnectInstance.conn.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi add mã", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                ConnectInstance.conn.close();
            }
           }catch(Exception e)
           {
               e.printStackTrace();
           }
    }//GEN-LAST:event_btnAddCateActionPerformed

    private void btnDelCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCategoryActionPerformed
        // TODO add your handling code here:
         try
        {
            /////Validation
            String validation ="";
            //
            if(txtTheLoai.getText().isEmpty())
            {
                if(txtTheLoai.getText().isEmpty())
                    validation += "Cần phải nhập thể loại cần add";   
                JOptionPane.showMessageDialog(null, validation, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            ////Validation
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            
             
            ///////////////////////Delete stage
            
            String updatequery = "Delete from Category\n" 
            +"\n" 
            +"where CategoryName = '"
            + txtTheLoai.getText()
            +"';";

            int issucceed = statement.executeUpdate(updatequery);
            if(issucceed != 0)
            {
                
                
                LoadCombobox();
               
                JOptionPane.showMessageDialog(null, "delete successful","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                
                sqlinstance.conn.close();
            }
            sqlinstance.conn.close();
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btnDelCategoryActionPerformed

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        // TODO add your handling code here:
        /////Validation
            String validation ="";
            int TonKho;
            //
            if(txtTenSach.getText().isEmpty() || txtGiaTien.getText().isEmpty())
            {
                if(txtTenSach.getText().isEmpty())
                    validation += "Tên sách must be fill ";
                if(txtGiaTien.getText().isEmpty())
                    validation += "- Giá tiền value must be fill ";
                
                JOptionPane.showMessageDialog(null, validation, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
             if(txtTonKho.getText().isEmpty())
                    TonKho = 0;
             else
                 TonKho = Integer.parseInt(txtTonKho.getText());
            ////////////////////Discount validation - float
            if(!txtGiaTien.getText().matches("\\d+"))
            {
               JOptionPane.showMessageDialog(null, "Format error", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
               return;
            }
            
            ////Validation
            
           try{
                Connect ConnectInstance  = new Connect();
            ConnectInstance.Connect();
            Statement statement = ConnectInstance.conn.createStatement();
            
             //////////////////////Exist validation
            String FindBook = "select * from Book,Author,BookDetail\n" +
"where Book.BookId = BookDetail.BookId and Author.AuthorId = BookDetail.AuthorId and Author.Name = N'"
                    +txtAuthor.getText()
                    +"' and Book.BookName = '"
                    + txtTenSach.getText()
                    + "';" ;
                    
             ResultSet FindResult  = statement.executeQuery(FindBook);
            if(FindResult.next()){
                 JOptionPane.showMessageDialog(null, "Sách đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                 return;
            }
            //////////////////////Exist validation
            
            /////////////////// add Book stage
            // Get all existing IDs
            String IdQuery = "select BookId from Book order by BookId;";
            ResultSet idResult = statement.executeQuery(IdQuery);

            // Find the first missing ID
            int expectedId = 1;
            while(idResult.next()){
                    String currentId = idResult.getString("BookId").substring(1); // Remove 'C' prefix
                    int currentIdNumber = Integer.parseInt(currentId);
                    if(currentIdNumber != expectedId){
                        break;
                     }
                    expectedId++;
            }
            ////// Lấy Id combobox
             String FindCate = "select * from Category where CategoryName = N'"
                    +cboCategory.getSelectedItem()
                    +"'; " ;
                    
            ResultSet FindResult3  = statement.executeQuery(FindCate);
           FindResult3.next();
                int CateId = Integer.parseInt(FindResult3.getString("CategoryId"));
            
           
           
            
            ////
                  
            ////Xử lí tác giả
            String FindAuthor = "select * from Author where Name = N'"
                    +txtAuthor.getText()
                    +"'; " ;
                    
            ResultSet FindResult2  = statement.executeQuery(FindAuthor);
            
            int row;
            int row2;
            int row3;
            String newBookId = "B"+expectedId;
           
            /////Trường hợp khi đã có tác giả
            if(FindResult2.next()){
                ///Begin add Book
                String AuthorId = FindResult2.getString("AuthorId");
                String InsertQuery = "insert into Book values('"
                        + newBookId
                        +"',"
                        + CateId
                        + ",N'"
                        +txtTenSach.getText()
                        + "',"
                        + txtGiaTien.getText()
                        + ",'"
                        + txtGioiThieu.getText()
                        + "',"
                        + TonKho
                        + ")";
                    
            
                
                 row = statement.executeUpdate(InsertQuery);
                 
                 //Begin Add DetailBook
                 String InsertDetail = "insert into BookDetail values('"
                        + newBookId
                        +"','"
                        + AuthorId
                        + "')";
                  row2 = statement.executeUpdate(InsertDetail);
                   /////////////////
            if(row != 0 && row2 !=0)
            {
                JOptionPane.showMessageDialog(null, "Add thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                /////
                ConnectInstance.conn.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi add sách", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                ConnectInstance.conn.close();
            }
            }
            else
            {
                 ///Begin add Book
                String InsertQuery = "insert into Book values('"
                        + newBookId
                        +"',"
                        + CateId
                        + ",N'"
                        +txtTenSach.getText()
                        + "',"
                        + txtGiaTien.getText()
                        + ",'"
                        + txtGioiThieu.getText()
                        + "',"
                        + TonKho
                        + ")";
                    
            
                 row = statement.executeUpdate(InsertQuery);
                 //////////////////////Begin add author
                   // Get all existing IDs
            String selectauthor = "select AuthorId from Author order by AuthorId;";
            ResultSet Resultauthor = statement.executeQuery(selectauthor);

            // Find the first missing ID
            int expectedIdAuthor = 1;
            while(Resultauthor.next()){
                    String currentId = Resultauthor.getString("AuthorId").substring(1); // Remove 'C' prefix
                    int currentIdNumber = Integer.parseInt(currentId);
                    if(currentIdNumber != expectedIdAuthor){
                        break;
                     }
                    expectedIdAuthor++;
            }
                 
            String newAuthorId = "A"+ expectedIdAuthor;
            String InsertAuthor = "insert into Author(AuthorId,Name) values('"
                        + newAuthorId
                        +"',N'"
                        + txtAuthor.getText()
                        + "');";
                  row2 = statement.executeUpdate(InsertAuthor);
                  //////////////////////Begin add author
                  
                  
                 //Begin Add DetailBook
                 String InsertDetail = "insert into BookDetail values('"
                        + newBookId
                        +"','"
                        + newAuthorId
                        + "');";
                  row3 = statement.executeUpdate(InsertDetail);
                   /////////////////
            if(row != 0 && row2 !=0 && row3!=0)
            {
                JOptionPane.showMessageDialog(null, "Add thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                /////
                ConnectInstance.conn.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Xảy ra lỗi khi add sách", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                ConnectInstance.conn.close();
            }
            }
            
           }catch(Exception e)
           {
               e.printStackTrace();
           }
    }//GEN-LAST:event_btnAddBookActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        });
    }
    public final void LoadCombobox()
    {
        cboCategory.removeAllItems();
        try
        {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement state = sqlinstance.conn.createStatement();
            String SelectString = "Select * from Category" ;
            ResultSet result = state.executeQuery(SelectString);
            while(result.next())
            {
                cboCategory.addItem(result.getString("CategoryName"));
            }
            sqlinstance.conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddCate;
    private javax.swing.JButton btnDelCategory;
    private javax.swing.JComboBox<String> cboCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextArea txtGioiThieu;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JTextField txtTonKho;
    // End of variables declaration//GEN-END:variables
}
