package Questões;

import java.util.ArrayList; 
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a palavra de cinco letras: ");
        String palavra = scanner.nextLine();
        ArrayList<String> combinacao = new ArrayList<String>();

        // Gerar combinações de três letras
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j < palavra.length(); j++) {
                for (int k = j + 1; k < palavra.length(); k++) {
                    combinacao.add(palavra.charAt(i) + "" + palavra.charAt(j) + "" + palavra.charAt(k));
                }
            }
        }

        // Imprimir as palavras de três letras
        System.out.println("Palavras de três letras geradas a partir de '" + palavra + "':");
        for (String palavratres : combinacao) {
            System.out.print(palavratres + " ");
        }
    }
}
