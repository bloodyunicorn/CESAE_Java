import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> alimento = new ArrayList<String>();
        alimento.add("frango");
        alimento.add("vaca");
        alimento.add("porco");
        alimento.add("mirtilos");
        alimento.add("maçã");
        alimento.add("biscoito");

        Animal zeus = new Animal("Zeus", "cão", "Alemanha", 25.5, alimento);

        zeus.alimentar("frango", 0.200);
        System.out.println(zeus.getPeso());

        zeus.alimentar("banana", 0.200);
        System.out.println(zeus.getPeso());

        zeus.alimentar("biscoito", 0.200);
        System.out.println(zeus.getPeso());
    }
}
