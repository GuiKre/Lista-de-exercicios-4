package br.edu.up.modelos;

public class Professor extends Pessoa {
    private int numId;
    private Titulacao titulacao;

    public Professor(){
    }
    public Professor(int numId, Titulacao titulacao) {
        this.numId = numId;
        this.titulacao = titulacao;
    }
    public Professor(String nome, int rg, int matricula, int numId, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.numId = numId;
        this.titulacao = titulacao;
    }

    public int getNumId() {
        return numId;
    }
    public void setNumId(int numId) {
        this.numId = numId;
    }
    public Titulacao getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
}
