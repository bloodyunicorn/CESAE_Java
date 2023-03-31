import java.util.Scanner;
class ex2 {
    public static void detPos(int x){
        if (x < 0){
            System.out.println("o valor é negativo");
        } else {
            System.out.println("o valor é positivo");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.println("Introduza um valor: ");
        num1 = input.nextInt();

        detPos(num1);

    }
}