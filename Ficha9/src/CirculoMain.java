import java.util.Scanner;

public class CirculoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique o raio do circulo: ");
        int raio = sc.nextInt();

        Circulo azul = new Circulo(raio);

        System.out.println(azul.area());
        System.out.println(azul.circunferencia());

        azul.setRaio(10);

        System.out.println(azul.area());
        System.out.println(azul.circunferencia());

    }
}

