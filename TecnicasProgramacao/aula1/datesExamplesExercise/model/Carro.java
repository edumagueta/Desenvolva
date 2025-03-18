package TecnicasProgramacao.aula1.datesExamplesExercise.model;

public class Carro {

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
