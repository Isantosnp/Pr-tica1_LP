package AvaliacaoDiagnostica;

import java.util.Scanner;
public class Frase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contarVogais = 0;
        String frase = " A ligeira raposa marrom ataca o cão preguiçoso ";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;

        }
        System.out.println(" A quantidade de vogais existentes é :" + contarVogais);
        teclado.close();
    }
}
