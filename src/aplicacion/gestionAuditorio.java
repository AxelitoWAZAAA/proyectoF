/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package aplicacion;

import javax.swing.JFrame;

/**
 *
 * @author use
 */
public class gestionAuditorio extends javax.swing.JFrame {

    /** Creates new form gestionAuditorio */
    public gestionAuditorio() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jLabel83 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Regresar al menú");
        jLabel76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 130, 60));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/salir.png"))); // NOI18N
        jLabel77.setText("jLabel46");
        jPanel1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 100, 100));

        jPanel20.setBackground(new java.awt.Color(153, 153, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setBackground(new java.awt.Color(0, 0, 0));
        jLabel79.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Horas de reserva:");
        jPanel20.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 30));

        jLabel80.setBackground(new java.awt.Color(0, 0, 0));
        jLabel80.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setText("Estado del auditorio");
        jPanel20.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 30));

        jLabel81.setBackground(new java.awt.Color(0, 0, 0));
        jLabel81.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("Encargado del comedor:");
        jPanel20.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 30));

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jScrollPane11.setViewportView(jTextArea11);

        jPanel20.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 40));

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText("[Rango de horas: \n10:00 AM - 05:00 PM]");
        jTextArea12.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea12.setInheritsPopupMenu(true);
        jScrollPane12.setViewportView(jTextArea12);

        jPanel20.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, 70));

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jScrollPane13.setViewportView(jTextArea13);

        jPanel20.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 170, 40));

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 430, 250));

        jLabel83.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel83.setText("Información general");
        jPanel1.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, 30));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/auditorio.png"))); // NOI18N
        jLabel54.setText("jLabel54");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 725));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        MenuP men = new MenuP();
        men.setVisible(true);
        men.pack();
        men.setLocationRelativeTo(null);
        men.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); // Cerrar la ventana actual
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel76MouseClicked

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
            java.util.logging.Logger.getLogger(gestionAuditorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionAuditorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionAuditorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionAuditorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionAuditorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    // End of variables declaration//GEN-END:variables

}
