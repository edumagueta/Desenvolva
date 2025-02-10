package LogicaProgramacao;

import java.util.Scanner;

public class QuadradoMagico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho da matriz quadrada? ");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];

        System.out.println("Digite os Elementos da matriz: ");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++){
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz preenchida: ");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++){
                System.out.print(matriz[i][j]);
                if (j < tamanho - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        if (quadradoMagico(matriz, tamanho)){
            System.out.println("A matriz é um quadrado mágico");
        } else {
            System.out.println("A matriz não é um quadrado mágico");
        }
        scanner.close();
    }

    private static boolean quadradoMagico(int[][] matriz, int tamanho) {
        int somaMagica = 0;

        for (int j = 0; j < tamanho; j++){
            somaMagica += matriz[0][j];
        }

        for (int i = 1; i < tamanho; i++){
            int somaLinha = 0;
            for (int j = 0; j < tamanho; j++){
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaMagica){
                return false;
            }
        }

        for (int j = 0; j < tamanho; j++) {
            int somaColuna = 0;
            for (int i = 0; i < tamanho; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaMagica) {
                return false;
            }
        }

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        if (somaDiagonalPrincipal != somaMagica) {
            return false;
        }

        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalSecundaria += matriz[i][tamanho - 1 - i];
        }
        if (somaDiagonalSecundaria != somaMagica) {
            return false;
        }

        return true;
    }
}
