import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro Valor: ");
        int val1 = sc.nextInt();

        System.out.println("Segundo Valor: ");
        int val2 = sc.nextInt();

        System.out.println(Calculadora.soma(val1,val2));
        System.out.println(Calculadora.div(val1,val2));
        System.out.println(Calculadora.mult(val1,val2));
        System.out.println(Calculadora.sub(val1,val2));
    }
}
