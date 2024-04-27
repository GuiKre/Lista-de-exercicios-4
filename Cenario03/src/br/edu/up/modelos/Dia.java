package br.edu.up.modelos;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia() {
    }
    public Dia(int diaMes, Compromisso[] compromissos) {
        this.diaMes = diaMes;
        this.compromissos = compromissos;
    }

    public int getDiaMes() {
        return diaMes;
    }
    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public Compromisso consultarCompromissos(int hora) {
        for (int i = 0; i < compromissos.length; i++) {
            if(compromissos[i].getHora() == hora){
                return compromissos[i];
            }else{
                return null;
            }
        }
        return null;
    }
    
    public void adicionarCompromisso(Compromisso[] compromissos){
        this.compromissos = compromissos;
    }
    public void excluirCompromisso(Compromisso[] compromissos){
        this.compromissos = null;
    }
}
