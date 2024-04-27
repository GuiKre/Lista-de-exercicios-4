package br.edu.up;
import br.edu.up.controles.*;
import br.edu.up.telas.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        ControleEstacionamento estacionamento = new ControleEstacionamento();
        Menu menu = new Menu();

        ControleMenu menuPrincipal = new ControleMenu(estacionamento, menu);
        menuPrincipal.iniciar();
    }
}
