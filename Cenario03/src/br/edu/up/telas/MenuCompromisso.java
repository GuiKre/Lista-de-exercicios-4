package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.*;
import br.edu.up.modelos.*;

public class MenuCompromisso {

    int opcao = 0;
    public void lerOpcao(int opcao){
        Scanner leitor = new Scanner(System.in);
        opcao = leitor.nextInt();
        leitor.close();
    }
    public void mostrarOpcoes(){
        System.out.println("1. Criar compromisso");
        System.out.println("2. Listar compromisso");
        System.out.println("3. Buscar compromisso");
        System.out.println("4. Excluir compromisso");
        System.out.println("5. Sair");
        lerOpcao(opcao);
    }
    public void menu(){

        switch (opcao) {
            case 1:
            Scanner leitor = new Scanner(System.in);
            
            Compromisso compromisso = new Compromisso();
            System.out.println("---Agendar Compromisso---");
            System.out.println("Digite seu nome: ");
            compromisso.setPessoa(leitor.nextLine());
            System.out.println("Digite o local do compromisso: ");
            compromisso.setLocal(leitor.nextLine());
            System.out.println("Digite o assunto do compromisso: ");
            compromisso.setAssunto(leitor.nextLine());
            System.out.println("Digite a hora do compromisso: ");
            compromisso.setHora(leitor.nextInt());
            
            Dia dia = new Dia(diaMes, compromisso);
            System.out.println("Digite o dia do compromisso: ");
            dia.setDiaMes(leitor.nextInt());
            
            System.out.println("Digite o número do mês do compromisso: ");
            mes.setNome(leitor.nextInt());
            
            System.out.println("Digite o ano do compromisso: ");
            
            ano.setAno(leitor.nextInt());
            leitor.close();
            break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
