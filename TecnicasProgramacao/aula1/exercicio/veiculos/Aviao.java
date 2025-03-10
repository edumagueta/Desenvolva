package TecnicasProgramacao.aula1.exercicio.veiculos;

import TecnicasProgramacao.aula1.exercicio.interfaces.Voar;

public class Aviao extends Velocidade implements Voar {
    @Override
    public void voar() {
        System.out.println("Avião voando.");
    }
}
