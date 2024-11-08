/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ihc_interfaces;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author utente
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register() {
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

        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(800, 0), new java.awt.Dimension(800, 0), new java.awt.Dimension(800, 32767));
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        Already = new javax.swing.JLabel();
        Privacy = new javax.swing.JCheckBox();
        Main_Page = new javax.swing.JLabel();
        Orders = new javax.swing.JLabel();
        Community = new javax.swing.JLabel();
        Borrowed = new javax.swing.JLabel();
        Catalog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Book_open.png"))); // NOI18N
        jLabel1.setText("Book Hub");
        jLabel1.setIconTextGap(10);
        jLabel1.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");

        Register.setBackground(new java.awt.Color(0, 0, 0));
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("Registrarse");
        Register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Already.setForeground(new java.awt.Color(0, 0, 0));
        Already.setText("<HTML><U>Ya tengo una cuenta</U></HTML>");
        Already.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Already.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlreadyMouseClicked(evt);
            }
        });

        Privacy.setBackground(new java.awt.Color(255, 255, 255));
        Privacy.setForeground(new java.awt.Color(0, 0, 0));
        Privacy.setText("Términos de privacidad");
        Privacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrivacyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Already, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Privacy)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 289, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(Privacy)
                .addGap(18, 18, 18)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Already, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        Email.getAccessibleContext().setAccessibleName("Email");
        Password.getAccessibleContext().setAccessibleName("Password");

        Main_Page.setForeground(new java.awt.Color(0, 0, 0));
        Main_Page.setText("Página Principal");
        Main_Page.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Main_PageMouseClicked(evt);
            }
        });

        Orders.setForeground(new java.awt.Color(0, 0, 0));
        Orders.setText("Pedidos");
        Orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrdersMouseClicked(evt);
            }
        });

        Community.setForeground(new java.awt.Color(0, 0, 0));
        Community.setText("Comunidad");
        Community.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Community.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CommunityMouseClicked(evt);
            }
        });

        Borrowed.setForeground(new java.awt.Color(0, 0, 0));
        Borrowed.setText("Mis Préstamos");
        Borrowed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Borrowed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowedMouseClicked(evt);
            }
        });

        Catalog.setForeground(new java.awt.Color(0, 0, 0));
        Catalog.setText("Catálogo");
        Catalog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Catalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatalogMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Main_Page)
                .addGap(18, 18, 18)
                .addComponent(Orders)
                .addGap(18, 18, 18)
                .addComponent(Community)
                .addGap(18, 18, 18)
                .addComponent(Borrowed)
                .addGap(18, 18, 18)
                .addComponent(Catalog)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Main_Page)
                        .addComponent(Orders)
                        .addComponent(Community)
                        .addComponent(Borrowed)
                        .addComponent(Catalog)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        String email = Email.getText();
        String pass = Password.getText();
        
        if (email.isBlank() == true || pass.isBlank() == true) {
            JOptionPane.showMessageDialog(rootPane, "El correo electrónico o contraseña ingresados son inválidos", "Información", ERROR_MESSAGE);
            Email.setText("");
            Password.setText("");
        } else {
            if (Privacy.isSelected() == false) {
                JOptionPane.showMessageDialog(rootPane, "Es necesario aceptar los términos de privacidad", "Información", ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Se creó el usuario con correo: " + email, "Información", INFORMATION_MESSAGE);
                Main_Page main = new Main_Page();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
                this.dispose();
            }         
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void PrivacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrivacyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrivacyActionPerformed

    private void AlreadyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlreadyMouseClicked
        Login log = new Login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlreadyMouseClicked

    private void Main_PageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Main_PageMouseClicked
        Main_Page main = new Main_Page();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Main_PageMouseClicked

    private void OrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdersMouseClicked
        Reservations res = new Reservations();
        res.setLocationRelativeTo(null);
        res.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OrdersMouseClicked

    private void CommunityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CommunityMouseClicked
        Community com = new Community();
        com.setLocationRelativeTo(null);
        com.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CommunityMouseClicked

    private void BorrowedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowedMouseClicked
        Borrowed_Books bo = new Borrowed_Books();
        bo.setLocationRelativeTo(null);
        bo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BorrowedMouseClicked

    private void CatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatalogMouseClicked
        Search_Books se = new Search_Books();
        se.setLocationRelativeTo(null);
        se.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_CatalogMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Already;
    private javax.swing.JLabel Borrowed;
    private javax.swing.JLabel Catalog;
    private javax.swing.JLabel Community;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Main_Page;
    private javax.swing.JLabel Orders;
    private javax.swing.JTextField Password;
    private javax.swing.JCheckBox Privacy;
    private javax.swing.JButton Register;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
