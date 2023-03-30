import java.util.Scanner;
class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza o preço dos produtos : ");

        double[] vet = new double[10];
        double total = 0;
        int i;

        for(i=0; i<10; i++) {
            System.out.print("Produto " + (i+1) + ": ");
            vet[i] = input.nextDouble();
            total += vet[i];
        }

        System.out.print("Total = " + total + "€");


    }
}