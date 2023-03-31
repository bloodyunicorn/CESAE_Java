import java.util.Scanner;
class ex5 {
    public static void detPerf(int x) { //determina se é perfeito -1
        int sum = 0, i;

        if (x % 2 == 0) {

            for (i = 1; i < x; i++) {

                if (x % i == 0) {
                    sum += i;
                }

            }

            if (sum == x) {
                System.out.println("O seu valor é perfeito");

            } else {
                System.out.println("O seu valor não é perfeito ");
            }
        } else {
            System.out.println("Valores impares nunca são perfeitos");
        }
    }


    public static void detPrimo(int x) { //determina se é primo-2
        int div = 2;
        double i = 1;
        while (div <= 11 && i != 0) {

            if (x == div) {
                div++;
            }
            i = (x % div);
            div++;

        }
        if (i == 0) {
            System.out.println("O seu valor não é primo");

        } else {
            System.out.println("O seu valor é primo ");
        }
    }

    public static void detPos(int x) { //determina se é positivo -3
        if (x < 0) {
            System.out.println("o valor é negativo");
        } else {
            System.out.println("o valor é positivo");
        }
    }


    public static void detPar(int x) { //determina se é par-4
        if (x % 2 == 0) {
            System.out.println("o valor é par");
        } else {
            System.out.println("o valor é impar");
        }
    }

    public static void menu(int x, int op) {

        boolean valid;

        do {

            valid = true;

            switch (op) {
                case 1:
                    detPerf(x);
                    break;
                case 2:
                    detPrimo(x);
                    break;
                case 3:
                    detPos(x);
                    break;
                case 4:
                    detPar(x);
                    break;

                default:
                    valid = false;
                    System.out.println("Escolha uma opção válida");
            }
        } while (valid == false);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, opcao;

        System.out.println("Introduza um valor: ");
        num1 = input.nextInt();

        System.out.println("Escolha uma das seguintes opções:\n\n1 - Determinar se o número é Perfeito\n2 - Determinar se o número é Primo\n3 - Determinar se o número é Positivo\n4 - Determinar se o número é Par\n");
        opcao = input.nextInt();

        menu(num1,opcao);
    }
}