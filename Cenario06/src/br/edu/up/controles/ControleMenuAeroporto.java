package br.edu.up.controles;
//import br.edu.up.modelos.*;
import br.edu.up.telas.*;

public class ControleMenuAeroporto {

    private MenuAeroporto menuAeroporto;

    public ControleMenuAeroporto(MenuAeroporto menuAeroporto){
        this.menuAeroporto = menuAeroporto;
    }

    public void inicar(){
        boolean executando = true;
        while (executando) {
            menuAeroporto.exibirMenuAeroporto();
            menuAeroporto.lerOpcao();
            switch (menuAeroporto.getOpcao()){
                case 1:
                    menuAeroporto.registrarPassageiro();
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
