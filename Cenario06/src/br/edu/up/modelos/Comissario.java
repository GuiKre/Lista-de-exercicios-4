package br.edu.up.modelos;

public class Comissario extends Tripulacao{

    private String[] idiomasFluencia;

    public Comissario() {
    }
    public Comissario(String nome, String rg, Aeronave aeronave, String identicacaoAeronautica, String matriculaFuncionario, String[] idiomasFluencia) {
        super(nome, rg, aeronave, identicacaoAeronautica, matriculaFuncionario);
        this.idiomasFluencia = idiomasFluencia;
    }

    public String[] getIdiomasFluencia() {
        return idiomasFluencia;
    }
    public void setIdiomasFluencia(String[] idiomasFluencia) {
        this.idiomasFluencia = idiomasFluencia;
    } 
}
