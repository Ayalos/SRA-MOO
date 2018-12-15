package model;

public class Curso {
    
    private String Nome;
    private Disciplina Disciplina;
    private Coordenador Coordenador;

    public boolean Cadastra(String Nome) {
        return false;
    }

    public boolean Altera(String Nome) {
        return false;
    }

    public boolean Matricula(Estudante Estudante) {
        return false;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Disciplina getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(Disciplina Disciplina) {
        this.Disciplina = Disciplina;
    }

    public Coordenador getCoordenador() {
        return Coordenador;
    }

    public void setCoordenador(Coordenador Coordenador) {
        this.Coordenador = Coordenador;
    }
    
    
}
