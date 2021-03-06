/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAOsImpl.DisciplinaDaoImpl;
import POJOs.Disciplina;
import javax.swing.JOptionPane;

/**
 *
 * @author john
 */
public class FormDisciplina extends javax.swing.JDialog {

    /**
     * Creates new form FormDisciplina
     */
    public FormDisciplina(java.awt.Frame parent, boolean modal) {
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

        janelaDisciplina = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        abaDisciplina = new javax.swing.JTabbedPane();
        abaInserirDisciplina = new javax.swing.JPanel();
        labelNomeDisciplina = new javax.swing.JLabel();
        labelEmentaDisciplina = new javax.swing.JLabel();
        campoNomeDisciplina = new javax.swing.JTextField();
        campoEmentaDisciplina = new javax.swing.JTextField();
        labelCargaDisciplina = new javax.swing.JLabel();
        campoCargaDisciplina = new javax.swing.JTextField();
        buttonSalvarInserirDisciplina = new javax.swing.JButton();
        abaListarDisciplina = new javax.swing.JScrollPane();
        tblObjetos = new javax.swing.JTable();
        abaEditarDisciplina = new javax.swing.JPanel();
        labelIdDisciplina = new javax.swing.JLabel();
        campoCodigoDisciplina = new javax.swing.JTextField();
        labelNomeDisciplinaN = new javax.swing.JLabel();
        campoNomeDisciplinaN = new javax.swing.JTextField();
        buttonSalvarEditarDisciplina = new javax.swing.JButton();
        abaRemoverDisciplina = new javax.swing.JPanel();
        labelRemoverCodigoDisciplina = new javax.swing.JLabel();
        CampoRemoverCodigoDisciplina = new javax.swing.JTextField();
        buttonSalvarRemoverDisciplina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        janelaDisciplina.setBorder(javax.swing.BorderFactory.createTitledBorder("Disciplina"));
        janelaDisciplina.setToolTipText("");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelNomeDisciplina.setText("Nome da Disciplina: ");

        labelEmentaDisciplina.setText("Ementa:");

        labelCargaDisciplina.setText("Carga Horária:");

        try{ javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##"); campoCargaDisciplina = new javax.swing.JFormattedTextField(data); } catch (Exception e){ }

        buttonSalvarInserirDisciplina.setText("Salvar");
        buttonSalvarInserirDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarInserirDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaInserirDisciplinaLayout = new javax.swing.GroupLayout(abaInserirDisciplina);
        abaInserirDisciplina.setLayout(abaInserirDisciplinaLayout);
        abaInserirDisciplinaLayout.setHorizontalGroup(
            abaInserirDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaInserirDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmentaDisciplina)
                    .addComponent(labelNomeDisciplina)
                    .addComponent(labelCargaDisciplina))
                .addGap(4, 4, 4)
                .addGroup(abaInserirDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNomeDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(campoEmentaDisciplina)
                    .addComponent(campoCargaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(buttonSalvarInserirDisciplina))
        );
        abaInserirDisciplinaLayout.setVerticalGroup(
            abaInserirDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirDisciplinaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(abaInserirDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeDisciplina)
                    .addComponent(campoNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaInserirDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmentaDisciplina)
                    .addComponent(campoEmentaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaInserirDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCargaDisciplina)
                    .addComponent(campoCargaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaInserirDisciplinaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSalvarInserirDisciplina))
        );

        abaDisciplina.addTab("Inserir", abaInserirDisciplina);

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
        abaListarDisciplina.setViewportView(tblObjetos);

        abaDisciplina.addTab("Listar", abaListarDisciplina);

        labelIdDisciplina.setText("Código da Disciplina:");

        labelNomeDisciplinaN.setText("Novo Nome:");

        buttonSalvarEditarDisciplina.setText("Salvar");
        buttonSalvarEditarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarEditarDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaEditarDisciplinaLayout = new javax.swing.GroupLayout(abaEditarDisciplina);
        abaEditarDisciplina.setLayout(abaEditarDisciplinaLayout);
        abaEditarDisciplinaLayout.setHorizontalGroup(
            abaEditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEditarDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaEditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIdDisciplina)
                    .addComponent(labelNomeDisciplinaN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(abaEditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeDisciplinaN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodigoDisciplina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaEditarDisciplinaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSalvarEditarDisciplina))
        );
        abaEditarDisciplinaLayout.setVerticalGroup(
            abaEditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEditarDisciplinaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(abaEditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdDisciplina)
                    .addComponent(campoCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaEditarDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeDisciplinaN)
                    .addComponent(campoNomeDisciplinaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(buttonSalvarEditarDisciplina))
        );

        abaDisciplina.addTab("Editar", abaEditarDisciplina);

        labelRemoverCodigoDisciplina.setText("Código da Disciplina:");

        buttonSalvarRemoverDisciplina.setText("Salvar");
        buttonSalvarRemoverDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarRemoverDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaRemoverDisciplinaLayout = new javax.swing.GroupLayout(abaRemoverDisciplina);
        abaRemoverDisciplina.setLayout(abaRemoverDisciplinaLayout);
        abaRemoverDisciplinaLayout.setHorizontalGroup(
            abaRemoverDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRemoverDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRemoverCodigoDisciplina)
                .addGap(18, 18, 18)
                .addComponent(CampoRemoverCodigoDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaRemoverDisciplinaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSalvarRemoverDisciplina))
        );
        abaRemoverDisciplinaLayout.setVerticalGroup(
            abaRemoverDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRemoverDisciplinaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(abaRemoverDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRemoverCodigoDisciplina)
                    .addComponent(CampoRemoverCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(buttonSalvarRemoverDisciplina))
        );

        abaDisciplina.addTab("Remover", abaRemoverDisciplina);

        javax.swing.GroupLayout janelaDisciplinaLayout = new javax.swing.GroupLayout(janelaDisciplina);
        janelaDisciplina.setLayout(janelaDisciplinaLayout);
        janelaDisciplinaLayout.setHorizontalGroup(
            janelaDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaDisciplinaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoVoltar))
            .addGroup(janelaDisciplinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaDisciplina)
                .addContainerGap())
        );
        janelaDisciplinaLayout.setVerticalGroup(
            janelaDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaDisciplinaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(abaDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVoltar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(janelaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(janelaDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void buttonSalvarInserirDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarInserirDisciplinaActionPerformed
       
        Disciplina disciplina = new Disciplina();
        
        disciplina.setEmenta(campoEmentaDisciplina.getText());
        disciplina.setNome(campoNomeDisciplina.getText());
        disciplina.setCargaHorariaDisciplina(Integer.parseInt(campoCargaDisciplina.getText()));
        
        
        DisciplinaDaoImpl disciplinadao = new DisciplinaDaoImpl();
        
        try{
           disciplinadao.salvar(disciplina);
        }catch(Exception ex)
        {
              JOptionPane.showMessageDialog(null, "Erro!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_buttonSalvarInserirDisciplinaActionPerformed

    private void buttonSalvarEditarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarEditarDisciplinaActionPerformed
        // TODO add your handling code here:
        //dssdss
        
        Disciplina disciplinaN=new Disciplina();
        Disciplina disciplinaA=new Disciplina();
        DisciplinaDaoImpl disciplinaDao =new DisciplinaDaoImpl();
        
        disciplinaN.setNome(campoNomeDisciplinaN.getText());
        
        try{
            disciplinaA.setId(Long.parseLong(campoCodigoDisciplina.getText()));
            disciplinaA.setNome(disciplinaN.getNome());
            disciplinaDao.atualizar(disciplinaA, disciplinaN);
            
            JOptionPane.showMessageDialog(null, "Atualizado!", "Atualização!!: " + "", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(Exception ex){
            
            
             JOptionPane.showMessageDialog(null, "CPF Inválido!!!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
        }
        dispose();
        /**
          alunoN.setNome(campoNomeAlunoN.getText());
        try{
            alunoA.setCpf(Long.parseLong(campoEditarCpfAluno.getText()));
            alunoA.setNome(alunoN.getNome());
            alunodao.atualizar(alunoA, alunoN);
            JOptionPane.showMessageDialog(null, "Atualizado!", "Atualização!!: " + "", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(Exception ex){
            
            
             JOptionPane.showMessageDialog(null, "CPF Inválido!!!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
        }
        dispose();
         */
    }//GEN-LAST:event_buttonSalvarEditarDisciplinaActionPerformed

    private void buttonSalvarRemoverDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarRemoverDisciplinaActionPerformed
        // TODO add your handling code here:
        
        Disciplina disciplina=new Disciplina();
        DisciplinaDaoImpl disciplinaDao=new DisciplinaDaoImpl();
        
        try{
            disciplina.setId(Long.parseLong(CampoRemoverCodigoDisciplina.getText()));
            disciplinaDao.deletar(disciplina);
            
            JOptionPane.showMessageDialog(null, "Removido!", "Remoção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception ex){
            
             JOptionPane.showMessageDialog(null, "CPF invalido!!!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        dispose();
    }//GEN-LAST:event_buttonSalvarRemoverDisciplinaActionPerformed

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
            java.util.logging.Logger.getLogger(FormDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormDisciplina dialog = new FormDisciplina(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField CampoRemoverCodigoDisciplina;
    private javax.swing.JTabbedPane abaDisciplina;
    private javax.swing.JPanel abaEditarDisciplina;
    private javax.swing.JPanel abaInserirDisciplina;
    private javax.swing.JScrollPane abaListarDisciplina;
    private javax.swing.JPanel abaRemoverDisciplina;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton buttonSalvarEditarDisciplina;
    private javax.swing.JButton buttonSalvarInserirDisciplina;
    private javax.swing.JButton buttonSalvarRemoverDisciplina;
    private javax.swing.JTextField campoCargaDisciplina;
    private javax.swing.JTextField campoCodigoDisciplina;
    private javax.swing.JTextField campoEmentaDisciplina;
    private javax.swing.JTextField campoNomeDisciplina;
    private javax.swing.JTextField campoNomeDisciplinaN;
    private javax.swing.JPanel janelaDisciplina;
    private javax.swing.JLabel labelCargaDisciplina;
    private javax.swing.JLabel labelEmentaDisciplina;
    private javax.swing.JLabel labelIdDisciplina;
    private javax.swing.JLabel labelNomeDisciplina;
    private javax.swing.JLabel labelNomeDisciplinaN;
    private javax.swing.JLabel labelRemoverCodigoDisciplina;
    private javax.swing.JTable tblObjetos;
    // End of variables declaration//GEN-END:variables
}
