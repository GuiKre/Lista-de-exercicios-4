package br.edu.up.telas;
import java.util.Scanner;

public class Menu {

    public void executar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("---Menu---");
        System.out.println("1 - Registrar veículos");
        System.out.println("2 - Verificar vagas");
        System.out.println("3 - Buscar veículo");
        System.out.println("4 - Emitir relatório");

        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
        }
    }
}
