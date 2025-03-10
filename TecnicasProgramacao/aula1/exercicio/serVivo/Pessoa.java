package TecnicasProgramacao.aula1.exercicio.serVivo;

import TecnicasProgramacao.aula1.exercicio.interfaces.Caminhar;
import TecnicasProgramacao.aula1.exercicio.interfaces.Flutuar;

public class Pessoa implements Caminhar, Flutuar {
    @Override
    public void caminhar() {
        System.out.println("Pessoa caminhando");
    }

    @Override
    public void flutuar() {
        System.out.println("Pessoa flutuando");
    }
}
