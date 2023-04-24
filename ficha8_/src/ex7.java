import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ex7 {
    public static void printFicheiro(File x) throws FileNotFoundException {
        Scanner in = new Scanner(new File(x.toURI()));
        Scanner inPal = new Scanner(new File(x.toURI()));

        int sum=0, sum2=0;
        while (in.hasNextLine()){
            in.nextLine();
            sum++;
        }
        while (inPal.hasNext()){
            inPal.next();
            sum2++;
        }

        System.out.println("Linhas: "+ sum+"\nPalavras: "+sum2);
        in.close();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            File ficheiro = new File("exercicio_07.txt");
            printFicheiro(ficheiro);
        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}
