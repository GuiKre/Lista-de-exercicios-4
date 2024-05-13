package br.edu.up;
import br.edu.up.telas.*;
import br.edu.up.controles.ControleAgenda;
import br.edu.up.modelos.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();
        MenuAgenda menu = new MenuAgenda();
        ControleAgenda controle = new ControleAgenda(agenda, menu);

        controle.iniciar();
    }
}
