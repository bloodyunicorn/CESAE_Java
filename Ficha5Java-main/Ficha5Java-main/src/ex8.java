import java.util.Scanner;
class ex8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] frase = new String[2];


        System.out.println("frase 1:");
        frase[0] = input.nextLine();

        System.out.println("frase 2:");
        frase[1] = input.nextLine();

        System.out.println(frase[0]);
        System.out.println(frase[1]);
        if (frase[0].equals(frase[1]) ){
            System.out.println("As frases são iguais.");
        } else {
            System.out.println("As frases não são iguais!");
        }
    }
}