package br.edu.up.modelos;

public class Livro {

    private String codigo;
    private String titulo;
    private String[] autores = new String[2];
    private String isbn;
    private int ano;

    public Livro(String codigo, String titulo, String[] autores, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }

    public Livro() {
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String[] getAutores() {
        return autores;
    }
    public void setAutores(String autor1){
        this.autores[0] = autor1;
    }
    public void setAutores(String autor1, String autor2) {
        this.autores[0] = autor1;
        this.autores[1] = autor2;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\nTitulo: " + titulo + "\nAutores: " + autores + "\nISBN: " + isbn + "\nAno: " + ano;
    }
}
