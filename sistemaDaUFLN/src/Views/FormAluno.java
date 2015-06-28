/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAOsImpl.AlunoDaoImpl;
import POJOs.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author john
 */
public class FormAluno extends javax.swing.JDialog {

    /**
     * Creates new form FormAluno
     */
    public FormAluno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jTextField3 = new javax.swing.JTextField();
        janelaAluno = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        abaAluno = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        labelNomeAluno = new javax.swing.JLabel();
        labelCpfAluno = new javax.swing.JLabel();
        campoNomeAluno = new javax.swing.JTextField();
        campoCpfAluno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblObjetos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        labelNomeAlunoA = new javax.swing.JLabel();
        campoNomeAlunoA = new javax.swing.JTextField();
        labelNomeAlunoN = new javax.swing.JLabel();
        campoNomeAlunoN = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        labelRemoverNomeAluno = new javax.swing.JLabel();
        CampoRemoverNomeAluno = new javax.swing.JTextField();
        ButtonSalvarAluno = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        janelaAluno.setBorder(javax.swing.BorderFactory.createTitledBorder("Aluno"));
        janelaAluno.setToolTipText("");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelNomeAluno.setText("Nome do Aluno: ");

        labelCpfAluno.setText("CPF do Aluno:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCpfAluno)
                    .addComponent(labelNomeAluno))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCpfAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(campoNomeAluno))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAluno)
                    .addComponent(campoNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpfAluno)
                    .addComponent(campoCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        abaAluno.addTab("Inserir", jPanel2);

        tblObjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblObjetos);

        abaAluno.addTab("Listar", jScrollPane1);

        labelNomeAlunoA.setText("Nome do Aluno:");

        labelNomeAlunoN.setText("Novo Nome:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeAlunoA)
                    .addComponent(labelNomeAlunoN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeAlunoA)
                    .addComponent(campoNomeAlunoN, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAlunoA)
                    .addComponent(campoNomeAlunoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAlunoN)
                    .addComponent(campoNomeAlunoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        abaAluno.addTab("Editar", jPanel3);

        labelRemoverNomeAluno.setText("Nome do Aluno:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRemoverNomeAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoRemoverNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRemoverNomeAluno)
                    .addComponent(CampoRemoverNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        abaAluno.addTab("Remover", jPanel4);

        ButtonSalvarAluno.setText("Salvar");
        ButtonSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout janelaAlunoLayout = new javax.swing.GroupLayout(janelaAluno);
        janelaAluno.setLayout(janelaAlunoLayout);
        janelaAlunoLayout.setHorizontalGroup(
            janelaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaAlunoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVoltar))
            .addGroup(janelaAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaAluno)
                .addContainerGap())
        );
        janelaAlunoLayout.setVerticalGroup(
            janelaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaAlunoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(abaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(janelaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(ButtonSalvarAluno)))
        );

        getContentPane().add(janelaAluno, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void ButtonSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarAlunoActionPerformed
       
         
        //SALVAR ALUNO
       // botaoVoltar.setText( campoCpfAluno.getText());
        //VERIICAR CPF
        //TENTAR SALVAR 
        
        
        Aluno aluno = new Aluno();
        aluno.setNome(campoNomeAluno.getText());
        String CPF = campoCpfAluno.getText();
        try{
            Long cpf = Long.parseLong(CPF);
            aluno.setCpf(cpf);
            if (aluno.validarCPF(aluno.getCpf())==false)
            {
              JOptionPane.showMessageDialog(null, "CPF Inválido!!!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
            
            }
            
            else{
                         try{
                        AlunoDaoImpl alunodao = new AlunoDaoImpl();
                        alunodao.salvar(aluno);
            
            
            
                        }catch(Exception ex){
            
                       JOptionPane.showMessageDialog(null, "Aluno já existente!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
                    
                    
                 }
           }
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Parametro invalido!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
        
        
    }//GEN-LAST:event_ButtonSalvarAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAluno dialog = new FormAluno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalvarAluno;
    private javax.swing.JTextField CampoRemoverNomeAluno;
    private javax.swing.JTabbedPane abaAluno;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCpfAluno;
    private javax.swing.JTextField campoNomeAluno;
    private javax.swing.JTextField campoNomeAlunoA;
    private javax.swing.JTextField campoNomeAlunoN;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel janelaAluno;
    private javax.swing.JLabel labelCpfAluno;
    private javax.swing.JLabel labelNomeAluno;
    private javax.swing.JLabel labelNomeAlunoA;
    private javax.swing.JLabel labelNomeAlunoN;
    private javax.swing.JLabel labelRemoverNomeAluno;
    private javax.swing.JTable tblObjetos;
    // End of variables declaration//GEN-END:variables
}
