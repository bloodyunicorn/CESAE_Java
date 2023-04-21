import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ex4 {
    public static void printFicheiro(File x) throws FileNotFoundException {
        Scanner in = new Scanner(new File(x.toURI()));

        String linha = in.nextLine();

        while (in.hasNextLine()){
            linha = in.nextLine();

            System.out.println(linha);
        }
        in.close();

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            File ficheiro = new File("exercicio_04.csv");
            printFicheiro(ficheiro);
        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}