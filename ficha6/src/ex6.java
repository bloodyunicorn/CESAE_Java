import java.util.Scanner;
class ex6 {
    public static int detMaior(int x[]) {

        int maior = 0;

        for (int i = 0; i < x.length ; ++i) {

            if (maior <= x[i]) {
                maior = x[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet = new int[10];
        int maior;

        System.out.println("\nIntroduza 10 valores: ");
        for (int i = 0; i < 10; ++i) {
            vet[i] = input.nextInt();
        }

        maior = detMaior(vet);

        System.out.println("\nO maior é: " + maior);

    }
}