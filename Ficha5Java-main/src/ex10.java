import java.util.Scanner;

class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int i, sum = 0, x, temp=0;

        System.out.println("Insira 25 números: ");

        for (i=0; i<5; i++){
            for (x=0; x<5; x++) {
                matriz[i][x] = input.nextInt();
                sum += matriz[i][x];
            }
        }

        System.out.println("A soma de todos os números é: " + sum);
    }
}