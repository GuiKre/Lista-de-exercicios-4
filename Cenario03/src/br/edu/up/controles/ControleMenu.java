package br.edu.up.controles;
import br.edu.up.telas.*;


public class ControleMenu {
    int opcao;
    Menu menu = new Menu();
    CriarCompromisso criarCompromisso = new CriarCompromisso();

    public void iniciar(){
        menu.mostrarOpcoes();
        menu.lerOpcao();
        switch (opcao) {
            case 1:
                criarCompromisso.criarCompromisso();
                break;
                
            default:
                break;
        }
    }
}
