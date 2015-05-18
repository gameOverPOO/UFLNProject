
package sistemadaufln;


public class Nota {
    //Atributos
    private double nota;
    private Aluno aluno;
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
    
}
