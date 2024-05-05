package br.edu.up;
import br.edu.up.controles.*;
import br.edu.up.telas.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        MenuAeroporto menuAeroporto = new MenuAeroporto();

        ControleMenuAeroporto menuPrincipal = new ControleMenuAeroporto(menuAeroporto);
        menuPrincipal.inicar();
    }
}
