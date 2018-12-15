package model;

public class Turma {

    private String Nome;
    private Estudante Estudante;
    private Professor Professor;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Estudante getEstudante() {
        return Estudante;
    }

    public void setEstudante(Estudante Estudante) {
        this.Estudante = Estudante;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }
    
    

}
