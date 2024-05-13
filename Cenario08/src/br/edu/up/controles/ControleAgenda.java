package br.edu.up.controles;
import br.edu.up.telas.*;
import br.edu.up.modelos.*;

public class ControleAgenda {

    private Agenda agenda;
    private MenuAgenda menu;

    public ControleAgenda(Agenda agenda, MenuAgenda menu){
        this.agenda = agenda;
        this.menu = menu;
    }

    public void iniciar(){
        int opcao;

        do{
            opcao = menu.exibirMenuAgenda();
            switch (opcao) {
                case 1:
                    adicionarContatoPessoal();
                    break;
                case 2:
                    adicionarContatoComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    menu.mostrarMensagem("Saindo do programa...");
                    break;    
                default:
                    menu.mostrarMensagem("Opção inválida.");
                    break;
            }
        } while (opcao != 6);
    }

    private void adicionarContatoPessoal(){
        int codigo = menu.obterCodigo();
        String nome = menu.obterNome();
        String telefone = menu.obterTelefone();
        String aniversario = menu.obterAniversario();
        Pessoal contato = new Pessoal(codigo, nome, telefone, aniversario);
        agenda.adicionar(contato);
        menu.mostrarMensagem("Contato pessoal adicionado com sucesso!");
    }

    private void adicionarContatoComercial(){
        int codigo = menu.obterCodigo();
        String nome = menu.obterNome();
        String telefone = menu.obterTelefone();
        String cnpj = menu.obterCnpj();
        Comercial contato = new Comercial(codigo, nome, telefone, cnpj);
        agenda.adicionar(contato);
        menu.mostrarMensagem("Contato comercial adicionado com sucesso!");
    }

    private void excluirContato(){
        int codigo = menu.obterCodigo();
        agenda.excluirContato(codigo);
        menu.mostrarMensagem("Contato excluído com sucesso!");
    }

    private void consultarContato(){
        int codigo = menu.obterCodigo();
        Contato contato = agenda.getContato(codigo);
        if(contato != null) {
            menu.mostrarMensagem(contato.toString());
        } else {
            menu.mostrarMensagem("Contato não encontrado.");
        }
    }

    private void listarContatos(){
        menu.mostrarMensagem(agenda.listarContatos());
    }
}