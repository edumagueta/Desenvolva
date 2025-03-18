package TecnicasProgramacao.aula1.datesExamplesExercise.solid.impl;

import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Moveable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Speed;

public class Car extends Automotive implements Moveable, Speed {

    private float speed = 0;

    public Car() {
        super(new Motor[]{
                new Motor("Gas motor one"),
                new Motor("Electric motor one")
        });
    }

    @Override
    public void move() {
        speed += 1;
        System.out.println("Carro se movendo a "+speed+" km/h");
    }

    @Override
    public void increase(float value) {
        speed += value;
        System.out.println("Carro aumentou a velocidade para "+speed+" km/h");
    }

    @Override
    public void decrease(float value) {
        speed -= value;
        System.out.println("Carro diminuiu a velocidade para "+speed+" km/h");
    }

}
