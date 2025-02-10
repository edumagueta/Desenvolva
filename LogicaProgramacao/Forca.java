package LogicaProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] palavras = {"JAVA", "PYTHON", "CODIGO", "PROGRAMA", "DESAFIO"};
        String palavraSecreta = palavras[random.nextInt(palavras.length)];
        char[] progresso = new char[palavraSecreta.length()];
        for (int i = 0; i < progresso.length; i++) {
            progresso[i] = '_';
        }

        List<Character> letrasTentadas = new ArrayList<>();
        int tentativasRestantes = 6;
        boolean venceu = false;

        System.out.println("Bem-vindo ao Jogo da Forca!");

        while (tentativasRestantes > 0 && !venceu) {
            System.out.print("\nPalavra: ");
            for (char c : progresso) {
                System.out.print(c + " ");
            }
            System.out.println("\nTentativas restantes: " + tentativasRestantes);

            System.out.print("Digite uma letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);

            if (letrasTentadas.contains(letra)) {
                System.out.println("Você já tentou essa letra. Tente outra.");
                continue;
            }

            letrasTentadas.add(letra);

            boolean acertou = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    progresso[i] = letra;
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("Boa! A letra " + letra + " está na palavra.");
            } else {
                System.out.println("Que pena! A letra " + letra + " não está na palavra.");
                tentativasRestantes--;
            }

            venceu = true;
            for (char c : progresso) {
                if (c == '_') {
                    venceu = false;
                    break;
                }
            }
        }

        if (venceu) {
            System.out.println("\nParabéns! Você adivinhou a palavra: " + palavraSecreta);
        } else {
            System.out.println("\nVocê perdeu! A palavra era: " + palavraSecreta);
        }

        scanner.close();
    }
}