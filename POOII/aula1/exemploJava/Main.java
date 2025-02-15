package POOII.aula1.exemploJava;

import POOII.aula1.exemploAnimais.Animal;
import POOII.aula1.exemploAnimais.Pessoa;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List listaDeObjetos = new ArrayList();
        List listaDeObjetosDois = new LinkedList();
        listaDeObjetosDois.add(new Pessoa());
        listaDeObjetosDois.add(new Animal());
    }
}
