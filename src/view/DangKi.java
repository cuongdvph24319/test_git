/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import service.KhachHang_Service;

/**
 *
 * @author ACER
 */
public class DangKi extends javax.swing.JFrame {
    
    public DangKi() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtXacNhanMatKhau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        btnDangki = new javax.swing.JButton();
        lblErrTaiKhoan = new javax.swing.JLabel();
        lblErrMatKhau = new javax.swing.JLabel();
        lblErrXacNhanMatKhau = new javax.swing.JLabel();
        lblErrMaRieng = new javax.swing.JLabel();
        txttxtMaRieng = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng Kí");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tài Khoản:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mật khẩu:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Xác nhận mật khẩu:");

        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnDangki.setText("Đăng Kí");
        btnDangki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkiActionPerformed(evt);
            }
        });

        lblErrTaiKhoan.setForeground(new java.awt.Color(255, 0, 0));

        lblErrMatKhau.setForeground(new java.awt.Color(255, 0, 0));

        lblErrXacNhanMatKhau.setForeground(new java.awt.Color(255, 0, 0));

        lblErrMaRieng.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mã Riêng (tùy chọn):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangki, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttxtMaRieng)
                            .addComponent(lblErrMaRieng, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErrMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatKhau)
                            .addComponent(txtXacNhanMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenDangNhap)
                            .addComponent(lblErrTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblErrXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttxtMaRieng, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblErrMaRieng, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblErrTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangki, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkiActionPerformed
        // TODO add your handling code here:
        if(check() == true){
        KhachHang kh = getForm();
        if(kh == null){
            return;
        }
        JOptionPane.showMessageDialog(this, "Đăng kí thành công.");
        KhachHang_Service.ThemKH(kh);
        ThongTinKhachHang ttkh = new ThongTinKhachHang();
        ttkh.setVisible(true);
        }
    }//GEN-LAST:event_btnDangkiActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        KhachHang kh = getForm();
        KhachHang_Service.XoaKH(kh);
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private boolean check(){
        if(txttxtMaRieng.getText().equals("") && txtTenDangNhap.getText().equals("") && txtMatKhau.getText().equals("") && txtXacNhanMatKhau.getText().equals("")){
            lblErrMaRieng.setText("Vui lòng nhập mã!");
            lblErrTaiKhoan.setText("Vui lòng nhập tên tài khoản!");
            lblErrMatKhau.setText("Vui long nhập mật khẩu!");
            lblErrXacNhanMatKhau.setText("Vui lòng xác nhận lại mật khẩu!");
            return false;
        }
        if(txttxtMaRieng.getText().equals("") && !(txtTenDangNhap.getText().equals("")) && txtMatKhau.getText().equals("") && txtXacNhanMatKhau.getText().equals("")){
            lblErrMaRieng.setText("Vui lòng nhập mã!");
            lblErrTaiKhoan.setText("");
            lblErrMatKhau.setText("Vui long nhập mật khẩu!");
            lblErrXacNhanMatKhau.setText("Vui lòng xác nhận lại mật khẩu!");
            return false;
        }
        if(!(txttxtMaRieng.getText().equals("")) && txtTenDangNhap.getText().equals("") && txtMatKhau.getText().equals("") && txtXacNhanMatKhau.getText().equals("")){
            lblErrMaRieng.setText("");
            lblErrTaiKhoan.setText("Vui lòng nhập tên tài khoản!");
            lblErrMatKhau.setText("Vui long nhập mật khẩu!");
            lblErrXacNhanMatKhau.setText("Vui lòng xác nhận lại mật khẩu!");
            return false;
        }
        if(txttxtMaRieng.getText().equals("") && txtTenDangNhap.getText().equals("") && !(txtMatKhau.getText().equals("")) && txtXacNhanMatKhau.getText().equals("")){
            lblErrMaRieng.setText("Vui lòng nhập mã!");
            lblErrTaiKhoan.setText("Vui lòng nhập tên tài khoản!");
            lblErrMatKhau.setText("");
            lblErrXacNhanMatKhau.setText("Vui lòng xác nhận lại mật khẩu!");
            return false;
        }
        if(txttxtMaRieng.getText().equals("") && txtTenDangNhap.getText().equals("") && txtMatKhau.getText().equals("") && !(txtXacNhanMatKhau.getText().equals(""))){
            lblErrMaRieng.setText("Vui lòng nhập mã!");
            lblErrTaiKhoan.setText("Vui lòng nhập tên tài khoản!");
            lblErrMatKhau.setText("Vui long nhập mật khẩu!");
            lblErrXacNhanMatKhau.setText("");
            return false;
        }
        if(!(txttxtMaRieng.getText().equals("")) && !(txtTenDangNhap.getText().equals("")) && txtMatKhau.getText().equals("") && txtXacNhanMatKhau.getText().equals("")){
            lblErrMaRieng.setText("");
            lblErrTaiKhoan.setText("");
            lblErrMatKhau.setText("Vui long nhập mật khẩu!");
            lblErrXacNhanMatKhau.setText("Vui lòng xác nhận lại mật khẩu!");
            return false;
        }
        if(txttxtMaRieng.getText().equals("") && !(txtTenDangNhap.getText().equals("")) && !(txtMatKhau.getText().equals("")) && txtXacNhanMatKhau.getText().equals("")){
            lblErrMaRieng.setText("Vui lòng nhập mã!");
            lblErrTaiKhoan.setText("");
            lblErrMatKhau.setText("");
            lblErrXacNhanMatKhau.setText("Vui lòng xác nhận lại mật khẩu!");
            return false;
        }
        if(txttxtMaRieng.getText().equals("") && txtTenDangNhap.getText().equals("") && !(txtMatKhau.getText().equals("")) && !(txtXacNhanMatKhau.getText().equals(""))){
            lblErrMaRieng.setText("Vui lòng nhập mã!");
            lblErrTaiKhoan.setText("Vui lòng nhập tên tài khoản!");
            lblErrMatKhau.setText("");
            lblErrXacNhanMatKhau.setText("");
            return false;
        }
        if(!(txttxtMaRieng.getText().equals("")) && txtTenDangNhap.getText().equals("") && !(txtMatKhau.getText().equals("")) && txtXacNhanMatKhau.getText().equals("")){
            lblErrMaRieng.setText("");
            lblErrTaiKhoan.setText("Vui lòng nhập tên tài khoản!");
            lblErrMatKhau.setText("");
            lblErrXacNhanMatKhau.setText("Vui lòng xác nhận lại mật khẩu!");
            return false;
        }
        if(txttxtMaRieng.getText().equals("") && !(txtTenDangNhap.getText().equals("")) && txtMatKhau.getText().equals("") && !(txtXacNhanMatKhau.getText().equals(""))){
            lblErrMaRieng.setText("Vui lòng nhập mã!");
            lblErrTaiKhoan.setText("");
            lblErrMatKhau.setText("Vui long nhập mật khẩu!");
            lblErrXacNhanMatKhau.setText("");
            return false;
        }
        if(!(txttxtMaRieng.getText().equals("")) && txtTenDangNhap.getText().equals("") && txtMatKhau.getText().equals("") && !(txtXacNhanMatKhau.getText().equals(""))){
            lblErrMaRieng.setText("");
            lblErrTaiKhoan.setText("Vui lòng nhập tên tài khoản!");
            lblErrMatKhau.setText("Vui long nhập mật khẩu!");
            lblErrXacNhanMatKhau.setText("");
            return false;
        }
        if(!(txttxtMaRieng.getText().equals("")) && !(txtTenDangNhap.getText().equals("")) && txtMatKhau.getText().equals("") && !(txtXacNhanMatKhau.getText().equals(""))){
            lblErrMaRieng.setText("");
            lblErrTaiKhoan.setText("");
            lblErrMatKhau.setText("Vui long nhập mật khẩu!");
            lblErrXacNhanMatKhau.setText("");
            return false;
        }
        if(!(txttxtMaRieng.getText().equals("")) && txtTenDangNhap.getText().equals("") && !(txtMatKhau.getText().equals("")) && !(txtXacNhanMatKhau.getText().equals(""))){
            lblErrMaRieng.setText("");
            lblErrTaiKhoan.setText("Vui lòng nhập tên tài khoản!");
            lblErrMatKhau.setText("");
            lblErrXacNhanMatKhau.setText("");
            return false;
        }
        if(txttxtMaRieng.getText().equals("") && !(txtTenDangNhap.getText().equals("")) && !(txtMatKhau.getText().equals("")) && !(txtXacNhanMatKhau.getText().equals(""))){
            lblErrMaRieng.setText("Vui lòng nhập mã!");
            lblErrTaiKhoan.setText("");
            lblErrMatKhau.setText("");
            lblErrXacNhanMatKhau.setText("");
            return false;
        }
        if(!(txttxtMaRieng.getText().equals("")) && !(txtTenDangNhap.getText().equals("")) && !(txtMatKhau.getText().equals("")) && !(txtXacNhanMatKhau.getText().equals(""))){
            lblErrMaRieng.setText("");
            lblErrTaiKhoan.setText("");
            lblErrMatKhau.setText("");
            lblErrXacNhanMatKhau.setText("");
        }

        return true;
    }
    
    private KhachHang getForm(){
        String ma = txttxtMaRieng.getText();
        String email = txtTenDangNhap.getText();
        String matKhau = txtMatKhau.getText();
        if(!(txtMatKhau.getText().equals(txtXacNhanMatKhau.getText()))){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng xác nhận mật khẩu.");
            return null;
        }
        KhachHang kh = new KhachHang(ma, null, null, null, null, null, null, null, null, matKhau, email);
        return kh;
    }
    
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
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDangki;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrMaRieng;
    private javax.swing.JLabel lblErrMatKhau;
    private javax.swing.JLabel lblErrTaiKhoan;
    private javax.swing.JLabel lblErrXacNhanMatKhau;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtXacNhanMatKhau;
    private javax.swing.JTextField txttxtMaRieng;
    // End of variables declaration//GEN-END:variables
}
