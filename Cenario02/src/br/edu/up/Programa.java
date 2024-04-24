package br.edu.up;
import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2.0, 5.0);

        //Double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre o ponto 1 e ponto 2: " + ponto1.calcularDistancia(ponto2));

        //Double distanciaPonto2Cord72 = ponto2.calcularDistanciaP(7.0, 2.0);
        System.out.println("Distância entre o ponto 2 e as coordenadas (7,2): " + ponto2.calcularDistanciaP(7.0, 2.0));

        ponto1.setX(10.0);
        ponto1.setY(3.0);
    }
}
