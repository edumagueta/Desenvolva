package POOII.aula1e2.exemploControleRemoto;

public interface ControleRemoto {

    void ligar();
    void desligar();
    String trocarCanal(String numeroCanal);
    String aumentarVolume();
    String abaixarVolume();
    String mute();

}
