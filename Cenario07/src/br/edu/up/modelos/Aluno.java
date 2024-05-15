package br.edu.up.modelos;

public class Aluno extends Pessoa {
    private int anoIngresso;
    private String curso;
    private String turno;
    
    public Aluno() {
    }
    public Aluno(String nome, int rg, int matricula) {
        super(nome, rg, matricula);
    }
    public Aluno(int anoIngresso, String curso, String turno) {
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
    }
    public Aluno(String nome, int rg, int matricula, int anoIngresso, String curso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
