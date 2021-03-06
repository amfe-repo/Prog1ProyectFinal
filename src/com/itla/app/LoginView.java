/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.app;

import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author Akme
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    RegisterView registerView = new RegisterView();
    
    public LoginView() {
        initComponents();
        setLocationRelativeTo(null);
           
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_login = new javax.swing.JLabel();
        btn_register = new javax.swing.JLabel();
        sp_login = new javax.swing.JSeparator();
        sp_register = new javax.swing.JSeparator();
        pnl_container = new javax.swing.JPanel();
        LoginView = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        btn_loginapp = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txt_username = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Things\\Programming\\Java\\ProductClientsGestor\\src\\com\\itla\\src\\packResize.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 53, 207, 216));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("GESTOR DE PRODUCTOS");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 341, -1, -1));

        jPanel2.setBackground(new java.awt.Color(68, 46, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("MARCA AKME");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 295, 479));

        btn_login.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        btn_login.setForeground(new java.awt.Color(44, 106, 229));
        btn_login.setText("LOGIN");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 37, -1, -1));

        btn_register.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        btn_register.setForeground(new java.awt.Color(112, 112, 112));
        btn_register.setText("REGISTER");
        btn_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerMouseClicked(evt);
            }
        });
        jPanel1.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 37, -1, -1));

        sp_login.setBackground(new java.awt.Color(44, 106, 229));
        sp_login.setForeground(new java.awt.Color(60, 63, 65));
        sp_login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sp_login.setOpaque(true);
        jPanel1.add(sp_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 70, 110, 1));

        sp_register.setForeground(new java.awt.Color(60, 63, 65));
        sp_register.setOpaque(true);
        jPanel1.add(sp_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, 1));

        pnl_container.setBackground(new java.awt.Color(255, 255, 255));

        LoginView.setBackground(new java.awt.Color(255, 255, 255));
        LoginView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 112, 112));
        jLabel7.setText("Dont have account? Sign In");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginView.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 230, -1));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setForeground(new java.awt.Color(112, 112, 112));
        txt_password.setText("Password");
        txt_password.setBorder(null);
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordFocusLost(evt);
            }
        });
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passwordMouseClicked(evt);
            }
        });
        LoginView.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 380, -1));

        jPanel3.setBackground(new java.awt.Color(67, 194, 251));

        btn_loginapp.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        btn_loginapp.setForeground(new java.awt.Color(255, 255, 255));
        btn_loginapp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_loginapp.setText("LOGIN");
        btn_loginapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_loginapp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_loginapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginappMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_loginapp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_loginapp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        LoginView.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 150, 38));
        LoginView.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 381, 10));

        txt_username.setBackground(new java.awt.Color(255, 255, 255));
        txt_username.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_username.setForeground(new java.awt.Color(112, 112, 112));
        txt_username.setText("Username");
        txt_username.setBorder(null);
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        txt_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_usernameMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_usernameMouseExited(evt);
            }
        });
        LoginView.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, -1));
        LoginView.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 381, 10));

        pnl_container.add(LoginView);

        jPanel1.add(pnl_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 460, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseClicked
        
        btn_login.setForeground(new Color(112,112,112));
        btn_register.setForeground(new Color(44,106,229));
        
        sp_login.setBackground(new Color(112,112,112));
        sp_register.setBackground(new Color(44,106,229));
        
        this.LoginView.setVisible(false);
        this.registerView.setVisible(true);
        
        this.pnl_container.add(this.registerView);
        this.pnl_container.validate();
    }//GEN-LAST:event_btn_registerMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        
        btn_login.setForeground(new Color(44,106,229));
        btn_register.setForeground(new Color(112,112,112));
        
        sp_register.setBackground(new Color(112,112,112));
        sp_login.setBackground(new Color(44,106,229));
        
        this.registerView.setVisible(false);
        this.LoginView.setVisible(true);
        
        this.pnl_container.add(this.LoginView);
        this.pnl_container.validate();
    }//GEN-LAST:event_btn_loginMouseClicked

    private void txt_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usernameMouseClicked
        this.txt_username.setText("");
    }//GEN-LAST:event_txt_usernameMouseClicked

    private void txt_usernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usernameMouseExited
        
    }//GEN-LAST:event_txt_usernameMouseExited

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost
        if(this.txt_username.getText().isEmpty())
            this.txt_username.setText("Username");
    }//GEN-LAST:event_txt_usernameFocusLost

    private void txt_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMouseClicked
        this.txt_password.setText("");
    }//GEN-LAST:event_txt_passwordMouseClicked

    private void txt_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusLost
        if(String.valueOf(this.txt_password.getPassword()).isEmpty())
            this.txt_password.setText("Password");
    }//GEN-LAST:event_txt_passwordFocusLost

    private void btn_loginappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginappMouseClicked
        MainView main = new MainView();
        this.setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_btn_loginappMouseClicked

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginView;
    private javax.swing.JLabel btn_login;
    private javax.swing.JLabel btn_loginapp;
    private javax.swing.JLabel btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel pnl_container;
    private javax.swing.JSeparator sp_login;
    private javax.swing.JSeparator sp_register;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
