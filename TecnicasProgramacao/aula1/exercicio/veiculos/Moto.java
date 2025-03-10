package TecnicasProgramacao.aula1.exercicio.veiculos;

import TecnicasProgramacao.aula1.exercicio.interfaces.Mover;

public class Moto extends Velocidade implements Mover {
    @Override
    public void mover() {
        System.out.println("Moto se movendo.");
    }
}