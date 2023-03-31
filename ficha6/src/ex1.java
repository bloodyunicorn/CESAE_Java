import java.util.Scanner;
class ex1 {
    public static void detPar(int x){
        if (x % 2 ==0){
            System.out.println("o valor é par");
        } else {
            System.out.println("o valor é impar");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.println("Introduza um valor: ");
        num1 = input.nextInt();

        detPar(num1);

    }
}