package admin;
    import dao.PessoaDao;
    import java.util.ArrayList;
    import java.util.List;
    import javax.swing.JOptionPane;
    import modelo.Pessoa;

public class pessoaManter extends javax.swing.JFrame {

    private List <Pessoa> lista; //criando a lista
    Integer posicao;
    
    public pessoaManter() 
    {
        initComponents();
        PessoaDao dao = new PessoaDao();
        lista = dao.listar();
        posicao = 0;
    }
    
    private void Limpar ()
    {
        txtCod.setText("");
        txtNome.setText("");
        cboSexo.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoPrimeiro = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        botaoUltimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        botaoCad = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoListagem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setToolTipText("");

        botaoPrimeiro.setText("PRIMEIRO");
        botaoPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrimeiroActionPerformed(evt);
            }
        });

        botaoAnterior.setText("ANTERIOR");
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });

        botaoProximo.setText("PRÓXIMO");
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        botaoUltimo.setText("ÚLTIMO");
        botaoUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoPrimeiro)
                .addGap(78, 78, 78)
                .addComponent(botaoAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoProximo)
                .addGap(67, 67, 67)
                .addComponent(botaoUltimo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPrimeiro)
                    .addComponent(botaoAnterior)
                    .addComponent(botaoProximo)
                    .addComponent(botaoUltimo))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CÓDIGO:");

        txtCod.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("SEXO:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        botaoCad.setText("CADASTRAR");
        botaoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadActionPerformed(evt);
            }
        });

        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoConsultar.setText("CONSULTAR");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("LIMPAR");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoListagem.setText("Ir para listagem");
        botaoListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(botaoCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(botaoExcluir)
                .addGap(58, 58, 58)
                .addComponent(botaoConsultar)
                .addGap(37, 37, 37)
                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(botaoListagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCad)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoConsultar)
                    .addComponent(botaoLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(botaoListagem)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("PESSOA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCod)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(cboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadActionPerformed
        Pessoa item = new Pessoa(); 
        
            if (txtNome.getText().isEmpty() || cboSexo.getSelectedIndex()==0) //index é posição e item é texto
            {
                JOptionPane.showMessageDialog(rootPane,"Preencher todos os campos!");
            }
            else
            {
                    item.setNome(txtNome.getText());
                    item.setSexo(cboSexo.getSelectedItem().toString());
        
                    PessoaDao dao = new PessoaDao();
                    
                    Boolean deucerto = dao.inserir(item);
                    
                    if (deucerto == true)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Cadastrado com sucesso!");
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(rootPane,"Erro ao cadastrar!");
                    }
                    
                    lista = dao.listar();
                    Limpar ();               
            }    
    }//GEN-LAST:event_botaoCadActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (txtCod.getText().isEmpty()==false)
        {
            PessoaDao dao = new PessoaDao();
            
            //chamo o inserir
            boolean deucerto = dao.remover(lista.get(posicao));
            
            if (deucerto == true)
            {
                JOptionPane.showMessageDialog(rootPane,"Excluído com sucesso!");
            }
            else 
            {
                JOptionPane.showMessageDialog(rootPane,"Erro ao excluir!");
            }
            lista = dao.listar();
            Limpar();
        }
        
        else
        {
            
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
        
        Boolean encontrou = false;
        Integer posicaoachou = 0;
        
        for (Pessoa lista1 : lista) 
        {
            if (nome.equalsIgnoreCase(lista1.getNome()))
            {
                encontrou = true;
                posicao = posicaoachou;
                
                txtCod.setText(lista1.getCodigo().toString());
                txtNome.setText(lista1.getNome());
                
                if (lista1.getSexo().equals("Masculino"))
                {
                    cboSexo.setSelectedIndex(1);
                }
                else
                {
                    cboSexo.setSelectedIndex(2);
                }
                
                break;
            }
            
            posicaoachou ++;
        }
        
        if (encontrou == false)
        {
            JOptionPane.showMessageDialog(null, "Pessoa ainda não cadastrada!");
        }
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrimeiroActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(false);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true);
        
        if (lista.size()>0)
        {
            posicao = 0;
            
            Pessoa elemento = lista.get(0);
            
            txtCod.setText(elemento.getCodigo().toString());
            txtNome.setText(elemento.getNome());
            
            if (elemento.getSexo().equals("Masculino"))
            {
                cboSexo.setSelectedIndex(1);
            }
            else
            {
                cboSexo.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_botaoPrimeiroActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true); 
        
        if (posicao > 0)
        {
            posicao = posicao - 1;
            
            Pessoa elemento = lista.get(posicao);
            
            txtCod.setText(elemento.getCodigo().toString());
            txtNome.setText(elemento.getNome());
            
            if (elemento.getSexo().equals("Masculino"))
            {
                cboSexo.setSelectedIndex(1);
            }
            else
            {
                cboSexo.setSelectedIndex(2);
            }
            
            if (posicao == 0)
            {
                botaoPrimeiro.setEnabled(false);
                botaoAnterior.setEnabled(false);
            }
            
            if (lista.size() == 1)
            {
                botaoProximo.setEnabled(false);
                botaoAnterior.setEnabled(false);
            }
        }
    }//GEN-LAST:event_botaoAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true);
        
        if (posicao <lista.size() - 1)
        {
            posicao = posicao + 1;
        
            Pessoa elemento = lista.get(posicao);
        
            txtCod.setText(elemento.getCodigo().toString());
            txtNome.setText(elemento.getNome());
            
            if (elemento.getSexo().equals("Masculino"))
            {
                cboSexo.setSelectedIndex(1);
            }
            else
            {
                cboSexo.setSelectedIndex(2);
            }
        }
        
        
        if (lista.size() - 1 == posicao)
        {
            botaoProximo.setEnabled(false);
            botaoUltimo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUltimoActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(false);
        botaoUltimo.setEnabled(false);
        
        if (lista.size()>0)
        {
            posicao = lista.size() - 1;
        
            Pessoa elemento = lista.get(posicao);
        
            txtCod.setText(elemento.getCodigo().toString());
            txtNome.setText(elemento.getNome());
            
            if (elemento.getSexo().equals("Masculino"))
            {
                cboSexo.setSelectedIndex(1);
            }
            else
            {
                cboSexo.setSelectedIndex(2);
            }
        
        if (lista.size() - 1 == posicao)
        {
            botaoProximo.setEnabled(false);
            botaoUltimo.setEnabled(false);
        }
        }
        
    }//GEN-LAST:event_botaoUltimoActionPerformed

    private void botaoListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListagemActionPerformed
        pessoaListar tela = new pessoaListar();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_botaoListagemActionPerformed

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
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pessoaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoCad;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoListagem;
    private javax.swing.JButton botaoPrimeiro;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoUltimo;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
