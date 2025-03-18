package TecnicasProgramacao.aula1.datesExamplesExercise.solid.impl;

import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Floatable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Flyable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Moveable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Speed;

public class Airplane extends Automotive implements Moveable, Flyable, Floatable, Speed {

    public Airplane() {
        super(new Motor[]{
                new Motor("Rolls royce ONE"),
                new Motor("Rolls royce ONE")
        });
    }

    @Override
    public void floatz() {
        System.out.println("Aviao flutuando");
    }

    @Override
    public void fly() {
        System.out.println("Aviao voando");
    }

    @Override
    public void move() {
        System.out.println("Aviao em movimento");
    }

    @Override
    public void increase(float value) {
        System.out.println("Aviao aumentou a velocidade");
    }

    @Override
    public void decrease(float value) {
        System.out.println("Aviao diminuiu a velocidade");
    }

}

