package LogicaProgramacao;

import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho da matriz quadrada? ");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        int[][] transposta = new int[tamanho][tamanho];

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

        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz Transposta: ");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++){
                System.out.print(transposta[i][j]);
                if (j < tamanho - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        scanner.close();;
    }
}
