import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;
class Main {
    public static void printFicheiro(File x) throws FileNotFoundException {
        Scanner in = new Scanner(new File(x.toURI()));

        String linha;

        while (in.hasNextLine()){
            linha = in.nextLine();

            System.out.println(linha);
        }
        in.close();

    }
    public static void vendasFicheiro(File x) throws FileNotFoundException {

        Scanner in = new Scanner(new File(x.toURI()));

        int sum = 0;
        double num, total = 0;

        while (in.hasNextLine()){
            num = in.nextDouble();
            total += num;
            sum++;

        }
        System.out.println(sum);
        System.out.println(total);
        in.close();

    }

    public static void menu(File x) throws FileNotFoundException {
            Scanner in = new Scanner(new File(x.toURI()));
            Scanner input = new Scanner(System.in);
            int opcao=0;

            do {
                System.out.println("\nPor favor, escolha a opção pretendida: \n");
                System.out.println("1 - Imprimir ficheiro\n2 - Quantidade e Total de vendas\n3 - Lucros\n4 - Ver dados de Cliente\n5 - Generos e Jogos da editora\n6 - Ver jogo mais caro\n7 - Sair");

                try {

                    opcao = input.nextInt();

                    switch (opcao){

                        case 1: printFicheiro(x);
                        break;

                        case 2:
                        break;

                        case 3:
                        break;

                        case 4:
                            break;

                        case 5:
                            break;

                        case 6:
                            break;
                    }

                } catch (InputMismatchException exc) {

                    System.out.println("Opção inválida!");
                    input.next();

                }

            } while (opcao != 7);

            in.close();


        }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            File ficheiro = new File("GameStart.csv");
            menu(ficheiro);

        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}