package TecnicasProgramacao.aula1.exercicio;

import TecnicasProgramacao.aula1.exercicio.veiculos.*;
import TecnicasProgramacao.aula1.exercicio.serVivo.*;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Aviao aviao = new Aviao();
        Barco barco = new Barco();
        Pessoa pessoa = new Pessoa();
        Pato pato = new Pato();

        carro.mover();
        carro.aumentarVelocidade(20);

        moto.mover();
        moto.aumentarVelocidade(15);

        aviao.voar();
        aviao.aumentarVelocidade(200);

        barco.flutuar();
        pessoa.flutuar();
        pato.flutuar();

        pessoa.caminhar();
        pato.caminhar();
    }
}