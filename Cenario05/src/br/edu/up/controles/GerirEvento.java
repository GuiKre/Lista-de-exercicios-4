package br.edu.up.controles;
import br.edu.up.modelos.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GerirEvento {
    Scanner leitor = new Scanner(System.in);

    ArrayList<Evento> eventos = new ArrayList<>(); 
    public void incluirEvento(){

        leitor.nextLine(); //Só para avançar para a próxima linha
        System.out.print("Digite o nome do evento: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a data do evento: ");
        String data = leitor.nextLine();

        System.out.print("Digite o local do evento: ");
        String local = leitor.nextLine();

        System.out.print("Digite a lotação máxima do evento: ");
        int lotacaoMaxima = leitor.nextInt();

        System.out.println("Digite os numero de ingressos vendidos do evento: ");
        int ingressosVendidos = leitor.nextInt();

        System.out.println("Digite o preço do ingresso: ");
        Double precoIngresso = leitor.nextDouble();

        Evento evento = new Evento(nome, data, local, lotacaoMaxima, ingressosVendidos, precoIngresso);

        eventos.add(evento);
    }

    public void listarEventos(){
        System.out.println("---Eventos---");
        for(Evento evento : eventos){
            System.out.println("Nome: " + evento.getNome() +
            "\nData: " + evento.getData() +
            "\nLocal: " + evento.getLocal() +
            "\nLotação máxima: " + evento.getLotacaoMaxima() +
            "\nIngressos vendidos: " + evento.getIngressosVendidos() + 
            "\nPreco do ingresso: " + evento.getPrecoIngresso());
        }
    }

}
