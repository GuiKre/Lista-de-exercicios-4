package br.edu.up.modelos;

import java.time.LocalDate;

public class Seguro {

    private String apolice;
    private Segurado Segurado;
    private Double vlrApolice;
    private LocalDate dtaInicio;
    private LocalDate dtaFim;
    public Seguro() {
    }
    public Seguro(String apolice, br.edu.up.modelos.Segurado segurado, Double vlrApolice, LocalDate dtaInicio, LocalDate dtaFim) {
        this.apolice = apolice;
        Segurado = segurado;
        this.vlrApolice = vlrApolice;
        this.dtaInicio = dtaInicio;
        this.dtaFim = dtaFim;
    }

    public String getApolice() {
        return apolice;
    }
    public void setApolice(String apolice) {
        this.apolice = apolice;
    }
    public Segurado getSegurado() {
        return Segurado;
    }
    public void setSegurado(Segurado segurado) {
        Segurado = segurado;
    }
    public Double getVlrApolice() {
        return vlrApolice;
    }
    public void setVlrApolice(Double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }
    public LocalDate getDtaInicio() {
        return dtaInicio;
    }
    public void setDtaInicio(LocalDate dtaInicio) {
        this.dtaInicio = dtaInicio;
    }
    public LocalDate getDtaFim() {
        return dtaFim;
    }
    public void setDtaFim(LocalDate dtaFim) {
        this.dtaFim = dtaFim;
    }

 
}