import java.util.Scanner;

class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] arr1 = new int[10], arr2 = new int[10];
        int i, x;


        System.out.println("Insira 10 : ");
        for (i=0; i<10; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.println("Insira mais 10 números: ");
        for (i=0; i<10; i++){
            arr2[i] = input.nextInt();
        }

        for (i=0; i<10; i++) {

            for (x=0; x<1; x++) {
                System.out.print(arr1[i] + " ");
                System.out.print(arr2[i]+"\n");
            }
        }

    }
}