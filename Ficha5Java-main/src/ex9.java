import java.util.Scanner;

class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int i, x;

        System.out.println("Insira 9 números: ");

        for (i=0; i<3; i++){
            for (x=0; x<3; x++) {
                matriz[i][x] = input.nextInt();
            }
        }
        for (i=0; i<3; i++) {
            System.out.print("\n");
            for (x=0; x<3; x++) {
                System.out.print(matriz[i][x] + " ");
            }
        }
    }
}
