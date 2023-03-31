import java.util.Scanner;
class ex3 {
    public static void detPrimo(int x){
        int div = 2;
        double i = 1;
        while (div <= 11 && i != 0){

            if( x == div){
                div++;
            }
            i = (x % div);
            div++;

        }
        if(i == 0){
            System.out.println("O seu valor não é primo");

        }else {
            System.out.println("O seu valor é primo ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        System.out.println("Introduza um valor: ");
        num1 = input.nextInt();
        detPrimo(num1);

    }
}