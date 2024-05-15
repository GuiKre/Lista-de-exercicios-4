package br.edu.up.modelos;

public class Competencia {
    private String nome;
    private String tipo;
    private char situacao;

    public Competencia(){
    }
    public Competencia(String nome, String tipo, char situacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public char getSituacao() {
        return situacao;
    }
    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
}
