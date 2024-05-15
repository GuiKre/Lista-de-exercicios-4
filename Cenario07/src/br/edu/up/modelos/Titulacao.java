package br.edu.up.modelos;

public class Titulacao {
    private String instituicao;
    private int anoConclusao;
    private String titulo;
    private String tcc;

    public Titulacao(){
    }
    public Titulacao(String instituicao, int anoConclusao, String titulo, String tcc) {
        this.instituicao = instituicao;
        this.anoConclusao = anoConclusao;
        this.titulo = titulo;
        this.tcc = tcc;
    }

    public String getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    public int getAnoConclusao() {
        return anoConclusao;
    }
    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTcc() {
        return tcc;
    }
    public void setTcc(String tcc) {
        this.tcc = tcc;
    }   
}
