import java.util.Scanner;

class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza 10 valores : ");

        int[] vet = new int[10];
        int maior = 0, i;

        for(i = 0; i < 10; ++i) {
            vet[i] = input.nextInt();
            if (maior <= vet[i]) {
                maior = vet[i];
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}
