import java.util.Scanner;
class ex13 {

    public static void print(int colunas, int linhas, char car) {

        for (int i = 0; i < colunas; i++) {
            System.out.print(car + "  ");
        }

        System.out.println();

        for (int i = 0; i < (linhas-2); i++) {

            System.out.print(car + "  ");

            for (int x = 0; x < (colunas - 2); x++) {
                System.out.print("   ");
            }

            System.out.print(car + "\n");
        }

        for (int i = 0; i < colunas; i++) {
            System.out.print(car + "  ");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduz um caracter: ");
        char car = input.next().charAt(0);

        System.out.println("Introduz o nr de linhas: ");
        int linhas = input.nextInt();

        System.out.println("Introduz o nr de colunas: ");
        int colunas = input.nextInt();

        print(colunas, linhas, car);
    }
}
