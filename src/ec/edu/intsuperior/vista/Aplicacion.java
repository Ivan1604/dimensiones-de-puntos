/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Coordinador;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-IVAN
 */
public class Aplicacion extends javax.swing.JFrame {

    /**
     * Creates new form Aplicacion
     */
    public Aplicacion() {
        initComponents();
        setLocationRelativeTo(null);
        btnimprimir.setEnabled(true);
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnDime = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        btningresar = new javax.swing.JButton();
        btnim = new javax.swing.JButton();
        txty = new javax.swing.JTextField();
        txtx = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDime.setText("Dimensionar");
        btnDime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDimeActionPerformed(evt);
            }
        });

        btnimprimir.setText("Imprimir longitud del arreglo");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        btningresar.setText("ingresar");

        btnim.setText("Imprimir");
        btnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimActionPerformed(evt);
            }
        });

        txty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDime)
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnimprimir)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btningresar)
                                        .addGap(62, 62, 62))))
                            .addComponent(txtx, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txty, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnim)
                        .addGap(77, 77, 77))))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDime)
                    .addComponent(btnimprimir))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnim))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btningresar))
                .addGap(90, 90, 90)
                .addComponent(btnSalir)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Coordinador coordinador=new Coordinador();
    private void btnDimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDimeActionPerformed
    int d=0;
        try{
         d= Integer.parseInt(JOptionPane.showInputDialog("Ingresa dimension"));
    }catch(Exception e){
        System.out.println(e.getMessage());
    }   
    coordinador.dimension(d);
// TODO add your handling code here:
    }//GEN-LAST:event_btnDimeActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        JOptionPane.showMessageDialog(null,""+coordinador );
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void btnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimActionPerformed
String val=txty.getText();
String val2=txtx.getText();
        JOptionPane.showMessageDialog(null, ""
                        +"los puntos son: \n"
                        + val+"\n"
        
                         +val2);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnimActionPerformed

    private void txtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtyActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDime;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnim;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtx;
    private javax.swing.JTextField txty;
    // End of variables declaration//GEN-END:variables
}
