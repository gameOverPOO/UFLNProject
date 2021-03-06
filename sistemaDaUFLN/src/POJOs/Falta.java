package POJOs;

import POJOs.Turma;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Falta {
    
    //Atributos
    @Id
    private int id;
    private int falta;
    @OneToOne
    private Turma turma;
    @OneToOne
    private Aluno aluno;

    
    //Métodos
    public Falta(int falta, Turma turma, Aluno aluno) {
        this.falta = falta;
        this.turma = turma;
        this.aluno = aluno;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
