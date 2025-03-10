package TecnicasProgramacao.aula1.exercicio.veiculos;

public abstract class Velocidade {
    protected int velocidade = 0;

    public void aumentarVelocidade(int incremento){
        velocidade += incremento;
        System.out.println(getClass().getSimpleName() + " aumentou para " + velocidade + "km/h");
    }
}