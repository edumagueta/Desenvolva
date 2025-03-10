package TecnicasProgramacao.aula1.exercicio.serVivo;

import TecnicasProgramacao.aula1.exercicio.interfaces.Caminhar;
import TecnicasProgramacao.aula1.exercicio.interfaces.Flutuar;
import TecnicasProgramacao.aula1.exercicio.interfaces.Voar;

public class Pato implements Caminhar, Flutuar, Voar {

    @Override
    public void caminhar() {
        System.out.println("Pato se movendo");
    }

    @Override
    public void flutuar() {
        System.out.println("Pato flutuando na água");
    }

    @Override
    public void voar() {
        System.out.println("Pato voando");
    }
}