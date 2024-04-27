package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.telas.Menu;

public class ControleMenu {

    private ControleEstacionamento estacionamento;
    private Menu menu;

    public ControleMenu(ControleEstacionamento estacionamento, Menu menu) {
        this.estacionamento = estacionamento;
        this.menu = menu;
    }

    public void iniciar() {
        boolean executando = true;
        while (executando) {
            menu.exibirMenu();
            int opcao = menu.lerOpcao();
            switch (opcao) {
                case 1:
                    Carro novoCarro = menu.lerCarro();
                    if (estacionamento.entradaCarro(novoCarro)) {
                        System.out.println("Carro estacionado com sucesso!");
                    } else {
                        System.out.println("Não há vagas disponíveis!");
                    }
                    break;
                case 2:
                    String placaSaida = menu.lerPlaca();
                    Carro carroSaida = estacionamento.saidaCarro(placaSaida);
                    if (carroSaida != null) {
                        System.out.println("Carro com a placa: " + placaSaida + " retirado do estacionamento.");
                    } else {
                        System.out.println("Carro não encontrado no estacionamento.");
                    }
                    break;
                case 3:
                    System.out.println("Relatório:");
                    System.out.println("Total de carros estacionados: " + estacionamento.getTotalCarrosEstacionados());
                    System.out.println("Vagas disponíveis: " + estacionamento.getVagasDisponiveis());
                    break;
                case 4:
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
