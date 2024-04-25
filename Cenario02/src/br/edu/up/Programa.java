package br.edu.up;
import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2.0, 5.0);

        System.out.println("---Ponto 01---");
        System.out.println("Coordenada x: " + ponto1.getX());
        System.out.println("Coordenada y: " + ponto1.getY());
        System.out.println("\n");
        System.out.println("---Ponto 02---");
        System.out.println("Coordenada x: " + ponto2.getX());
        System.out.println("Coordenada y: " + ponto2.getY());
        System.out.println("\n");

        System.out.println("Distância entre o ponto 1 e ponto 2: " + ponto1.calcularDistancia(ponto2));

        System.out.println("Distância entre o ponto 2 e as coordenadas (7,2): " + ponto2.calcularDistanciaP(7.0, 2.0));

        ponto1.setX(10.0);
        ponto1.setY(3.0);

        System.out.println("\n");
        System.out.println("---Ponto 01 após alterações---");
        System.out.println("Coordenada x: " + ponto1.getX());
        System.out.println("Coordenada y: " + ponto1.getY());
    }
}
