import java.util.Scanner;

class ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza 10 valores : ");

        int[] vet = new int[10];
        int sum=0, i;
        double media = 0;

        for( i = 0; i < 10; ++i) {
            vet[i] = input.nextInt();
            sum += vet[i];
        }
        media = sum/i;

        System.out.println("A média é: " + media);

    }
}

