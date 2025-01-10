package LogicaProgramacaoI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuEstoque {

    // Classe para representar um Produto
    static class Produto {
        String nome;
        int quantidade;
        double preco;

        public Produto(String nome, int quantidade, double preco) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.preco = preco;
        }

        public double calcularValorTotal() {
            return quantidade * preco;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Produto> estoque = new HashMap<>();
        boolean executar = true;

        while (executar) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar ou Atualizar Produto");
            System.out.println("2. Alterar Quantidade de um Produto");
            System.out.println("3. Calcular Valor Total do Estoque de um Produto");
            System.out.println("4. Listar Todos os Produtos");
            System.out.println("5. Encerrar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço por unidade: ");
                    double preco = scanner.nextDouble();
                    estoque.put(nome, new Produto(nome, quantidade, preco));
                    System.out.println("Produto atualizado com sucesso!");
                }
                case 2 -> {
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    Produto produto = estoque.get(nome);
                    if (produto != null) {
                        System.out.print("Digite a quantidade para adicionar (use valor negativo para remover): ");
                        int quantidade = scanner.nextInt();
                        produto.quantidade += quantidade;
                        if (produto.quantidade < 0) produto.quantidade = 0;
                        System.out.println("Quantidade atualizada. Nova quantidade: " + produto.quantidade);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                }
                case 3 -> {
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    Produto produto = estoque.get(nome);
                    if (produto != null) {
                        System.out.println("Valor total em estoque do produto " + nome + ": R$ " + produto.calcularValorTotal());
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                }
                case 4 -> {
                    System.out.println("\nProdutos no Estoque:");
                    for (Produto produto : estoque.values()) {
                        System.out.println("Nome: " + produto.nome + ", Quantidade: " + produto.quantidade + ", Preço: R$ " + produto.preco);
                    }
                }
                case 5 -> {
                    executar = false;
                    System.out.println("Encerrando o programa. Até logo!");
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}