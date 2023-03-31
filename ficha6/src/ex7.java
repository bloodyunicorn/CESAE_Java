import java.util.Scanner;
class ex7 {


    public static int detMenor(int x[]) {

        int menor = x[0];

        for (int i = 0; i < x.length ; ++i) {

            if (menor >= x[i]) {
                menor = x[i];
            }
        }

        return menor;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet = new int[10];
        int menor;

        System.out.println("\nIntroduza 10 valores: ");

        for (int i = 0; i < 10; ++i) {
            vet[i] = input.nextInt();
        }
        menor = detMenor(vet);

        System.out.println("o menor é: " + menor);


    }
}