package LogicaProgramacaoI;

import java.util.Scanner;

public class SomaElementos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho da matriz quadrada? ");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        int soma = 0;

        System.out.println("Digite os Elementos da matriz");
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

        System.out.println("\nElementos da Diagonal principal: ");
        for (int i = 0; i < tamanho; i++){
            System.out.println(matriz[i][i] + " ");
        }

        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("\nA soma dos elementos é: " + soma);

        scanner.close();;
    }
}
