import java.util.Scanner;

//Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro e positivo) e crie uma função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador.
class ex10 {
    public static void checkPos () {
        Scanner input = new Scanner(System.in);

        double i = 0;
        boolean valid = false;

        while (i < 0 && !valid) {

            System.out.println("Introduza um valor inteiro e positivo:");
            i = input.nextDouble();

            if (i == int(i)){
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    checkPos();

    }
}