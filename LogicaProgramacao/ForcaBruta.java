package LogicaProgramacao;

import java.util.Scanner;

public class ForcaBruta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha de 4 dígitos númericos: ");
        int senha = scanner.nextInt();

        if (senha < 0000 || senha > 9999) {
            System.out.println("Senha inválida. Digite novamente 4 dígitos numéricos.");
            return;
        }

        long inicio = System.currentTimeMillis();
        int tentativas = 0;
        int senhaQuebrada = -1;

        for (int i = 0; i <= 9999; i++){
            tentativas++;
            if (i == senha){
                senhaQuebrada = i;
                break;
            }
        }

        long fim = System.currentTimeMillis();

        System.out.println("Senha encontrada: " + senhaQuebrada);
        System.out.println("Número de tentativas: " + tentativas);
        System.out.println("Tempo total gasto: " + (fim - inicio) + " ms");

        scanner.close();
    }
}