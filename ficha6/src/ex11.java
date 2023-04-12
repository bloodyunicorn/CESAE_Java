import java.util.Scanner;

class ex11 {
    public static int[] vetor(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nQuantos valores quer introduzir? ");
        int x = input.nextInt();

        int [] vet = new int[x];

        System.out.println("\nIntroduza os " + x + " valores: ");
        for (int i = 0; i < x; ++i) {
            vet[i] = input.nextInt();
        }
        return vet;
    }
    public static void print(int x[]){

        for (int i = 0; i < x.length; ++i) {
            System.out.print(x[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        print(vetor());

    }
}