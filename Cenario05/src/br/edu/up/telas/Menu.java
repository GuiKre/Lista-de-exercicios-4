package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.GerirEvento;
import br.edu.up.controles.GerirReserva;

public class Menu {
    
    Scanner leitor = new Scanner(System.in);
    GerirEvento gerirEvento = new GerirEvento();
    GerirReserva gerirReserva = new GerirReserva();
    int opcao = 0;
    
    public void executarMenu(){
        
        System.out.println("---Menu---");
        System.out.println("\nSelecione a opção desejada");
        System.out.println("1. Eventos");
        System.out.println("2. Reservas");
        opcao = leitor.nextInt();
        System.out.println("");
        
        switch (opcao) {
            case 1:
            executarMenuEventos();
            break;
            case 2:
            executarMenuReservas();
            break;
            default:
            System.out.println("Valor inválido");
            executarMenu();
            break;
        }
        
    }
    public void executarMenuEventos(){

        System.out.println("\n---Menu Eventos---");
        System.out.println("\nSelecione a opção desejada");
        System.out.println("1. Incluir evento");
        System.out.println("2. Alterar evento");
        System.out.println("3. Listar eventos");
        System.out.println("4. Excluir evento");
        System.out.println("5. Voltar");
        opcao = leitor.nextInt();
        System.out.println("");

        switch (opcao) {
            case 1:
                gerirEvento.incluirEvento();
                executarMenuEventos();
                break;
            case 2:
                gerirEvento.alterarEvento();
                executarMenuEventos();
                break;
            case 3:
                gerirEvento.listarEventos();
                executarMenuEventos();
                break;
            case 4:
                gerirEvento.excluirEvento();
                executarMenuEventos();
                break;
            case 5:
                executarMenu();
            default:
                System.out.println("Valor inválido");
                executarMenuEventos();
                break;
        }
    }
    public void executarMenuReservas(){

        System.out.println("---Menu Reservas---");
        System.out.println("\nSelecione a opção desejada");
        System.out.println("1. Incluir reserva");
        System.out.println("2. Alterar reserva");
        System.out.println("3. Listar reservas");
        System.out.println("4. Excluir reserva");
        System.out.println("5. Voltar");
        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                gerirReserva.incluirReserva();
                executarMenuReservas();
                break;
            case 2:
                break;
            case 3:
                gerirReserva.listarReserva();
                executarMenuReservas();
                break;
            case 4:
                break;
            case 5:
                executarMenu();
                break;
        
            default:
                System.out.println("Valor inválido");
                executarMenuReservas();
                break;
        }
    }
    
}
