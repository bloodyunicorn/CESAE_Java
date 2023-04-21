import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
class ex2 {
    public static void criarFicheiro(String x) throws FileNotFoundException {


        File ficheiro = new File("exercicio_02");
        Formatter criar = new Formatter(ficheiro);

        criar.format(x);

        criar.close();
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            String conteudo = input.nextLine();
            criarFicheiro(conteudo);
        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}