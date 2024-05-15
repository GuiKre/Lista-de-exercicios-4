package br.edu.up.telas;

import java.util.Scanner;

public class MenuApolice {

    private Scanner scanner;
    
    public MenuApolice(){
        scanner = new Scanner(System.in);
    }

    public int exibirMenuApolice(){
        System.out.println("\n---Menu---");
        System.out.println("1 - Incluir seguro");
        System.out.println("2 - Localizar seguro");
        System.out.println("3 - Excluir seguro");
        System.out.println("4 - Excluir todos os seguros");
        System.out.println("5 - Listar todos os seguros");
        System.out.println("6 - Ver quantidade de seguros");
        System.out.println("7 - Sair");
        System.out.println("\nEscolha uma opção: ");
        return scanner.nextInt();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String lerEntrada(String dados) {
        System.out.print(dados);
        return scanner.next();
    }

    public int lerInteiro(String dados) {
        System.out.print(dados);
        return scanner.nextInt();
    }

    public double lerDouble(String dados) {
        System.out.print(dados);
        return scanner.nextDouble();
    }

    public boolean lerBoolean(String dados) {
        System.out.print(dados + " (true/false): ");
        return scanner.nextBoolean();
    }
}
