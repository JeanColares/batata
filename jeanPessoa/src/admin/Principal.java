package admin;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuGerenPessoa = new javax.swing.JMenuItem();
        menuListarPessoa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuGerenCidade = new javax.swing.JMenuItem();
        menuListarCidade = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem8.setText("jMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Pessoa");

        menuGerenPessoa.setText("Gerenciar");
        menuGerenPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(menuGerenPessoa);

        menuListarPessoa.setText("Listar");
        menuListarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(menuListarPessoa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cidade");

        menuGerenCidade.setText("Gerenciar");
        menuGerenCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenCidadeActionPerformed(evt);
            }
        });
        jMenu2.add(menuGerenCidade);

        menuListarCidade.setText("Listar");
        menuListarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarCidadeActionPerformed(evt);
            }
        });
        jMenu2.add(menuListarCidade);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuGerenCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenCidadeActionPerformed
        cidadeManter tela = new cidadeManter();
        
        //fechar apenas a janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);        
    }//GEN-LAST:event_menuGerenCidadeActionPerformed

    private void menuGerenPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenPessoaActionPerformed
        pessoaManter tela = new pessoaManter();
        
        //fechar apenas a janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuGerenPessoaActionPerformed

    private void menuListarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarPessoaActionPerformed
        pessoaListar tela = new pessoaListar();
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarPessoaActionPerformed

    private void menuListarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarCidadeActionPerformed
        cidadeListar tela = new cidadeListar();
        
        //fechar apenas a janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarCidadeActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem menuGerenCidade;
    private javax.swing.JMenuItem menuGerenPessoa;
    private javax.swing.JMenuItem menuListarCidade;
    private javax.swing.JMenuItem menuListarPessoa;
    // End of variables declaration//GEN-END:variables
}
