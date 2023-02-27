package AvaliacaoDiagnostica;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Carro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoFabricacao;
        String placaCarro;
        System.out.println("Informe a placa do seu carro: ");
        placaCarro = teclado.nextLine();
        System.out.println("Informe o ano de fabricação do seu carro: ");
        anoFabricacao = teclado.nextInt();
        if( anoFabricacao < 2010){
            System.out.println("Carro velho.");
        } else if (anoFabricacao >= 2010 || anoFabricacao <= 2021) {
            System.out.println("Carro semi-novo.");
        } else if( anoFabricacao >= 2022) {
            System.out.println("Carro novo.");
        }
        Pattern pattern = Pattern.compile("[aeiou]",Pattern.CASE_INSENSITIVE);
        String resultado = pattern.matcher(placaCarro).replaceAll("*");

        System.out.println("Resultado : " +resultado);

    }
}
