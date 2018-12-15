package model;

public class Pessoa {
    
    protected String Nome;
    protected char Sexo;
    protected String CPF;
    protected String RG;
    protected String DataNasc;
    protected String Matricula;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public Pessoa(String Nome, char Sexo, String CPF, String RG, String DataNasc, String Matricula) {
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.CPF = CPF;
        this.RG = RG;
        this.DataNasc = DataNasc;
        this.Matricula = Matricula;
    }

    public Pessoa() {
    }
    
    
}
