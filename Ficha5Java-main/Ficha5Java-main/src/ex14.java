import java.util.Scanner;

class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int i, x, sum=0;

        System.out.println("Insira 16 números: ");

        for (i=0; i<4; i++){

            for (x=0; x<4; x++) {
                matriz[i][x] = input.nextInt();
            }
        }

        for (i=0; i<4; i++) {
            System.out.print("\n");
            for (x=0; x<4; x++) {
                System.out.print(matriz[i][x] + " ");
            }
        }

        for (x=0; x<4; x++){
                sum += matriz[x][x];
            }

        System.out.println("\nO total da diagonal é: " + sum);
    }
}
