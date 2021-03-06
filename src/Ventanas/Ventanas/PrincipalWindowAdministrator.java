package Ventanas.Ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author BRANDON
 */
public class PrincipalWindowAdministrator extends javax.swing.JFrame {

    public PrincipalWindowAdministrator() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana de Administrador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitleWindow = new javax.swing.JLabel();
        jButtonLogOut = new javax.swing.JButton();
        jButtonOptionRegisterCoordinator = new javax.swing.JButton();
        jButtonOptionDeleteCoordinator = new javax.swing.JButton();
        jButtonOptionRegisterProfessor = new javax.swing.JButton();
        jButtonoptionDeleteProfesor = new javax.swing.JButton();
        jLabelAdministratorIcon = new javax.swing.JLabel();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitleWindow.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitleWindow.setText("Administrador");
        getContentPane().add(jLabelTitleWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jButtonLogOut.setBackground(new java.awt.Color(204, 255, 255));
        jButtonLogOut.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonLogOut.setText("Cerrar sesión");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jButtonOptionRegisterCoordinator.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionRegisterCoordinator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionRegisterCoordinator.setText("Registrar Coordinador");
        jButtonOptionRegisterCoordinator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionRegisterCoordinatorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionRegisterCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 230, 50));

        jButtonOptionDeleteCoordinator.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionDeleteCoordinator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionDeleteCoordinator.setText("Eliminar Coordinador");
        jButtonOptionDeleteCoordinator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionDeleteCoordinatorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionDeleteCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 230, 50));

        jButtonOptionRegisterProfessor.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionRegisterProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionRegisterProfessor.setText("Registrar Profesor");
        jButtonOptionRegisterProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionRegisterProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionRegisterProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 230, 50));

        jButtonoptionDeleteProfesor.setBackground(new java.awt.Color(51, 255, 204));
        jButtonoptionDeleteProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonoptionDeleteProfesor.setText("Eliminar Profesor");
        jButtonoptionDeleteProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonoptionDeleteProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonoptionDeleteProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 230, 50));

        jLabelAdministratorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/adminIcon.png"))); // NOI18N
        getContentPane().add(jLabelAdministratorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 731, 451));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOptionRegisterCoordinatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionRegisterCoordinatorActionPerformed
        RegisterCoordinator goToRegisterCoordinator = new RegisterCoordinator();
        goToRegisterCoordinator.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonOptionRegisterCoordinatorActionPerformed

    private void jButtonOptionRegisterProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionRegisterProfessorActionPerformed
        RegisterProfessor goToRegisterProfessor = new RegisterProfessor();
        goToRegisterProfessor.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonOptionRegisterProfessorActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        Login returnToLogin = new Login();
        returnToLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonOptionDeleteCoordinatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionDeleteCoordinatorActionPerformed
        JOptionPane.showMessageDialog(this, "Aún no existe implementación");
    }//GEN-LAST:event_jButtonOptionDeleteCoordinatorActionPerformed

    private void jButtonoptionDeleteProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonoptionDeleteProfesorActionPerformed
        JOptionPane.showMessageDialog(this, "Aún no existe implementación");
    }//GEN-LAST:event_jButtonoptionDeleteProfesorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalWindowAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonOptionDeleteCoordinator;
    private javax.swing.JButton jButtonOptionRegisterCoordinator;
    private javax.swing.JButton jButtonOptionRegisterProfessor;
    private javax.swing.JButton jButtonoptionDeleteProfesor;
    private javax.swing.JLabel jLabelAdministratorIcon;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelTitleWindow;
    // End of variables declaration//GEN-END:variables
}
