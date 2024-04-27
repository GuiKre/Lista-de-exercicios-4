package br.edu.up.controles;
import br.edu.up.telas.MenuCompromisso;


public class ControleMenu {
    int opcao;
    MenuCompromisso menu = new MenuCompromisso();
    CriarCompromisso criarCompromisso = new CriarCompromisso();

    public void iniciar(){
        menu.mostrarOpcoes();
        menu.lerOpcao(opcao);
        switch (opcao) {
            case 1:
                criarCompromisso.criarCompromisso();
                break;

            default:
                break;
        }
    }
}
