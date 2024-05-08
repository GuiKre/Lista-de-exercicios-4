package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.GerirEvento;

public class Menu {
    
    Scanner leitor = new Scanner(System.in);
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
    GerirEvento gerirEvento = new GerirEvento();
    public void executarMenuEventos(){

        System.out.println("\n---Menu Eventos---");
        System.out.println("\nSelecione a opção desejada");
        System.out.println("1. Incluir evento");
        System.out.println("2. Alterar evento");
        System.out.println("3. Listar eventos");
        System.out.println("4. Excluir evento");
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

                break;
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
        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        
            default:
                System.out.println("Valor inválido");
                executarMenuReservas();
                break;
        }
    }
    
}
