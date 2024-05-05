package br.edu.up.modelos;

public class Passageiro extends Pessoa {

    private String identificadorBagagem;
    // private Passagem passagem;
    private int numeroAssento;
    private String classeAssento;
    private String dataVoo;

    public Passageiro() {     
    } 
    public Passageiro(String nome, String rg, String aeronave, String identificadorBagagem, int numeroAssento, String classeAssento, String dataVoo) {
        super(nome, rg, aeronave);
        this.identificadorBagagem = identificadorBagagem;
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }
    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }
    public void setIdentificadorBagagem(String identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
    }
    // public Passagem getPassagem() {
    //     return passagem;
    // }
    // public void setPassagem(Passagem passagem) {
    //     this.passagem = passagem;
    // }
    public int getNumeroAssento() {
        return numeroAssento;
    }
    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
    public String getClasseAssento() {
        return classeAssento;
    }
    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }
    public String getDataVoo() {
        return dataVoo;
    }
    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }
    
}
