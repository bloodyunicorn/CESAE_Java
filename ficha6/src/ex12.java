import java.util.Scanner;
class ex12 {
    public static void palin(String x) {

        String frase2 = "";
        char car;

        for (int i=0; i< x.length(); i++) {
            car= x.charAt(i);
            frase2= car+frase2;
        }
        System.out.println(frase2);
        if (frase2.equals(x)){
            System.out.println("A frase/palavra é um palíndromo");
        }else {
            System.out.println("A frase/palavra não é um palíndromo");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String frase;

        System.out.println("Escreva algo: ");
        frase = input.nextLine();

        palin(frase);

    }
}