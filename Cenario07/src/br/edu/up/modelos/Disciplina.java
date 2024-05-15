package br.edu.up.modelos;

public class Disciplina {
    private String nome;
    private int id;
    private String curriculo;
    private Competencia competencias[];
    private Professor professor;
    private Aluno alunosMatriculados[];

    public Disciplina(){
    }
    public Disciplina(String nome, int id, String curriculo, Competencia[] competencias, Professor professor,
            Aluno[] alunosMatriculados) {
        this.nome = nome;
        this.id = id;
        this.curriculo = curriculo;
        this.competencias = competencias;
        this.professor = professor;
        this.alunosMatriculados = alunosMatriculados;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCurriculo() {
        return curriculo;
    }
    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    public Competencia[] getCompetencias() {
        return competencias;
    }
    public void setCompetencias(Competencia[] competencias) {
        this.competencias = competencias;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAlunosMatriculados() {
        return alunosMatriculados;
    }
    public void setAlunosMatriculados(Aluno[] alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    } 
}
