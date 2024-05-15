package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFund;

    public ClienteEmpresa(){
    }
    public ClienteEmpresa(String cnpj, String inscEstadual, int anoFund) {
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFund = anoFund;
    }
    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito,
            double vlrEmprestado, String cnpj, String inscEstadual, int anoFund) {
        super(nome, telefone, email, endereco, vlrMaxCredito, vlrEmprestado);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFund = anoFund;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscEstadual() {
        return inscEstadual;
    }
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
    public int getAnoFund() {
        return anoFund;
    }
    public void setAnoFund(int anoFund) {
        this.anoFund = anoFund;
    }
}
