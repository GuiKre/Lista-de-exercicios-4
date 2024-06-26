package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano() {
    }
    public Ano(int ano, boolean bissexto, Mes[] meses) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = meses;
    }
    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public boolean isBissexto() {
        return bissexto;
    }
    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }
    public Mes[] getMeses() {
        return meses;
    }
    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }    
}
