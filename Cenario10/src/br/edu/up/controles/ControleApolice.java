package br.edu.up.controles;
import br.edu.up.modelos.*;
import br.edu.up.telas.*;
import java.util.List;
import java.util.ArrayList;

public class ControleApolice {

    private List<Seguro> seguro = new ArrayList<>();
    private MenuApolice menu = new MenuApolice();

    public void iniciar(){
        boolean executando = true;

        while (executando) {
            int opcao = menu.exibirMenuApolice();
            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    executando = false;
                    break;        
                default:
                    menu.exibirMensagem("Opção inválida!");
                    break;
            }
        }    
    }

    private void incluirSeguro(){

    }

    private void localizarSeguro(){

    }

    private void excluirSeguro(){

    }

    private void excluirTodosSeguros(){

    }

    private void listarTodosSeguros(){

    }

    private void verQuantidadeSeguros(){
        
    }
}
