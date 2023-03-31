import java.util.Scanner;

class ex8 {

    /**
     *
     * @param x
     * @return
     */
    public static boolean crescente(int x[]) {

        int count=0;

        for (int i = 0; i < x.length; i++) {

            if (count <= x[i]){
                count = x[i];
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet = new int[10];
        boolean res;

        System.out.println("\nIntroduza 10 valores: ");

        for (int i = 0; i < 10; ++i) {
            vet[i] = input.nextInt();
        }

        if ( crescente(vet)){
            System.out.println("Introduziu por ordem crecente");
        } else {
            System.out.println("Não introduziu por ordem crescente");
        }

    }
}