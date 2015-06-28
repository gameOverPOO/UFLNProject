/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

import Views.FormAluno;
import Views.FormAtividade;
import Views.FormDisciplina;
import Views.FormProfessor;
import Views.FormTurma;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author poney
 */
public class FormMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form sistemaGUI
     */
    public FormMenuPrincipal() {
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

        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        MenuArquivoSair = new javax.swing.JMenuItem();
        menuInserir = new javax.swing.JMenu();
        menuInserirAluno = new javax.swing.JMenuItem();
        menuInserirAtividade = new javax.swing.JMenuItem();
        menuInserirDisciplina = new javax.swing.JMenuItem();
        menuInserirProfessor = new javax.swing.JMenuItem();
        menuInserirTurma = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuEditarAluno = new javax.swing.JMenuItem();
        menuEditarAtividade = new javax.swing.JMenuItem();
        MenuEditarDisciplina = new javax.swing.JMenuItem();
        menuEditarProfessor = new javax.swing.JMenuItem();
        menuEditarTurma = new javax.swing.JMenuItem();
        menuRemover = new javax.swing.JMenu();
        MenuRemoverAluno = new javax.swing.JMenuItem();
        MenuRemoverAtividade = new javax.swing.JMenuItem();
        MenuRemoverDisciplina = new javax.swing.JMenuItem();
        MenuRemoverProfessor = new javax.swing.JMenuItem();
        MenuRemoverTurma = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArquivo.setText("Arquivo");
        menuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArquivoActionPerformed(evt);
            }
        });

        MenuArquivoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        MenuArquivoSair.setText("Sair");
        MenuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivoSairActionPerformed(evt);
            }
        });
        menuArquivo.add(MenuArquivoSair);

        barraMenu.add(menuArquivo);

        menuInserir.setText("Inserir");

        menuInserirAluno.setText("Aluno");
        menuInserirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirAlunoActionPerformed(evt);
            }
        });
        menuInserir.add(menuInserirAluno);

        menuInserirAtividade.setText("Atividade");
        menuInserirAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirAtividadeActionPerformed(evt);
            }
        });
        menuInserir.add(menuInserirAtividade);

        menuInserirDisciplina.setText("Disciplina");
        menuInserirDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirDisciplinaActionPerformed(evt);
            }
        });
        menuInserir.add(menuInserirDisciplina);

        menuInserirProfessor.setText("Professor");
        menuInserirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirProfessorActionPerformed(evt);
            }
        });
        menuInserir.add(menuInserirProfessor);

        menuInserirTurma.setText("Turma");
        menuInserirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirTurmaActionPerformed(evt);
            }
        });
        menuInserir.add(menuInserirTurma);

        barraMenu.add(menuInserir);

        menuEditar.setText("Editar");

        menuEditarAluno.setText("Aluno");
        menuEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarAlunoActionPerformed(evt);
            }
        });
        menuEditar.add(menuEditarAluno);

        menuEditarAtividade.setText("Atividade");
        menuEditarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarAtividadeActionPerformed(evt);
            }
        });
        menuEditar.add(menuEditarAtividade);

        MenuEditarDisciplina.setText("Disciplina");
        MenuEditarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEditarDisciplinaActionPerformed(evt);
            }
        });
        menuEditar.add(MenuEditarDisciplina);

        menuEditarProfessor.setText("Professor");
        menuEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarProfessorActionPerformed(evt);
            }
        });
        menuEditar.add(menuEditarProfessor);

        menuEditarTurma.setText("Turma");
        menuEditarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarTurmaActionPerformed(evt);
            }
        });
        menuEditar.add(menuEditarTurma);

        barraMenu.add(menuEditar);

        menuRemover.setText("Remover");

        MenuRemoverAluno.setText("Aluno");
        MenuRemoverAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRemoverAlunoActionPerformed(evt);
            }
        });
        menuRemover.add(MenuRemoverAluno);

        MenuRemoverAtividade.setText("Atividade");
        MenuRemoverAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRemoverAtividadeActionPerformed(evt);
            }
        });
        menuRemover.add(MenuRemoverAtividade);

        MenuRemoverDisciplina.setText("Disciplina");
        MenuRemoverDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRemoverDisciplinaActionPerformed(evt);
            }
        });
        menuRemover.add(MenuRemoverDisciplina);

        MenuRemoverProfessor.setText("Professor");
        MenuRemoverProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRemoverProfessorActionPerformed(evt);
            }
        });
        menuRemover.add(MenuRemoverProfessor);

        MenuRemoverTurma.setText("Turma");
        MenuRemoverTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRemoverTurmaActionPerformed(evt);
            }
        });
        menuRemover.add(MenuRemoverTurma);

        barraMenu.add(menuRemover);

        menuAjuda.setText("Ajuda");
        menuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaActionPerformed(evt);
            }
        });

        jMenuItem17.setText("Sobre");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem17);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Todos os direitos reservados.\n\nLeandro Nogueira\nTiago Sardi\n\ncontato@gameoverpoo.com");
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void menuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArquivoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuArquivoActionPerformed

    private void MenuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivoSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_MenuArquivoSairActionPerformed

    private void menuInserirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirAlunoActionPerformed
        // TODO add your handling code here:
        FormAluno form=new FormAluno(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Aluno");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuInserirAlunoActionPerformed

    private void menuEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarAlunoActionPerformed
        // TODO add your handling code here:
        FormAluno form=new FormAluno(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Aluno");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuEditarAlunoActionPerformed

    private void MenuRemoverAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRemoverAlunoActionPerformed
        // TODO add your handling code here:
        FormAluno form=new FormAluno(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Aluno");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_MenuRemoverAlunoActionPerformed

    private void menuInserirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirProfessorActionPerformed
        // TODO add your handling code here:
        FormProfessor form=new FormProfessor(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Professor");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuInserirProfessorActionPerformed

    private void menuEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarProfessorActionPerformed
        // TODO add your handling code here:
        FormProfessor form=new FormProfessor(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Professor");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuEditarProfessorActionPerformed

    private void MenuRemoverProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRemoverProfessorActionPerformed
        // TODO add your handling code here:
        FormProfessor form=new FormProfessor(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Professor");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_MenuRemoverProfessorActionPerformed

    private void menuInserirAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirAtividadeActionPerformed
        // TODO add your handling code here:
        FormAtividade form=new FormAtividade(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Atividade");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuInserirAtividadeActionPerformed

    private void menuInserirDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirDisciplinaActionPerformed
        // TODO add your handling code here:
        FormDisciplina form=new FormDisciplina(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Disciplina");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuInserirDisciplinaActionPerformed

    private void menuInserirTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirTurmaActionPerformed
        // TODO add your handling code here:
        FormTurma form=new FormTurma(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Turma");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuInserirTurmaActionPerformed

    private void menuEditarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarAtividadeActionPerformed
        // TODO add your handling code here:
        FormAtividade form=new FormAtividade(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Atividade");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuEditarAtividadeActionPerformed

    private void MenuEditarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEditarDisciplinaActionPerformed
        // TODO add your handling code here:
        FormDisciplina form=new FormDisciplina(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Disciplina");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_MenuEditarDisciplinaActionPerformed

    private void menuEditarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarTurmaActionPerformed
        // TODO add your handling code here:
        FormTurma form=new FormTurma(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Turma");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuEditarTurmaActionPerformed

    private void MenuRemoverAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRemoverAtividadeActionPerformed
        // TODO add your handling code here:
        FormAtividade form=new FormAtividade(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle(" Atividade");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_MenuRemoverAtividadeActionPerformed

    private void MenuRemoverDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRemoverDisciplinaActionPerformed
        // TODO add your handling code here:
        FormDisciplina form=new FormDisciplina(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Disciplina");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_MenuRemoverDisciplinaActionPerformed

    private void MenuRemoverTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRemoverTurmaActionPerformed
        // TODO add your handling code here:
        FormTurma form=new FormTurma(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setTitle("Turma");
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_MenuRemoverTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new sistemaGUI().setVisible(true);
                //executa a janela no meio da tela
                FormMenuPrincipal form = new FormMenuPrincipal();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuArquivoSair;
    private javax.swing.JMenuItem MenuEditarDisciplina;
    private javax.swing.JMenuItem MenuRemoverAluno;
    private javax.swing.JMenuItem MenuRemoverAtividade;
    private javax.swing.JMenuItem MenuRemoverDisciplina;
    private javax.swing.JMenuItem MenuRemoverProfessor;
    private javax.swing.JMenuItem MenuRemoverTurma;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuEditarAluno;
    private javax.swing.JMenuItem menuEditarAtividade;
    private javax.swing.JMenuItem menuEditarProfessor;
    private javax.swing.JMenuItem menuEditarTurma;
    private javax.swing.JMenu menuInserir;
    private javax.swing.JMenuItem menuInserirAluno;
    private javax.swing.JMenuItem menuInserirAtividade;
    private javax.swing.JMenuItem menuInserirDisciplina;
    private javax.swing.JMenuItem menuInserirProfessor;
    private javax.swing.JMenuItem menuInserirTurma;
    private javax.swing.JMenu menuRemover;
    // End of variables declaration//GEN-END:variables
}