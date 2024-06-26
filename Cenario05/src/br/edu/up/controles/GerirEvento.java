package br.edu.up.controles;
import br.edu.up.Prompt;
import br.edu.up.modelos.*;

public class GerirEvento {

    Evento evento = new Evento();
    Evento[] eventos = new Evento[10];
    int c = 0;
    public void incluirEvento(){
        
        
        evento.setNome(Prompt.lerLinha("Digite o nome do evento: "));

        evento.setData(Prompt.lerLinha("Digite a data do evento: "));

        evento.setLocal(Prompt.lerLinha("Digite o local do evento: "));

        evento.setLotacaoMaxima(Prompt.lerInteiro("Digite a lotação máxima do evento: "));

        evento.setIngressosVendidos(Prompt.lerInteiro("Digite os numero de ingressos vendidos do evento: "));

        evento.setPrecoIngresso(Prompt.lerDecimal("Digite o preço do ingresso: "));

        eventos[c] = evento;
        c++;
    }
    
    public void alterarEvento(){

        String nomeAlteracao = Prompt.lerLinha("Digite o nome do evento que deseja alterar: ");
        for (Evento eventoAlteracao : eventos) {
            if(eventoAlteracao.getNome().equalsIgnoreCase(nomeAlteracao)){
                int op = Prompt.lerInteiro("Digite qual informação do evento deseja alterar: \n(1) Nome\n(2) Data\n(3) Local\n(4) Lotação Máxima\n(5) Ingressos Vendidos\n(6) Preço do Ingresso");
                switch (op) {
                    case 1:
                        evento.setNome(Prompt.lerLinha("Digite o novo nome do evento: "));
                        System.out.println("Nome alterado!");
                        break;
                    case 2:
                        evento.setData(Prompt.lerLinha("Digite a nova data do evento: "));
                        System.out.println("Data alterada!");
                        break;
                    case 3:
                        System.out.println();
                        evento.setLocal(Prompt.lerLinha("Digite o novo local do evento: "));
                        System.out.println("Local alterado!");
                        break;
                    case 4:
                        evento.setLotacaoMaxima(Prompt.lerInteiro("Digite a nova lotação máxima do evento: "));
                        System.out.println("Lotação máxima alterada!");
                        break;
                    case 5:
                        evento.setIngressosVendidos(Prompt.lerInteiro("Digite o novo numero de ingressos do evento: "));
                        System.out.println("Número de ingressos alterado!");
                        break;
                    case 6:
                        evento.setPrecoIngresso(Prompt.lerDecimal("Digite o novo preco do ingresso do evento: "));
                        System.out.println("Preço de ingresso alterado!");
                        break;
                }
            }
        }
    }

    public void listarEventos(){
        System.out.println("---Eventos---");
        for (Evento evento1 : eventos) {
            System.out.println("Nome: " + evento1.getNome() + "\nData: " + evento1.getData() + "\nLocal: " + evento1.getLocal() + "\nLotação máxima: " + evento1.getLotacaoMaxima() + "\nIngressos vendidos: " + evento1.getIngressosVendidos() + "\nPreco do ingresso: R$" + evento1.getPrecoIngresso());
        }
    }

    public void excluirEvento(){     
        String nomeExclusao = Prompt.lerLinha("Digite o nome do evento que deseja excluir: ");
        for (int i = 0; i < eventos.length; i++) {
            Evento exclusaoEvento = eventos[i];
            if(exclusaoEvento.getNome().equalsIgnoreCase(nomeExclusao)){
            int op = Prompt.lerInteiro("Tem certeza que deseja excluir este evento?\n(1) Sim (2) Não");
                if (op == 1) {
                    eventos[i] = null;
                    System.out.println("Evento excluído com sucesso.");
                }
                else{
                    System.out.println("Evento não excluído.");
                    return;                    
                }
            }else{
                System.out.println("Evento não encontrado");
            }
        }
    }

    public Evento[] getEventos(){
        return eventos;
    }

}
