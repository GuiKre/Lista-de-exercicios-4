package br.edu.up.telas;
import java.util.Scanner;

public class MenuCompromisso {

    public void mostrarOpcoes(){
        System.out.println("1. Criar compromisso");
        System.out.println("2. Buscar compromisso");
        System.out.println("3. Excluir compromisso");
        System.out.println("4. Sair");
    }
    public void lerOpcao(int opcao){
        Scanner leitor = new Scanner(System.in);
        opcao = leitor.nextInt();
        leitor.close();
    }
}
