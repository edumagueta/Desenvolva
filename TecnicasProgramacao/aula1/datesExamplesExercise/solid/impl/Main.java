package TecnicasProgramacao.aula1.datesExamplesExercise.solid.impl;

import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Moveable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Flyable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Floatable;
import TecnicasProgramacao.aula1.datesExamplesExercise.solid.behaviour.Walkable;

public class Main {

    public static void main(String[] args) {
//    Crie um sistema onde é possível criar um carro e uma motocicleta e coloca-lós em movimento
        var carro = new Car();
        move(carro);

        var motorcycle = new Motorcycle();
        move(motorcycle);

//    Ainda no mesmo sistema deve ser possível criar um avião e coloca-ló em voo.
        var airplane = new Airplane();
        fly(airplane);

//    Barco, pato e pessoa podem flutuar.
        var boat = new Boat();
        floatz(boat);

        var duck = new Duck();
        floatz(duck);

        var human = new Human();
        floatz(human);

//    Pessoa e pato podem caminhar e flutuar.
        var duck2 = new Duck();
        walkAndFloat(duck2);

        var human2 = new Human();
        walkAndFloat(human2);
    }

    public static void move(Moveable mover) {
        mover.move();
    }

    public static void fly(Flyable flyer) {
        flyer.fly();
    }

    public static void floatz(Floatable floater) {
        floater.floatz();
    }

    public static <T extends Walkable & Floatable> void walkAndFloat(T walkerAndFloater) {
        walkerAndFloater.walk();
        walkerAndFloater.floatz();
    }

}
