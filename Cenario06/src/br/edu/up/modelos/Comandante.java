package br.edu.up.modelos;

public class Comandante extends Tripulacao{

    private int totalHorasVoo;

    public Comandante() {
    }
    public Comandante(String nome, String rg, String aeronave, String identicacaoAeronautica, String matriculaFuncionario, int totalHorasVoo) {
        super(nome, rg, aeronave, identicacaoAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }
    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }
}
