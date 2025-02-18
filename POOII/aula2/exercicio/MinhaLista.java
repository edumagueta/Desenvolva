package POOII.aula2.exercicio;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

public class MinhaLista<T>{
    private String nome;
    private LocalDate dataLimite;
    private List<T> elementos;

    public MinhaLista(String nome, LocalDate dataLimite){
        this.nome = nome;
        this.dataLimite = dataLimite;
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento (T elemento){
        elementos.add(elemento);
    }

    public boolean removerElemento (T elemento){
        return elementos.remove(elemento);
    }

    public boolean buscarElemento (T elemento){
        return elementos.contains(elemento);
    }

    public int tamanho(){
        return elementos.size();
    }

    public void limpar(){
        elementos.clear();
    }

    public void exibirLista(){
        System.out.println("Lista: " + nome);
        System.out.println("Data limite: " + dataLimite);
        System.out.println("Elementos: " + elementos);
    }

    public boolean estaExpirada(){
        return LocalDate.now().isAfter(dataLimite);
    }

    public void renomear(String novoNome){
        this.nome = novoNome;
    }

    public void estenderDataLimite(int dias){
        this.dataLimite = this.dataLimite.plusDays(dias);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public List<T> getElementos() {
        return elementos;
    }

    public void setElementos(List<T> elementos) {
        this.elementos = elementos;
    }
}
