/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstoreproject.UI.Admin;

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
        txtTenSach1 = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
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

        cboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        getContentPane().add(txtTenSach1);
        txtTenSach1.setBounds(92, 221, 183, 22);

        btnAddBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddBook.setText("Add");
        getContentPane().add(btnAddBook);
        btnAddBook.setBounds(182, 462, 346, 32);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("File");

        miExit.setText("Exit");
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddCate;
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
    private javax.swing.JTextField txtTenSach1;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JTextField txtTonKho;
    // End of variables declaration//GEN-END:variables
}
