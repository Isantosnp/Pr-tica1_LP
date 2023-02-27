package AvaliacaoDiagnostica;

import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempoGasto,  velocidade;
        double quilometragem;

        System.out.println("Informe o tempo gasto até chegar ao destino: ");
        tempoGasto = teclado.nextInt();
        System.out.println("Informe a quilometragem usada durante o percurso: ");
        quilometragem = teclado.nextDouble();
        System.out.println("Informe a velocidade usada durante o percuso: ");
        velocidade = teclado.nextInt();

        double distancia = velocidade * tempoGasto;
        double litrosUsados = distancia / quilometragem;

        System.out.println("Resultados: ");
        System.out.println("O consumo final de combustível gasto é de :" +litrosUsados);

        teclado.close();
    }
}