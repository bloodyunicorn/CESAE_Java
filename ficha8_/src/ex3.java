import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
class ex3 {

    public static void lerFicheiro(File x1, File x2) throws FileNotFoundException {
        Scanner in = new Scanner(new File(x1.toURI()));

        String linha;
        Formatter criar = new Formatter(x2);

        while (in.hasNextLine()){

            linha = in.nextLine();
            criar.format(linha);

        }
        criar.close();
        in.close();
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            File ficheiro = new File("exercicio_03.txt");
            File ficheiro2 = new File("exercicio_03_2.txt");
            lerFicheiro(ficheiro, ficheiro2);
        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}