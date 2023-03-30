import java.util.Scanner;

class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[][] matriz = new int[3][3];
        int i, x, maior = 0, menor=0;

        System.out.println("Insira 9 números: ");

        for (i=0; i<3; i++){

            for (x=0; x<3; x++) {
                matriz[i][x] = input.nextInt();
                 if (i==0 && x==0){
                     maior = matriz[i][x];
                     menor = matriz[i][x];
                 }else {

                     if (maior <= matriz[i][x]) {
                         maior = matriz[i][x];
                     }
                     if (matriz[i][x] <= menor) {
                         menor = matriz[i][x];
                     }
                 }
            }
        }

        for (i=0; i<3; i++) {
            System.out.print("\n");
            for (x=0; x<3; x++) {
                System.out.print(matriz[i][x] + " ");
            }
        }

        System.out.println("\nO valor maior é: " + maior);
        System.out.println("O valor menor é: " + menor);

    }
}