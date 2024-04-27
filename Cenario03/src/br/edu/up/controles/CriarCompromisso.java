package br.edu.up.controles;

import java.util.Scanner;

import br.edu.up.modelos.*;

public class CriarCompromisso {
    int opcao = 0;    

        public void criarCompromisso(){
            Compromisso compromisso = new Compromisso();
            Dia dia = new Dia();
            Mes mes = new Mes();
            Ano ano = new Ano();

            Scanner leitor = new Scanner(System.in);
            System.out.println("---Agendar Compromisso---");
            System.out.println("Digite seu nome: ");
            compromisso.setPessoa(leitor.nextLine());
            System.out.println("Digite o local do compromisso: ");
            compromisso.setLocal(leitor.nextLine());
            System.out.println("Digite o assunto do compromisso: ");
            compromisso.setAssunto(leitor.nextLine());
            System.out.println("Digite a hora do compromisso: ");
            compromisso.setHora(leitor.nextInt());

            System.out.println("Digite o dia do compromisso: ");
            dia.setDiaMes(leitor.nextInt());

            System.out.println("Digite o número do mês do compromisso: ");
            mes.setNome(leitor.nextInt());
            
            System.out.println("Digite o ano do compromisso: ");
            ano.setAno(leitor.nextInt());

            leitor.close();


        }
}
