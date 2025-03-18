package TecnicasProgramacao.aula1.datesExamplesExercise.solid.impl;

import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Floatable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Moveable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Speed;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Walkable;

public class Human implements Floatable, Moveable, Speed, Walkable {

    @Override
    public void floatz() {
        System.out.println("Humando flutuando");
    }

    @Override
    public void move() {
        System.out.println("Humando em movimento");
    }

    @Override
    public void increase(float value) {
        System.out.println("Humando aumentou a velocidade");
    }

    @Override
    public void decrease(float value) {
        System.out.println("Humando diminuiu a velocidade");
    }

    @Override
    public void walk() {
        System.out.println("Humando esta caminhando");
    }

}
