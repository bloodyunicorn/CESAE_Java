import java.util.Scanner;
class ex4 {
    public static void detPerf(int x){
        int sum = 0, i;

        if (x % 2 == 0) {

            for(i=1; i<x; i++){

                if(x%i == 0){
                    sum +=i;
                }

            }

            if (sum == x) {
                System.out.println("O seu valor é perfeito");

            } else {
                System.out.println("O seu valor não é perfeito ");
            }
        } else {
            System.out.println("Valores impares nunca são perfeitos");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.println("Introduza um valor: ");
        num1 = input.nextInt();
        detPerf(num1);

    }
}