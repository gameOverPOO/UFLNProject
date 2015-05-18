
package sistemadaufln;

import java.util.*;

public class Turma {
    private int ano;
    private int periodo;
    public Horario horario;
    //Local??
    private int vagas;
    private Professor professor;
    private Disciplina disciplina;
    public List<Atividade> atividades = new ArrayList<>();

    
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public Turma(int ano, int periodo, Horario horario, int vagas, Professor professor, Disciplina disciplina) {
        this.ano = ano;
        this.periodo = periodo;
        this.horario = horario;
        this.vagas = vagas;
        this.professor = professor;
        this.disciplina = disciplina;
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

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
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
    
    
}
