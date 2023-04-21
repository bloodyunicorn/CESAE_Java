import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ex6 {

    public static void printName(File x) throws FileNotFoundException {
        Scanner in = new Scanner(new File(x.toURI()));

        String nome, nomeMaior = "", linha;
        int idade, maior = 0, y = 0;
        String[] div = new String[33];

        while (in.hasNextLine()){
            linha = in.nextLine();
            div = linha.split(",");
        }
        String[][] dados = new String[(div.length/2)][2];
            for(int i = 0; i < div.length; i++){

                for (y = 0; y< 2; y++){
                    dados[i][y] = div[i];
                }

                 if(dados[i][y] >= maior){
                     maior = dados[i][y];
                     nomeMaior = dados[i][y];
                 }
            }


        System.out.println(nomeMaior);
        in.close();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            File ficheiro = new File("exercicio_06.txt");
            printName(ficheiro);

        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}
