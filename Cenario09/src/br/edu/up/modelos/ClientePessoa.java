package br.edu.up.modelos;

public class ClientePessoa extends Cliente{
    private String cpf;
    private double peso;
    private double altura;

    public ClientePessoa(){
    }
    public ClientePessoa(String cpf, double peso, double altura) {
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }
    public ClientePessoa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito,
            double vlrEmprestado, String cpf, double peso, double altura) {
        super(nome, telefone, email, endereco, vlrMaxCredito, vlrEmprestado);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
