package br.edu.up.modelos;

public class Tripulacao extends Pessoa {

    private String identicacaoAeronautica;
    private String matriculaFuncionario;
    
    public Tripulacao() {
    }
    public Tripulacao(String nome, String rg, String aeronave, String identicacaoAeronautica, String matriculaFuncionario) {
        super(nome, rg, aeronave);
        this.identicacaoAeronautica = identicacaoAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getIdenticacaoAeronautica() {
        return identicacaoAeronautica;
    }
    public void setIdenticacaoAeronautica(String identicacaoAeronautica) {
        this.identicacaoAeronautica = identicacaoAeronautica;
    }
    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }
    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }
}
