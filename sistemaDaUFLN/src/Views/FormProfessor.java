/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

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
        abaListarProfessor = new javax.swing.JScrollPane();
        tblObjetos = new javax.swing.JTable();
        abaEditarProfessor = new javax.swing.JPanel();
        labelNomeProfessorA = new javax.swing.JLabel();
        campoNomeProfessorA = new javax.swing.JTextField();
        labelNomeProfessorN = new javax.swing.JLabel();
        campoNomeProfessorN = new javax.swing.JTextField();
        abaRemoverProfessor = new javax.swing.JPanel();
        labelRemoverNomeProfessor = new javax.swing.JLabel();
        CampoRemoverNomeProfessor = new javax.swing.JTextField();
        ButtonSalvarProfessor = new javax.swing.JButton();

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

        javax.swing.GroupLayout abaInserirProfessorLayout = new javax.swing.GroupLayout(abaInserirProfessor);
        abaInserirProfessor.setLayout(abaInserirProfessorLayout);
        abaInserirProfessorLayout.setHorizontalGroup(
            abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCpfProfessor)
                    .addComponent(labelNomeProfessor))
                .addGap(4, 4, 4)
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCpfProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(campoNomeProfessor))
                .addContainerGap())
        );
        abaInserirProfessorLayout.setVerticalGroup(
            abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirProfessorLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeProfessor)
                    .addComponent(campoNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaInserirProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpfProfessor)
                    .addComponent(campoCpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
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

        labelNomeProfessorA.setText("Nome do Professor:");

        labelNomeProfessorN.setText("Novo Nome:");

        javax.swing.GroupLayout abaEditarProfessorLayout = new javax.swing.GroupLayout(abaEditarProfessor);
        abaEditarProfessor.setLayout(abaEditarProfessorLayout);
        abaEditarProfessorLayout.setHorizontalGroup(
            abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEditarProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeProfessorA)
                    .addComponent(labelNomeProfessorN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeProfessorA)
                    .addComponent(campoNomeProfessorN, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                .addContainerGap())
        );
        abaEditarProfessorLayout.setVerticalGroup(
            abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEditarProfessorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeProfessorA)
                    .addComponent(campoNomeProfessorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeProfessorN)
                    .addComponent(campoNomeProfessorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        abaProfessor.addTab("Editar", abaEditarProfessor);

        labelRemoverNomeProfessor.setText("Nome do Professor:");

        javax.swing.GroupLayout abaRemoverProfessorLayout = new javax.swing.GroupLayout(abaRemoverProfessor);
        abaRemoverProfessor.setLayout(abaRemoverProfessorLayout);
        abaRemoverProfessorLayout.setHorizontalGroup(
            abaRemoverProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRemoverProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRemoverNomeProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoRemoverNomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );
        abaRemoverProfessorLayout.setVerticalGroup(
            abaRemoverProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRemoverProfessorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(abaRemoverProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRemoverNomeProfessor)
                    .addComponent(CampoRemoverNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        abaProfessor.addTab("Remover", abaRemoverProfessor);

        ButtonSalvarProfessor.setText("Salvar");

        javax.swing.GroupLayout janelaProfessorLayout = new javax.swing.GroupLayout(janelaProfessor);
        janelaProfessor.setLayout(janelaProfessorLayout);
        janelaProfessorLayout.setHorizontalGroup(
            janelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaProfessorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(abaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(janelaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(ButtonSalvarProfessor)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(janelaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
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
    private javax.swing.JButton ButtonSalvarProfessor;
    private javax.swing.JTextField CampoRemoverNomeProfessor;
    private javax.swing.JPanel abaEditarProfessor;
    private javax.swing.JPanel abaInserirProfessor;
    private javax.swing.JScrollPane abaListarProfessor;
    private javax.swing.JTabbedPane abaProfessor;
    private javax.swing.JPanel abaRemoverProfessor;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCpfProfessor;
    private javax.swing.JTextField campoNomeProfessor;
    private javax.swing.JTextField campoNomeProfessorA;
    private javax.swing.JTextField campoNomeProfessorN;
    private javax.swing.JPanel janelaProfessor;
    private javax.swing.JLabel labelCpfProfessor;
    private javax.swing.JLabel labelNomeProfessor;
    private javax.swing.JLabel labelNomeProfessorA;
    private javax.swing.JLabel labelNomeProfessorN;
    private javax.swing.JLabel labelRemoverNomeProfessor;
    private javax.swing.JTable tblObjetos;
    // End of variables declaration//GEN-END:variables
}
