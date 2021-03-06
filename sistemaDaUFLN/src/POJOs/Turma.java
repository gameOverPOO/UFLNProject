
package POJOs;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Turma {

    public Turma() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getCodigo() {
        return codigo;
    }

    /*Consultar turmas (informando disciplina, ano e perodo) - deve ser exibida uma listagem de alunos com
    suas notas e faltas;*/
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    
    
    //Atributos
    @Id
    
    private int codigo;
    private int ano;
    private int periodo;
    public String horario;
    //Local??
    private int vagas;
    @OneToOne
    private Professor professor;
    @OneToOne
    private Disciplina disciplina;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Atividade> atividades = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList<>();

    
    //Métodos
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public Turma(Integer codigo, int ano, int periodo, String horario, int vagas) {
        this.codigo = codigo;
        this.ano = ano;
        this.periodo = periodo;
        this.horario = horario;
        this.vagas = vagas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
}