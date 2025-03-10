package TecnicasProgramacao.aula1.exercicio.veiculos;

import TecnicasProgramacao.aula1.exercicio.interfaces.Mover;

public class Carro extends Velocidade implements Mover {
    @Override
    public void mover() {
        System.out.println("Carro se movendo.");
    }
}
