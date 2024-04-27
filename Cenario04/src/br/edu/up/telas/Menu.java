package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.modelos.Carro;

public class Menu {

    private Scanner scanner;
    public void menu(){
        scanner = new Scanner(System.in);
    }

    public void exibirMenu(){
        System.out.println("---Menu---");
        System.out.println("1 - Registrar veículos");
        System.out.println("2 - Buscar veículo");
        System.out.println("3 - Emitir relatório");
        System.out.println("4 - Sair");
    }
    public int lerOpcao(){
        return scanner.nextInt();
    }

    public Carro lerCarro(){
        System.out.print("Modelo do carro: ");
        String modelo = scanner.next();
        System.out.print("Placa do carro: ");
        String placa = scanner.next();
        System.out.print("Cor do carro: ");
        String cor = scanner.next();
        return new Carro(modelo, placa, cor);
    }

    public String lerPlaca(){
        System.out.print("Placa do carro: ");
        return scanner.next();
    }
}
