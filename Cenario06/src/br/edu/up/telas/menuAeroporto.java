package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class MenuAeroporto {

    private int opcao;
    private Scanner scanner;
    
    public void exibirMenuAeroporto(){
        System.out.println("\n---Menu---");
        System.out.println("1 - Registrar passageiro");
        System.out.println("2 - Remover passageiro");
        System.out.println("3 - Sair\n");
    }
    public void lerOpcao(){
        scanner = new Scanner(System.in);
        this.opcao = scanner.nextInt();
    }

    public Passageiro registrarPassageiro(){
        System.out.print("Nome do passageiro: ");
        String nome = scanner.nextLine();
        System.out.print("RG do passageiro: ");
        String rg = scanner.nextLine();
        System.out.print("Aeronave utilizada pelo passageiro: ");
        String aeronave = scanner.next();
        System.out.print("Identificador da bagagem do passageiro: ");
        String identificadorBagagem = scanner.nextLine();
        System.out.print("Número do assento do passageiro: ");
        int numeroAssento = scanner.nextInt();
        System.out.print("Classe do assento do passageiro: ");
        String classeAssento = scanner.nextLine();
        System.out.print("Data do voo do passageiro: ");
        String dataVoo = scanner.nextLine();
        return new Passageiro(nome, rg, aeronave, identificadorBagagem, numeroAssento, classeAssento, dataVoo);
    }

    public int getOpcao(){
        return opcao;
    }
}
