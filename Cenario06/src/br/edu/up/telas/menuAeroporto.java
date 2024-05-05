package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class menuAeroporto {

    private int opcao;
    private Scanner scanner;
    
    public void exibirMenu(){
        System.out.println("\n---Menu---");
        System.out.println("1 - Registrar passageiro");
        System.out.println("2 - Remover passageiro");
        System.out.println("3 - Sair\n");
    }
    public void lerOpcao(){
        scanner = new Scanner(System.in);
        this.opcao = scanner.nextInt();
    }
}
