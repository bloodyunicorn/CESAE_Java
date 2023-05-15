import java.util.ArrayList;

public class MainAnimais {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Cao cao = new Cao();
        Porco porco = new Porco();
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        ArrayList <Animal> animals = new ArrayList<Animal>();
        Farm quinta = new Farm(animals);

        quinta.addAnimal(vaca);
        quinta.addAnimal(cao);
        quinta.addAnimal(porco);
        quinta.addAnimal(galinha);
        quinta.addAnimal(gato);

        vaca.fazerBarulho();

        quinta.makeNoise();
    }
}
