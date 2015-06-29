/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import POJOs.Turma;

/**
 *
 * @author john
 */
public class FormTurma extends javax.swing.JDialog {

    /**
     * Creates new form FormTurma
     */
    public FormTurma(java.awt.Frame parent, boolean modal) {
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

        janelaTurma = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        abaTurma = new javax.swing.JTabbedPane();
        abaInserirTurma = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        labelAnoTurma = new javax.swing.JLabel();
        campoCodigoTurma = new javax.swing.JTextField();
        try{ javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("#####"); campoCpfAluno = new javax.swing.JFormattedTextField(data); } catch (Exception e){ }
        campoAnoTurma = new javax.swing.JTextField();
        try{ javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####"); campoCpfAluno = new javax.swing.JFormattedTextField(data); } catch (Exception e){ }
        labelPeriodoTurma = new javax.swing.JLabel();
        campoPeriodoTurma = new javax.swing.JTextField();
        try{ javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##"); campoCpfAluno = new javax.swing.JFormattedTextField(data); } catch (Exception e){ }
        labelHorarioAulasTurma = new javax.swing.JLabel();
        campoHorarioAulasTurma = new javax.swing.JTextField();
        labelNVagasTurma = new javax.swing.JLabel();
        campoNVagasTurma = new javax.swing.JTextField();
        try{ javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("###"); campoCpfAluno = new javax.swing.JFormattedTextField(data); } catch (Exception e){ }
        ButtonSalvarInserirTurma = new javax.swing.JButton();
        abaEditarTurma = new javax.swing.JPanel();
        labelNomeProfessorA = new javax.swing.JLabel();
        campoNomeProfessorA = new javax.swing.JTextField();
        labelNomeProfessorN = new javax.swing.JLabel();
        campoNomeProfessorN = new javax.swing.JTextField();
        ButtonSalvarEditarTurma = new javax.swing.JButton();
        abaRemoverTurma = new javax.swing.JPanel();
        labelRemoverCodigoTurma = new javax.swing.JLabel();
        CampoRemoverNomeTurma = new javax.swing.JTextField();
        ButtonSalvarRemoverTurma = new javax.swing.JButton();
        abaInserirAlunoTurma = new javax.swing.JPanel();
        labelCpfAluno = new javax.swing.JLabel();
        labelCodigoTurma = new javax.swing.JLabel();
        campoCpfAluno = new javax.swing.JTextField();
        CampoCodigoTurma = new javax.swing.JTextField();
        ButtonSalvarInserirAlunoTurma = new javax.swing.JButton();
        abaInserirProfessorTurma = new javax.swing.JPanel();
        labelCpfProfessor = new javax.swing.JLabel();
        campoCpfProfessor = new javax.swing.JTextField();
        labelCodigoDaTurma = new javax.swing.JLabel();
        campoCodigoDaTurma = new javax.swing.JTextField();
        ButtonSalvarInserirProfessorTurma = new javax.swing.JButton();
        abaInserirAtividadeTurma = new javax.swing.JPanel();
        labelCodigoDaTurm = new javax.swing.JLabel();
        labelNomeAtividade = new javax.swing.JLabel();
        campoCodigTurma = new javax.swing.JTextField();
        campoNomeAtividade = new javax.swing.JTextField();
        ButtonSalvarInserirAtividadeTurma = new javax.swing.JButton();
        abaListarProfessoresTurma = new javax.swing.JPanel();
        paneTabelaListarProfTurma = new javax.swing.JScrollPane();
        tblProfessorTurma = new javax.swing.JTable();
        labelCodTurma1 = new javax.swing.JLabel();
        campoCodTurma1 = new javax.swing.JTextField();
        buttonPesquisarAlunoTurma1 = new javax.swing.JButton();
        abaListarAlunosTurma = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelCodTurma = new javax.swing.JLabel();
        campoCodTurma = new javax.swing.JTextField();
        buttonPesquisarAlunoTurma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        janelaTurma.setBorder(javax.swing.BorderFactory.createTitledBorder("Turma"));
        janelaTurma.setToolTipText("");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        labelCodigo.setText("Codigo:");

        labelAnoTurma.setText("Ano:");

        labelPeriodoTurma.setText("Periodo:");

        labelHorarioAulasTurma.setText("Horário das Aulas:");

        labelNVagasTurma.setText("Número de Vagas:");

        ButtonSalvarInserirTurma.setText("Salvar");
        ButtonSalvarInserirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarInserirTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaInserirTurmaLayout = new javax.swing.GroupLayout(abaInserirTurma);
        abaInserirTurma.setLayout(abaInserirTurmaLayout);
        abaInserirTurmaLayout.setHorizontalGroup(
            abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaInserirTurmaLayout.createSequentialGroup()
                        .addGroup(abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo)
                            .addComponent(labelAnoTurma))
                        .addGap(18, 18, 18)
                        .addGroup(abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoAnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(abaInserirTurmaLayout.createSequentialGroup()
                                .addComponent(labelHorarioAulasTurma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoHorarioAulasTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(abaInserirTurmaLayout.createSequentialGroup()
                                .addComponent(labelNVagasTurma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNVagasTurma))))
                    .addGroup(abaInserirTurmaLayout.createSequentialGroup()
                        .addComponent(labelPeriodoTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPeriodoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(397, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaInserirTurmaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirTurma))
        );
        abaInserirTurmaLayout.setVerticalGroup(
            abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(campoCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHorarioAulasTurma)
                    .addComponent(campoHorarioAulasTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnoTurma)
                    .addComponent(labelNVagasTurma)
                    .addComponent(campoNVagasTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaInserirTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPeriodoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPeriodoTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirTurma))
        );

        abaTurma.addTab("Inserir", abaInserirTurma);

        labelNomeProfessorA.setText("Nome do Professor:");

        labelNomeProfessorN.setText("Novo Nome:");

        ButtonSalvarEditarTurma.setText("Salvar");

        javax.swing.GroupLayout abaEditarTurmaLayout = new javax.swing.GroupLayout(abaEditarTurma);
        abaEditarTurma.setLayout(abaEditarTurmaLayout);
        abaEditarTurmaLayout.setHorizontalGroup(
            abaEditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEditarTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaEditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeProfessorA)
                    .addComponent(labelNomeProfessorN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaEditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeProfessorA)
                    .addComponent(campoNomeProfessorN, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaEditarTurmaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarEditarTurma))
        );
        abaEditarTurmaLayout.setVerticalGroup(
            abaEditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaEditarTurmaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(abaEditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeProfessorA)
                    .addComponent(campoNomeProfessorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaEditarTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeProfessorN)
                    .addComponent(campoNomeProfessorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(ButtonSalvarEditarTurma))
        );

        abaTurma.addTab("Editar", abaEditarTurma);

        labelRemoverCodigoTurma.setText("Código da Turma:");

        ButtonSalvarRemoverTurma.setText("Salvar");

        javax.swing.GroupLayout abaRemoverTurmaLayout = new javax.swing.GroupLayout(abaRemoverTurma);
        abaRemoverTurma.setLayout(abaRemoverTurmaLayout);
        abaRemoverTurmaLayout.setHorizontalGroup(
            abaRemoverTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRemoverTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRemoverCodigoTurma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoRemoverNomeTurma, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaRemoverTurmaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarRemoverTurma))
        );
        abaRemoverTurmaLayout.setVerticalGroup(
            abaRemoverTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaRemoverTurmaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(abaRemoverTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRemoverCodigoTurma)
                    .addComponent(CampoRemoverNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(ButtonSalvarRemoverTurma))
        );

        abaTurma.addTab("Remover", abaRemoverTurma);

        labelCpfAluno.setText("CPF do Aluno:");

        labelCodigoTurma.setText("Código da Turma:");

        ButtonSalvarInserirAlunoTurma.setText("Salvar");

        javax.swing.GroupLayout abaInserirAlunoTurmaLayout = new javax.swing.GroupLayout(abaInserirAlunoTurma);
        abaInserirAlunoTurma.setLayout(abaInserirAlunoTurmaLayout);
        abaInserirAlunoTurmaLayout.setHorizontalGroup(
            abaInserirAlunoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirAlunoTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaInserirAlunoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaInserirAlunoTurmaLayout.createSequentialGroup()
                        .addComponent(labelCodigoTurma)
                        .addGap(18, 18, 18)
                        .addComponent(CampoCodigoTurma)
                        .addGap(451, 451, 451))
                    .addGroup(abaInserirAlunoTurmaLayout.createSequentialGroup()
                        .addComponent(labelCpfAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(campoCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaInserirAlunoTurmaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonSalvarInserirAlunoTurma))))
        );
        abaInserirAlunoTurmaLayout.setVerticalGroup(
            abaInserirAlunoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirAlunoTurmaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(abaInserirAlunoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpfAluno)
                    .addComponent(campoCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaInserirAlunoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoTurma)
                    .addComponent(CampoCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirAlunoTurma))
        );

        abaTurma.addTab("Inserir Aluno na Turma", abaInserirAlunoTurma);

        labelCpfProfessor.setText("CPF do Professor:");

        labelCodigoDaTurma.setText("Código:");

        ButtonSalvarInserirProfessorTurma.setText("Salvar");

        javax.swing.GroupLayout abaInserirProfessorTurmaLayout = new javax.swing.GroupLayout(abaInserirProfessorTurma);
        abaInserirProfessorTurma.setLayout(abaInserirProfessorTurmaLayout);
        abaInserirProfessorTurmaLayout.setHorizontalGroup(
            abaInserirProfessorTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirProfessorTurmaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(abaInserirProfessorTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigoDaTurma)
                    .addComponent(labelCpfProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaInserirProfessorTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCodigoDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(473, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaInserirProfessorTurmaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirProfessorTurma))
        );
        abaInserirProfessorTurmaLayout.setVerticalGroup(
            abaInserirProfessorTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirProfessorTurmaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(abaInserirProfessorTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpfProfessor)
                    .addComponent(campoCpfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaInserirProfessorTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoDaTurma)
                    .addComponent(campoCodigoDaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirProfessorTurma))
        );

        abaTurma.addTab("Inserir Professor na Turma", abaInserirProfessorTurma);

        labelCodigoDaTurm.setText("Código da Turma:");

        labelNomeAtividade.setText("Nome da Atividade:");

        ButtonSalvarInserirAtividadeTurma.setText("Salvar");

        javax.swing.GroupLayout abaInserirAtividadeTurmaLayout = new javax.swing.GroupLayout(abaInserirAtividadeTurma);
        abaInserirAtividadeTurma.setLayout(abaInserirAtividadeTurmaLayout);
        abaInserirAtividadeTurmaLayout.setHorizontalGroup(
            abaInserirAtividadeTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirAtividadeTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaInserirAtividadeTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigoDaTurm)
                    .addComponent(labelNomeAtividade))
                .addGap(45, 45, 45)
                .addGroup(abaInserirAtividadeTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNomeAtividade, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(campoCodigTurma))
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaInserirAtividadeTurmaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirAtividadeTurma))
        );
        abaInserirAtividadeTurmaLayout.setVerticalGroup(
            abaInserirAtividadeTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaInserirAtividadeTurmaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(abaInserirAtividadeTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoDaTurm)
                    .addComponent(campoCodigTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(abaInserirAtividadeTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAtividade)
                    .addComponent(campoNomeAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(ButtonSalvarInserirAtividadeTurma))
        );

        abaTurma.addTab("Inserir Atividade na Turma", abaInserirAtividadeTurma);

        tblProfessorTurma.setModel(new javax.swing.table.DefaultTableModel(
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
        paneTabelaListarProfTurma.setViewportView(tblProfessorTurma);

        labelCodTurma1.setText("Código da Turma:");

        buttonPesquisarAlunoTurma1.setText("Pesquisar");

        javax.swing.GroupLayout abaListarProfessoresTurmaLayout = new javax.swing.GroupLayout(abaListarProfessoresTurma);
        abaListarProfessoresTurma.setLayout(abaListarProfessoresTurmaLayout);
        abaListarProfessoresTurmaLayout.setHorizontalGroup(
            abaListarProfessoresTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListarProfessoresTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaListarProfessoresTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneTabelaListarProfTurma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addGroup(abaListarProfessoresTurmaLayout.createSequentialGroup()
                        .addComponent(labelCodTurma1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCodTurma1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPesquisarAlunoTurma1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        abaListarProfessoresTurmaLayout.setVerticalGroup(
            abaListarProfessoresTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListarProfessoresTurmaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(abaListarProfessoresTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodTurma1)
                    .addComponent(campoCodTurma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisarAlunoTurma1))
                .addGap(45, 45, 45)
                .addComponent(paneTabelaListarProfTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaTurma.addTab("Listar Professores da Turma", abaListarProfessoresTurma);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        labelCodTurma.setText("Código da Turma:");

        buttonPesquisarAlunoTurma.setText("Pesquisar");

        javax.swing.GroupLayout abaListarAlunosTurmaLayout = new javax.swing.GroupLayout(abaListarAlunosTurma);
        abaListarAlunosTurma.setLayout(abaListarAlunosTurmaLayout);
        abaListarAlunosTurmaLayout.setHorizontalGroup(
            abaListarAlunosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListarAlunosTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaListarAlunosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addGroup(abaListarAlunosTurmaLayout.createSequentialGroup()
                        .addComponent(labelCodTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCodTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPesquisarAlunoTurma)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        abaListarAlunosTurmaLayout.setVerticalGroup(
            abaListarAlunosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListarAlunosTurmaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(abaListarAlunosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodTurma)
                    .addComponent(campoCodTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPesquisarAlunoTurma))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaTurma.addTab("Listar Alunos da Turma", abaListarAlunosTurma);

        javax.swing.GroupLayout janelaTurmaLayout = new javax.swing.GroupLayout(janelaTurma);
        janelaTurma.setLayout(janelaTurmaLayout);
        janelaTurmaLayout.setHorizontalGroup(
            janelaTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaTurmaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoVoltar))
            .addGroup(janelaTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaTurma)
                .addContainerGap())
        );
        janelaTurmaLayout.setVerticalGroup(
            janelaTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, janelaTurmaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(abaTurma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVoltar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(janelaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(janelaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void ButtonSalvarInserirTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarInserirTurmaActionPerformed
        
        
        Turma turma = new Turma();
        turma.setAno(Integer.parseInt(campoAnoTurma.getText()));
        turma.setHorario(campoHorarioAulasTurma.getText());
        turma.setVagas(Integer.parseInt(campoNVagasTurma.getText()));
        turma.setPeriodo(Integer.parseInt(campoPeriodoTurma.getText()));
        turma.setCodigo(Integer.parseInt(campoCodigoTurma.getText()));
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_ButtonSalvarInserirTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormTurma dialog = new FormTurma(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ButtonSalvarEditarTurma;
    private javax.swing.JButton ButtonSalvarInserirAlunoTurma;
    private javax.swing.JButton ButtonSalvarInserirAtividadeTurma;
    private javax.swing.JButton ButtonSalvarInserirProfessorTurma;
    private javax.swing.JButton ButtonSalvarInserirTurma;
    private javax.swing.JButton ButtonSalvarRemoverTurma;
    private javax.swing.JTextField CampoCodigoTurma;
    private javax.swing.JTextField CampoRemoverNomeTurma;
    private javax.swing.JPanel abaEditarTurma;
    private javax.swing.JPanel abaInserirAlunoTurma;
    private javax.swing.JPanel abaInserirAtividadeTurma;
    private javax.swing.JPanel abaInserirProfessorTurma;
    private javax.swing.JPanel abaInserirTurma;
    private javax.swing.JPanel abaListarAlunosTurma;
    private javax.swing.JPanel abaListarProfessoresTurma;
    private javax.swing.JPanel abaRemoverTurma;
    private javax.swing.JTabbedPane abaTurma;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton buttonPesquisarAlunoTurma;
    private javax.swing.JButton buttonPesquisarAlunoTurma1;
    private javax.swing.JTextField campoAnoTurma;
    private javax.swing.JTextField campoCodTurma;
    private javax.swing.JTextField campoCodTurma1;
    private javax.swing.JTextField campoCodigTurma;
    private javax.swing.JTextField campoCodigoDaTurma;
    private javax.swing.JTextField campoCodigoTurma;
    private javax.swing.JTextField campoCpfAluno;
    private javax.swing.JTextField campoCpfProfessor;
    private javax.swing.JTextField campoHorarioAulasTurma;
    private javax.swing.JTextField campoNVagasTurma;
    private javax.swing.JTextField campoNomeAtividade;
    private javax.swing.JTextField campoNomeProfessorA;
    private javax.swing.JTextField campoNomeProfessorN;
    private javax.swing.JTextField campoPeriodoTurma;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel janelaTurma;
    private javax.swing.JLabel labelAnoTurma;
    private javax.swing.JLabel labelCodTurma;
    private javax.swing.JLabel labelCodTurma1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCodigoDaTurm;
    private javax.swing.JLabel labelCodigoDaTurma;
    private javax.swing.JLabel labelCodigoTurma;
    private javax.swing.JLabel labelCpfAluno;
    private javax.swing.JLabel labelCpfProfessor;
    private javax.swing.JLabel labelHorarioAulasTurma;
    private javax.swing.JLabel labelNVagasTurma;
    private javax.swing.JLabel labelNomeAtividade;
    private javax.swing.JLabel labelNomeProfessorA;
    private javax.swing.JLabel labelNomeProfessorN;
    private javax.swing.JLabel labelPeriodoTurma;
    private javax.swing.JLabel labelRemoverCodigoTurma;
    private javax.swing.JScrollPane paneTabelaListarProfTurma;
    private javax.swing.JTable tblProfessorTurma;
    // End of variables declaration//GEN-END:variables
}
