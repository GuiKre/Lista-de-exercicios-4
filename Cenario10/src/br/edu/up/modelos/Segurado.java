package br.edu.up.modelos;

public class Segurado {

    private String nome;
    private String rg;
    private String cpf;
    private Enum sexo;
    private String telefone;
    private String endereco;
    private String cep;
    private String Cidade;
    
    public Segurado() {
    }
    public Segurado(String nome, String rg, String cpf, Enum sexo, String telefone, String endereco, String cep,
            String cidade) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        Cidade = cidade;
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Enum getSexo() {
        return sexo;
    }
    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
}
