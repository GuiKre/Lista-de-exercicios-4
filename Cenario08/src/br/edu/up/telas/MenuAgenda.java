package br.edu.up.telas;
import java.util.Scanner;

public class MenuAgenda {

    private Scanner scanner;
    
    public MenuAgenda(){
        scanner = new Scanner(System.in);
    }

    public int exibirMenuAgenda(){
        System.out.println("\n---Menu---");
        System.out.println("1 - Incluir um contato pessoal");
        System.out.println("2 - Incluir um contato comercial");
        System.out.println("3 - Excluir um contato pelo código");
        System.out.println("4 - Consultar um contato pelo código");
        System.out.println("5 - Listar todos os contatos");
        System.out.println("6 - Sair do programa");
        System.out.println("\nEscolha uma opção: ");
        return scanner.nextInt();
    }
    
    public int obterCodigo() {
        System.out.print("Digite o código: ");
        return scanner.nextInt();
    }

    public String obterNome() {
        System.out.print("Digite o nome: ");
        return scanner.next();
    }

    public String obterTelefone() {
        System.out.print("Digite o telefone: ");
        return scanner.next();
    }

    public String obterAniversario() {
        System.out.print("Digite o aniversário: ");
        return scanner.next();
    }

    public String obterCnpj() {
        System.out.print("Digite o CNPJ: ");
        return scanner.next();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
