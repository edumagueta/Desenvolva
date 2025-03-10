package TecnicasProgramacao.aula1.exercicio.veiculos;

import TecnicasProgramacao.aula1.exercicio.interfaces.Flutuar;

public class Barco extends Velocidade implements Flutuar {
    @Override
    public void flutuar() {
        System.out.println("Barco flutuando na água.");
    }
}
