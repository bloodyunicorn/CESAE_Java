import java.util.Scanner;
public class RetanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique a altura do retangulo: ");
        int altura = sc.nextInt();

        System.out.println("Indique a largura do retangulo: ");
        int largura = sc.nextInt();

        Retangulo rosa = new Retangulo(largura, altura);

        System.out.println(rosa.area());
        System.out.println(rosa.perimetro());
    }
}
