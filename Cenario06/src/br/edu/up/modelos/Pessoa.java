package br.edu.up.modelos;

public class Pessoa {

    private String nome;
    private String rg;
    private String aeronave;

    public Pessoa() {
    }
    public Pessoa(String nome, String rg, String aeronave) {
        this.nome = nome;
        this.rg = rg;
        this.aeronave = aeronave;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getAeronave() {
        return aeronave;
    }
    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }
}
