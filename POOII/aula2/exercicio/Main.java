package POOII.aula2.exercicio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MinhaLista<String> listaTarefas = new MinhaLista<>("Tarefas", LocalDate.of(2025, 2, 17));
        listaTarefas.adicionarElemento("Exercicios POO II");
        listaTarefas.adicionarElemento("Corrigir");

        listaTarefas.exibirLista();

        listaTarefas.removerElemento("Exercicios POO II");

        listaTarefas.exibirLista();

        System.out.println("A lista expirou? " + listaTarefas.estaExpirada());

        listaTarefas.renomear("Atividades");

        listaTarefas.estenderDataLimite(2);

        listaTarefas.exibirLista();
    }
}
