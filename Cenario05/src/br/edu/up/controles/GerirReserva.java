package br.edu.up.controles;
import br.edu.up.modelos.*;
import java.util.ArrayList;
import java.util.List;
import br.edu.up.Prompt;

public class GerirReserva {

    GerirEvento gerirEventoReserva = new GerirEvento();
    Reserva reserva = new Reserva();
    ArrayList<Reserva> reservas = new ArrayList<>();
    List<Evento> eventosReserva = gerirEventoReserva.getEventos();

    public void incluirReserva(){
        
        reserva.setNomeResponsavel(Prompt.lerLinha("Digite o nome do responsável pela reserva: "));

        reserva.setQtdPessoas(Prompt.lerInteiro("Digite a quantidade de pessoas da reserva: "));

        String nomeEventoReserva = Prompt.lerLinha("Digite o nome do evento: ");
        for (int i = 0; i < eventosReserva.size(); i++) {
            Evento eventoReserva = eventosReserva.get(i);
            if(eventoReserva.getNome().equalsIgnoreCase(nomeEventoReserva)){
                reserva.setDataReserva(eventoReserva.getData());
                reserva.setValorTotal(eventoReserva.getPrecoIngresso() * reserva.getQtdPessoas());
                reserva.setEvento(eventoReserva);
            }
        }

        reservas.add(reserva);
      
    }

    public void listarReserva(){
        System.out.println("---Reservas---");
        for(Reserva reserva : reservas){
            System.out.println("Nome do Responsável: " + reserva.getNomeResponsavel() +
            "\nQuantidade de pessoas: " + reserva.getQtdPessoas() +
            "\nNome do evento: " + reserva.getEvento());
            // "\nData: " + reserva.getData() +
            // "\nLocal: " + reserva.getLocal() +
            // "\nLotação máxima: " + reserva.getLotacaoMaxima() +
            // "\nIngressos vendidos: " + reserva.getIngressosVendidos() + 
            // "\nPreco do ingresso: R$" + reserva.getPrecoIngresso());
        }
    }


}
