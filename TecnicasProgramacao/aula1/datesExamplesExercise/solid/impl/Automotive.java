package TecnicasProgramacao.aula1.datesExamplesExercise.solid.impl;

public abstract class Automotive {

    protected Motor[] motors;
    protected float speed;

    public Automotive(Motor[] motors) {
        this.motors = motors;
        this.speed = 0;
    }

    public void increase(float value) {
        this.speed += value;
    }

    public void decrease(float value) {
        this.speed -= value;
    }

}
