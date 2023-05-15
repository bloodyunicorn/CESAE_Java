import java.util.ArrayList;

public class Farm {

    private ArrayList<Animal> animais;

    public Farm(ArrayList animais){

        this.animais=animais;
    }

    public void addAnimal(Animal animal){
        animais.add(animal);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void makeNoise(){
        for (Animal i: animais){
            Animal ani = (Animal) i ;
            ani.fazerBarulho();
        }
    }
}
