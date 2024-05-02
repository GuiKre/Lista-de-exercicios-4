package br.edu.up.modelos;

public class Reserva {
    
    private String nomeResponsavel;
    private int qtdPessoas;
    private double valorTotal;
    private String dataReserva;


    public Reserva() {
    }
    public Reserva(String nomeResponsavel, int qtdPessoas, double valorTotal, String dataReserva) {
        this.nomeResponsavel = nomeResponsavel;
        this.qtdPessoas = qtdPessoas;
        this.valorTotal = valorTotal;
        this.dataReserva = dataReserva;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getDataReserva() {
        return dataReserva;
    }
    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    } 
   
}


