package br.edu.up.controles;

import br.edu.up.modelos.Carro;

public class ControleEstacionamento {

    private static int numeroVagas = 10;
    private Carro[] carrosEstacionados;
    private int vagasDisponiveis;

    public ControleEstacionamento() {
        carrosEstacionados = new Carro[numeroVagas];
        vagasDisponiveis = numeroVagas;
    }

    public boolean entradaCarro(Carro carro) {
        if (vagasDisponiveis > 0) {
            for (int i = 0; i < numeroVagas; i++) {
                if (carrosEstacionados[i] == null) {
                    carrosEstacionados[i] = carro;
                    vagasDisponiveis--;
                    return true;
                }
            }
        }
        return false;
    }

    public Carro saidaCarro(String placa) {
        for (int i = 0; i < numeroVagas; i++) {
            if (carrosEstacionados[i] != null && carrosEstacionados[i].getPlaca().equals(placa)) {
                Carro carroSaida = carrosEstacionados[i];
                carrosEstacionados[i] = null;
                vagasDisponiveis++;
                return carroSaida;
            }
        }
        return null;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public int getTotalCarrosEstacionados() {
        int total = 0;
        for (Carro carro : carrosEstacionados) {
            if (carro != null) {
                total++;
            }
        }
        return total;
    }
}

