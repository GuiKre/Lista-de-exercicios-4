package br.edu.up.modelos;
import java.util.List;
import java.util.ArrayList;

public class Agenda {

    private List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato){
        contatos.add(contato);
    }

    public Contato getContato(int codigo){
        for(Contato contato : contatos){
            if(contato.getCodigo() == codigo){
                return contato;
            }
        }
        return null;
    }

    public void excluirContato(int codigo){
        Contato contato = getContato(codigo);
        if(contato != null){
            contatos.remove(contato);
        }
    }

    public String listarContatos(){
        StringBuilder sb = new StringBuilder();
        for(Contato contato : contatos){
            sb.append(contato.toString()).append("\n");
        }
        return sb.toString();
    }
}
