/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAOsImpl.AlunoDaoImpl;
import DAOsImpl.ProfessorDaoImpl;
import POJOs.Aluno;
import POJOs.Professor;
import javax.swing.JOptionPane;

/**
 *
 * @author john
 */
public class FormProfessor extends javax.swing.JDialog {

    /**
     * Creates new form FormProfessor
     */
    public FormProfessor(java.awt.Frame parent, boolean modal) {
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

        janelaProfessor = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        abaProfessor = new javax.swing.JTabbedPane();
        abaInserirProfessor = new javax.swing.JPanel();
        labelNomeProfessor = new javax.swing.JLabel();
        labelCpfProfessor = new javax.swing.JLabel();
        campoNomeProfessor = new javax.swing.JTextField();
        campoCpfProfessor = new javax.swing.JTextField();
        ButtonSalvarInserirProfessor = new javax.swing.JButton();
        campoDepartamentoProfessor = new javax.swing.JTextField();
        labelDepartamentoProfessor = new javax.swing.JLabel();
        abaListarProfessor = new javax.swing.JScrollPane();
        tblObjetos = new javax.swing.JTable();
        abaEditarProfessor = new javax.swing.JPanel();
        labelCpfProfessorA = new javax.swing.JLabel();
        campoCpfProfessorA = new javax.swing.JTextField();
        labelNomeProfessorN = new javax.swing.JLabel();
        campoNomeProfessorN = new javax.swing.JTextField();
        ButtonSalvarEditarProfessor = new javax.swing.JButton();
        abaRemoverProfessor = new javax.swing.JPanel();
        labelRemoverNomeProfessor = new javax.swing.JLabel();
        CampoRemoverNomeProfessor = new javax.swing.JTextField();
        ButtonSalvarRemoverProfessor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        janelaProfessor.setBorder(javax.swing.BorderFactory.createTitledBorder("Professor"));
        janelaProfessor.setToolTipText("");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelNomeProfessor.setText("Nome do Professor: ");

        labelCpfProfessor.setText("CPF do Professor:");

        ButtonSalvarInserirProfessor.setText("Salvar");
        ButtonSalvarInserirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarInserirProfessorActionPerformed(evt);
            }
        });

        labelDepartamentoProfessor.setText("Departamento:");

        javax.swing.GroupLayout abaInserirProfessorLayout = new javax.swing.GroupLayout(abaInserirProfessor);
        abaInserirProfessor.setLayout(abaInserirProfessorLayout);
        abaInserirProfessorLayout.setHorizontalGroup(
            abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaInserirProfessorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirProfessor))
            .addGroup(abaInserirProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCpfProfessor)
                    .addComponent(labelNomeProfessor)
                    .addComponent(labelDepartamentoProfessor))
                .addGap(4, 4, 4)
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDepartamentoProfessor)
                    .addComponent(campoNomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(campoCpfProfessor))
                .addContainerGap())
        );
        abaInserirProfessorLayout.setVerticalGroup(
            abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirProfessorLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeProfessor)
                    .addComponent(campoNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCpfProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDepartamentoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDepartamentoProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirProfessor))
        );

        abaProfessor.addTab("Inserir", abaInserirProfessor);

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
        abaListarProfessor.setViewportView(tblObjetos);

        abaProfessor.addTab("Listar", abaListarProfessor);

        labelCpfProfessorA.setText("CPF do Professor:");

        labelNomeProfessorN.setText("Novo Nome:");

        ButtonSalvarEditarProfessor.setText("Salvar");
        ButtonSalvarEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarEditarProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaEditarProfessorLayout = new javax.swing.GroupLayout(abaEditarProfessor);
        abaEditarProfessor.setLayout(abaEditarProfessorLayout);
        abaEditarProfessorLayout.setHorizontalGroup(
            abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEditarProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCpfProfessorA)
                    .addComponent(labelNomeProfessorN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCpfProfessorA)
                    .addComponent(campoNomeProfessorN, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaEditarProfessorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarEditarProfessor))
        );
        abaEditarProfessorLayout.setVerticalGroup(
            abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEditarProfessorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpfProfessorA)
                    .addComponent(campoCpfProfessorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeProfessorN)
                    .addComponent(campoNomeProfessorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(ButtonSalvarEditarProfessor))
        );

        abaProfessor.addTab("Editar", abaEditarProfessor);

        labelRemoverNomeProfessor.setText("Nome do Professor:");

        ButtonSalvarRemoverProfessor.setText("Remover");
        ButtonSalvarRemoverProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarRemoverProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaRemoverProfessorLayout = new javax.swing.GroupLayout(abaRemoverProfessor);
        abaRemoverProfessor.setLayout(abaRemoverProfessorLayout);
        abaRemoverProfessorLayout.setHorizontalGroup(
            abaRemoverProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRemoverProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRemoverNomeProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoRemoverNomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaRemoverProfessorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarRemoverProfessor))
        );
        abaRemoverProfessorLayout.setVerticalGroup(
            abaRemoverProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRemoverProfessorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(abaRemoverProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRemoverNomeProfessor)
                    .addComponent(CampoRemoverNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(ButtonSalvarRemoverProfessor))
        );

        abaProfessor.addTab("Remover", abaRemoverProfessor);

        javax.swing.GroupLayout janelaProfessorLayout = new javax.swing.GroupLayout(janelaProfessor);
        janelaProfessor.setLayout(janelaProfessorLayout);
        janelaProfessorLayout.setHorizontalGroup(
            janelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaProfessorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoVoltar))
            .addGroup(janelaProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaProfessor)
                .addContainerGap())
        );
        janelaProfessorLayout.setVerticalGroup(
            janelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaProfessorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(abaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVoltar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(janelaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(janelaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void ButtonSalvarInserirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarInserirProfessorActionPerformed
          
        //SALVAR ALUNO
       // botaoVoltar.setText( campoCpfAluno.getText());
        //VERIICAR CPF
        //TENTAR SALVAR 
        
        
        Professor professor = new Professor();
        
        professor.setNome(campoNomeProfessor.getText());
        professor.setDepartamento(campoDepartamentoProfessor.getText());
        String CPF = campoCpfProfessor.getText();
        try{
            Long cpf = Long.parseLong(CPF);
            professor.setCpf(cpf);
            if (professor.validarCPF(professor.getCpf())==false)
            {
              JOptionPane.showMessageDialog(null, "CPF Inválido!!!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
            
            }
            
            else{
                         try{
                        ProfessorDaoImpl professordao = new ProfessorDaoImpl();
                        professordao.salvar(professor);
            
            
            
                        }catch(Exception ex){
            
                       JOptionPane.showMessageDialog(null, "Professor já existente!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
                    
                    
                 }
           }
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Parametro invalido!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
        
        
                                         
    }//GEN-LAST:event_ButtonSalvarInserirProfessorActionPerformed

    private void ButtonSalvarEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarEditarProfessorActionPerformed
        // TODO add your handling code here:
        
        
        Professor professorN= new Professor();
        Professor professorA = new Professor();
        ProfessorDaoImpl professorDao = new ProfessorDaoImpl();
        professorN.setNome(campoNomeProfessorN.getText());       
        try{
            professorA.setCpf(Long.parseLong(campoCpfProfessorA.getText()));
            professorA.setNome(professorN.getNome());
            
            professorDao.atualizar(professorA, professorN);
                        
            JOptionPane.showMessageDialog(null, "Atualizado!", "Atualização!!: " + "", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(Exception ex){
            
            
             JOptionPane.showMessageDialog(null, "CPF Inválido!!!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
        }
        dispose();
        
       
    }//GEN-LAST:event_ButtonSalvarEditarProfessorActionPerformed

    private void ButtonSalvarRemoverProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarRemoverProfessorActionPerformed
        // TODO add your handling code here:
             
        Professor professor=new Professor();
        ProfessorDaoImpl professorDao=new ProfessorDaoImpl();
        
        try{
            professor.setCpf(Long.parseLong(CampoRemoverNomeProfessor.getText()));
            professorDao.deletar(professor);
            
            JOptionPane.showMessageDialog(null, "Removido!", "Remoção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception ex){
            
             JOptionPane.showMessageDialog(null, "CPF invalido!!!", "Atenção!!: " + "", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        dispose();
    }//GEN-LAST:event_ButtonSalvarRemoverProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormProfessor dialog = new FormProfessor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ButtonSalvarEditarProfessor;
    private javax.swing.JButton ButtonSalvarInserirProfessor;
    private javax.swing.JButton ButtonSalvarRemoverProfessor;
    private javax.swing.JTextField CampoRemoverNomeProfessor;
    private javax.swing.JPanel abaEditarProfessor;
    private javax.swing.JPanel abaInserirProfessor;
    private javax.swing.JScrollPane abaListarProfessor;
    private javax.swing.JTabbedPane abaProfessor;
    private javax.swing.JPanel abaRemoverProfessor;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCpfProfessor;
    private javax.swing.JTextField campoCpfProfessorA;
    private javax.swing.JTextField campoDepartamentoProfessor;
    private javax.swing.JTextField campoNomeProfessor;
    private javax.swing.JTextField campoNomeProfessorN;
    private javax.swing.JPanel janelaProfessor;
    private javax.swing.JLabel labelCpfProfessor;
    private javax.swing.JLabel labelCpfProfessorA;
    private javax.swing.JLabel labelDepartamentoProfessor;
    private javax.swing.JLabel labelNomeProfessor;
    private javax.swing.JLabel labelNomeProfessorN;
    private javax.swing.JLabel labelRemoverNomeProfessor;
    private javax.swing.JTable tblObjetos;
    // End of variables declaration//GEN-END:variables
}
