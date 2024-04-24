package br.edu.up;

import br.edu.up.modelos.Livro;

public class Programa {
    public static void main(String[] args) throws Exception {

        Livro livro1 = new Livro();

        livro1.setCodigo("1598FHK");
        livro1.setTitulo("Core Java 2");
        String[] autores1 = {"Cay S. Horstmann", "Gary Cornell"};
        livro1.setAutores(autores1);
        livro1.setIsbn("0130819336");
        livro1.setAno(2005);

        Livro livro2 = new Livro();

        livro2.setCodigo("9865PLO");
        livro2.setTitulo("Java, Como programar");
        String[] autores2 = {"Harvey Deitel"};
        livro2.setAutores(autores2);
        livro2.setIsbn("0130341517");
        livro2.setAno(2015);

        System.out.println("--- Livro 1 ---");
        System.out.println(livro1.getCodigo());
        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getAutores());
        System.out.println(livro1.getIsbn());
        System.out.println(livro1.getAno());

        System.out.println("--- Livro 2 ---");
        System.out.println(livro2.getCodigo());
        System.out.println(livro2.getTitulo());
        System.out.println(livro2.getAutores());
        System.out.println(livro2.getIsbn());
        System.out.println(livro2.getAno());
        



    }
}
