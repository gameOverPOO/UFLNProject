
package POJOs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Nota {
    //Atributos
    @Id
    private int id;
    private double nota;
    private Aluno aluno;
    @OneToOne
    private Atividade atividade;

    
    
    //Métodos
    public Nota(double nota, Aluno aluno, Atividade atividade) {
        this.nota = nota;
        this.aluno = aluno;
        this.atividade = atividade;
    }
    

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
