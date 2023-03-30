import java.util.Scanner;

class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][5];
        int i, x, val, cont = 0;

        System.out.println("Introduza 9 valores");

        for (i=0; i<4; i++){
            for (x=0; x<5; x++) {
                matriz[i][x] = input.nextInt();
            }
        }

        System.out.println("Que valor quer verificar?");
        val = input.nextInt();

        for (i=0; i<4; i++){
            for (x=0; x<5; x++) {
                if(matriz[i][x] == val){
                    cont++;
                }
            }
        }
        System.out.println("O valor " + val + " está presente " + cont + " vezes.");

    }
}