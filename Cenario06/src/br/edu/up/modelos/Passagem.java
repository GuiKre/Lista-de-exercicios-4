package br.edu.up.modelos;

public class Passagem {

    private int numeroAssento;
    private String classeAssento;
    private Data datavoo;
    
    public Passagem() {
    }
    public Passagem(int numeroAssento, String classeAssento, Data datavoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.datavoo = datavoo;
    }

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
    public Data getDatavoo() {
        return datavoo;
    }
    public void setDatavoo(Data datavoo) {
        this.datavoo = datavoo;
    }
}
