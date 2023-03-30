import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza 10 valores : ");

        int[] vet = new int[10];

        int menor = 0, i;

        for( i = 0; i < 10; ++i) {
            vet[i] = input.nextInt();
            if (menor >= vet[i]) {
                menor = vet[i];
            }
        }

        System.out.println("O menor número é: " + menor);
    }
}

