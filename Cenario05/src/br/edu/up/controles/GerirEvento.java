package br.edu.up.controles;
import br.edu.up.modelos.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GerirEvento {
    Scanner leitor = new Scanner(System.in);

    Evento evento = new Evento();
    ArrayList<Evento> eventos = new ArrayList<>(); 
    public void incluirEvento(){

        leitor.nextLine(); //Só para avançar para a próxima linha
        System.out.print("Digite o nome do evento: ");
        evento.setNome(leitor.nextLine());

        System.out.print("Digite a data do evento: ");
        evento.setData(leitor.nextLine());

        System.out.print("Digite o local do evento: ");
        evento.setLocal(leitor.nextLine());

        System.out.print("Digite a lotação máxima do evento: ");
        evento.setLotacaoMaxima(leitor.nextInt());

        System.out.println("Digite os numero de ingressos vendidos do evento: ");
        evento.setIngressosVendidos(leitor.nextInt());

        System.out.println("Digite o preço do ingresso: ");
        evento.setPrecoIngresso(leitor.nextDouble());


        eventos.add(evento);
    }

    public void alterarEvento(){

        leitor.nextLine();
        System.out.println("Digite o nome do evento que deseja alterar: ");
        String nomeAlteracao = leitor.nextLine();
        if(evento.getNome() == nomeAlteracao){
            System.out.println("Digite qual informação do evento deseja alterar: (1) Nome (2) Data (3) Local\n (4) Lotação Máxima (5) Ingressos Vendidos (6) Preço do Ingresso");
            int op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o novo nome do evento: ");
                    evento.setNome(leitor.nextLine());
                    System.out.println("Nome alterado!");
                    break;
                case 2:
                    System.out.println("Digite a nova data do evento: ");
                    evento.setData(leitor.nextLine());
                    System.out.println("Data alterada!");
                    break;
                case 3:
                    System.out.println("Digite o novo local do evento: ");
                    evento.setLocal(leitor.nextLine());
                    System.out.println("Local alterado!");
                    break;
                case 4:
                    System.out.println("Digite a nova lotação máxima do evento: ");
                    evento.setLotacaoMaxima(leitor.nextInt());
                    System.out.println("Lotação máxima alterada!");
                    break;
                case 5:
                    System.out.println("Digite o novo numero de ingressos do evento: ");
                    evento.setIngressosVendidos(leitor.nextInt());
                    System.out.println("Número de ingressos alterado!");
                    break;
                case 6:
                    System.out.println("Digite o novo preco do ingresso do evento: ");
                    evento.setPrecoIngresso(leitor.nextDouble());
                    System.out.println("Preço de ingresso alterado!");
                    break;
            }
        }
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

    public void excluirEvento(){
        System.out.println("Digite o nome do evento que deseja excluir: ");        
        String nomeExclusao = leitor.nextLine();
        if(evento.getNome() == nomeExclusao){
            System.out.println("Tem certeza que deseja excluir este evento?\n(1) Sim (2) Não");
            int op = leitor.nextInt();
            if (op == 1) {
                evento = null;
            }else{
                excluirEvento();
            }
        }
    }

}
