/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expor.view;

/**
 *
 * @author home
 */
public class frmInicio extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    public frmInicio() {
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
        jLabel1 = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        btnContainers = new javax.swing.JButton();
        btnFuncionario = new javax.swing.JButton();
        btnPortos = new javax.swing.JButton();
        btnShippers = new javax.swing.JButton();
        btnExportacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/expor/service/Passo-a-Passo-para-exportar-produtos.png"))); // NOI18N

        btnCliente.setBackground(new java.awt.Color(153, 255, 153));
        btnCliente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnContainers.setBackground(new java.awt.Color(153, 255, 153));
        btnContainers.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnContainers.setText("CONTAINERS");
        btnContainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContainersActionPerformed(evt);
            }
        });

        btnFuncionario.setBackground(new java.awt.Color(153, 255, 153));
        btnFuncionario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnFuncionario.setText("FUNCIONARIO");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnPortos.setBackground(new java.awt.Color(153, 255, 153));
        btnPortos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnPortos.setText("PORTOS");
        btnPortos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPortosActionPerformed(evt);
            }
        });

        btnShippers.setBackground(new java.awt.Color(153, 255, 153));
        btnShippers.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnShippers.setText("SHIPPERS");
        btnShippers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShippersActionPerformed(evt);
            }
        });

        btnExportacao.setBackground(new java.awt.Color(153, 255, 153));
        btnExportacao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnExportacao.setText("EXPORTACAO");
        btnExportacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContainers, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPortos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShippers, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContainers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPortos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShippers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportacao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        
        frmClienteJuridico tela = new frmClienteJuridico();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnContainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContainersActionPerformed
        
        frmContainers tela = new frmContainers();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnContainersActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        
        frmFuncionario tela = new frmFuncionario();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnPortosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortosActionPerformed
        
        frmPortos tela = new frmPortos();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnPortosActionPerformed

    private void btnShippersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShippersActionPerformed
        
        frmShipper tela = new frmShipper();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnShippersActionPerformed

    private void btnExportacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportacaoActionPerformed
        
        frmExportacao tela = new frmExportacao();
        tela.setVisible(true);
        dispose(); 
        
    }//GEN-LAST:event_btnExportacaoActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnContainers;
    private javax.swing.JButton btnExportacao;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnPortos;
    private javax.swing.JButton btnShippers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
