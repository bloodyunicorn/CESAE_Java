import java.util.Scanner;
class ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza 10 valores : ");

        int[] val = new int[10];
        int i, prev = 0;
        boolean x=true;

        for( i = 0; i < 10; ++i) {

            val[i] = input.nextInt();

            if (val[i] < prev){
                x = false;
            }

            prev = val[i];
        }

        if (x == true){
            System.out.println("A sequência está em ordem crescente");
        } else {
            System.out.println("A sequência não está em ordem crescente");
        }

    }
}

