import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
class ex8 {
    public static void printFicheiro(File x) throws FileNotFoundException {
        Scanner in = new Scanner(new File(x.toURI()));

        String linha;
        String[] palavras;
        boolean print;

        int sum=0;
        while (in.hasNextLine()){
            linha = in.nextLine();
            palavras = linha.split(" ");
            print= false;
            for (int i = 0; i < palavras.length; i++ ){
                if(palavras[i].equals("programação")) {
                    print = true;
                }
            }
            if(print == true) {
                System.out.println(linha);
            }

        }

        in.close();

    }
    public static void criarFicheiro(String x) throws FileNotFoundException {


        File ficheiro = new File("exercicio_08_2");
        Formatter criar = new Formatter(ficheiro);

        criar.format(x);

        criar.close();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            File ficheiro = new File("exercicio_08.txt");
            printFicheiro(ficheiro);
        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}
