package br.edu.up;

import br.edu.up.modelos.Livro;

public class Programa {
    public static void main(String[] args) throws Exception {

        Livro livro1 = new Livro();

        livro1.setCodigo("1598FHK");
        livro1.setTitulo("Core Java 2");
        livro1.setAutores("Cay S. Horstmann", "Gary Cornell");
        livro1.setIsbn("0130819336");
        livro1.setAno(2005);

        Livro livro2 = new Livro();
        
        livro2.setCodigo("9865PLO");
        livro2.setTitulo("Java, Como programar");
        livro2.setAutores("Harvey Deitel");
        livro2.setIsbn("0130341517");
        livro2.setAno(2015);

        System.out.println("--- Livro 1 ---");
        System.out.println("Código: " + livro1.getCodigo());
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autores: " + livro1.getAutores()[0] + " e " + livro1.getAutores()[1]);
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Ano: " + livro1.getAno() + "\n");

        System.out.println("--- Livro 2 ---");
        System.out.println("Código: " + livro2.getCodigo());
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autores: " + livro2.getAutores()[0]);
        System.out.println("ISBN: " + livro2.getIsbn());
        System.out.println("Ano: " + livro2.getAno());
        



    }
}
