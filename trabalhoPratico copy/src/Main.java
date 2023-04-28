import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;
class Main {
//isto seria a op1 sem o split
    //public static void printFicheiro(File x) throws FileNotFoundException {
    //    Scanner in = new Scanner(new File(x.toURI()));
    //
    //    String linha;
    //
    //    while (in.hasNextLine()){
    //        linha = in.nextLine();
    //
    //        System.out.println(linha);
    //    }
    //    in.close();
    //
    //}

    public static String[][] splitFicheiro(File x) throws FileNotFoundException{

        Scanner in = new Scanner(new File(x.toURI()));

        String[] div = new String[9];
        int i=0;
        String linha = in.nextLine();
        String[][] dados = new String[100][9];
        while (in.hasNextLine()) {

            linha = in.nextLine();
            div = linha.split(";");

            dados[i][0]=div[0];  //     guarda idVenda
            dados[i][1]=div[1];  //     guarda idCliente
            dados[i][2]=div[2];    // nomeCliente
            dados[i][3]=div[3]; // contacto
            dados[i][4]=div[4]; // email
            dados[i][5]=div[5]; // editora
            dados[i][6]=div[6]; // categoria
            dados[i][7]=div[7]; //jogo
            dados[i][8]=div[8]; //valor

            i++;

        }
        return dados;
    }
    public static void print(String[][] dados) { //Op1

        for (int i = 0; i < dados.length; i++) {
            System.out.print("\n");
            for (int x = 0; x < dados[0].length; x++) {
                System.out.print(dados[i][x] + " ; ");
            }
        }

    }

    public static double vendasFicheiro(String[][] x){ //op2

        int sum = 0;
        double num, total = 0;

            for (int j = 0; j < x.length; j++) {
                num = Double.parseDouble(x[j][8]);

                total += num;
                sum++;

            }

        System.out.println("Numero total de vendas: " + sum);
        System.out.println("Valor Total : " + total);

        return total;
    }

    public static void editora(String[][] x) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a editora que deseja consultar");
        String editora = input.next();

        String genero = "", jogo = "";
        String[] categorias = new String[10];
        String[] jogos = new String[30];

        int sum = 0;


        for (int i = 0; i < x.length; i++) {

            if (x[i][5].equals(editora)) {
                genero = x[i][6];
                jogo = x[i][7];
                boolean verCateg = false, verJogos = false;
                int k = 0;

                while (!verCateg) {

                    if (jogos[k] == null){
                        jogos[k] = jogo;

                        if (categorias[k] == null) {
                            categorias[k] = genero;
                            sum++;
                        } else if (categorias[k].equals(genero)) {
                            verCateg = true;

                        }
                    }


                     else {
                        k++;
                    }
                }
            }
        }
        System.out.println("Categorias: \n");
            for (int j = 0; j < sum; j++) {
                System.out.println(categorias[j]);

            }
    }
    public static void lucro(double x){ //op3

        double lucro = x * 0.1;
        System.out.println("O valor total de lucro é " + lucro + "€");

    }

    public static void jogoMaiorValor(String[][] x){ //op6
        double maior = 0;

        for (int j = 0; j < x[0].length; j++){
            double valor = Double.parseDouble(x[j][8]);
            if(valor>maior){
                maior = valor;
            }

        }
        System.out.println(maior);
    }
    public static void menu(File x) throws FileNotFoundException {
            Scanner in = new Scanner(new File(x.toURI()));
            Scanner input = new Scanner(System.in);
            int opcao=0;
            String[][] dados = splitFicheiro(x);
            do {
                System.out.println("\nPor favor, escolha a opção pretendida: \n");
                System.out.println("1 - Imprimir ficheiro\n2 - Quantidade e Total de vendas\n3 - Lucros\n4 - Ver dados de Cliente\n5 - Generos e Jogos da editora\n6 - Ver jogo mais caro\n7 - Sair");
                System.out.print("\n-> ");
                try {

                    opcao = input.nextInt();

                    switch (opcao){

                        case 1: print(dados);
                        break;

                        case 2: vendasFicheiro(dados);

                        break;

                        case 3: lucro(vendasFicheiro(dados));
                        break;

                        case 4:
                            break;

                        case 5: editora(dados);
                            break;

                        case 6: jogoMaiorValor(dados);
                            break;

                        default:
                            System.out.println("Opção inválida!");
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