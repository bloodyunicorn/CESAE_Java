import java.util.Scanner;
class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza 10 números: ");

        int[] vet = new int[10];
        int i;

        for(i=0; i<10; i++) {
            vet[i] = input.nextInt();
        }

        for (i=0; i<10; i++)
            System.out.print(vet[0] + " ");
    }
}