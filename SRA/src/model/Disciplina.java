package model;

public class Disciplina {
    
    private String Nome;
    private String CodDisc;
    private Estudante Estudande;
    private Professor Professor;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCodDisc() {
        return CodDisc;
    }

    public void setCodDisc(String CodDisc) {
        this.CodDisc = CodDisc;
    }

    public Estudante getEstudande() {
        return Estudande;
    }

    public void setEstudande(Estudante Estudande) {
        this.Estudande = Estudande;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }
    
    
}
