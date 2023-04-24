import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ex6 {

    public static void printName(File x) throws FileNotFoundException {
        Scanner in = new Scanner(new File(x.toURI()));

        String linha;
        int maior = 0, i = 0, nome = 0;
        String[] div = new String[33];
        String[][] dados = new String[33][2];

        while (in.hasNextLine()){
            linha = in.nextLine();
            div = linha.split(",");    //separa nome da idade

            dados[i][0]=div[0];  //     guarda nome
            dados[i][1]=div[1];  //     guarda idade
            i++;
        }

        for(int line = 0; line< dados.length; line++){
            
            for (int col = 0; col<dados[0].length; col++){

                int idade = Integer.parseInt(dados[line][1]);   //converte idade p int
                if(idade>maior){
                    maior = idade;
                    nome = line;
                }
            }
        }

        System.out.println(dados[nome][0]);
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
