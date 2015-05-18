package sistemadaufln;

public class Falta {
    
    //Atributos
    private int falta;
    private Turma turma;
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
