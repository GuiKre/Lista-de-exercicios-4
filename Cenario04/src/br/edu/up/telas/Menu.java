package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.modelos.Carro;

public class Menu {

    private int opcao;
    private Scanner scanner;
    
    public void exibirMenu(){
        System.out.println("\n---Menu---");
        System.out.println("1 - Registrar veículos");
        System.out.println("2 - Retirar veículo");
        System.out.println("3 - Ver vagas");
        System.out.println("4 - Emitir relatório");
        System.out.println("5 - Sair\n");
    }
    public void lerOpcao(){
        scanner = new Scanner(System.in);
        this.opcao = scanner.nextInt();
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
    public int getOpcao() {
        return opcao;
    }    
}
