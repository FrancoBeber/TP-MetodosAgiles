/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author usser
 */
public class AltaUsuarioAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form AltaUsuarioAdministrador
     */
    public AltaUsuarioAdministrador() {
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

        nombreUsuarioAdministrador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        repetirContraseñaAdministrador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RegistrarAdministrador = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CancelarAdministrador = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        contraseñaRepetirOperador = new javax.swing.JLabel();
        nombreAdministrador = new javax.swing.JTextField();
        dniAdministrador = new javax.swing.JTextField();
        contraseñaAdministrador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        apellidoAdministrador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreUsuarioAdministrador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        jLabel3.setText("Apellido");

        repetirContraseñaAdministrador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        jLabel4.setText("DNI");

        RegistrarAdministrador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        RegistrarAdministrador.setText("Registrar");

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        jLabel5.setText("Nombre de Usuario");

        CancelarAdministrador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        CancelarAdministrador.setText("Cancelar");

        jLabel6.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        jLabel6.setText("Contraseña");

        contraseñaRepetirOperador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        contraseñaRepetirOperador.setText("Repetir Contraseña");

        nombreAdministrador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N

        dniAdministrador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N

        contraseñaAdministrador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        jLabel1.setText("Nuevo Administrador");

        apellidoAdministrador.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 0, 16)); // NOI18N
        jLabel2.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nombreUsuarioAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RegistrarAdministrador)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(19, 19, 19)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dniAdministrador)
                                    .addComponent(nombreAdministrador)
                                    .addComponent(contraseñaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(contraseñaRepetirOperador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CancelarAdministrador)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(apellidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(repetirContraseñaAdministrador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(nombreAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(dniAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreUsuarioAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contraseñaRepetirOperador)
                    .addComponent(contraseñaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repetirContraseñaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarAdministrador)
                    .addComponent(CancelarAdministrador))
                .addGap(53, 53, 53))
        );

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
            java.util.logging.Logger.getLogger(AltaUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaUsuarioAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaUsuarioAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarAdministrador;
    private javax.swing.JButton RegistrarAdministrador;
    private javax.swing.JTextField apellidoAdministrador;
    private javax.swing.JTextField contraseñaAdministrador;
    private javax.swing.JLabel contraseñaRepetirOperador;
    private javax.swing.JTextField dniAdministrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreAdministrador;
    private javax.swing.JTextField nombreUsuarioAdministrador;
    private javax.swing.JTextField repetirContraseñaAdministrador;
    // End of variables declaration//GEN-END:variables
}
