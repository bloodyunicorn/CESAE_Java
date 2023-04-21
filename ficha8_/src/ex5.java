import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ex5 {
    public static void sumFicheiro(File x) throws FileNotFoundException {
        Scanner in = new Scanner(new File(x.toURI()));

        int num, sum = 0;

        while (in.hasNextInt()){
            num = in.nextInt();
            sum += num;
        }
        System.out.println(sum);
        in.close();

    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try {
            File ficheiro = new File("exercicio_05_31.txt");
            sumFicheiro(ficheiro);
        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }

    }
}
