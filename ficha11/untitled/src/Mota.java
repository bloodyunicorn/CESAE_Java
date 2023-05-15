import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Mota extends Veiculo{

    private File imagem = new File("mota.txt");;

    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double litros100km){
        super(marca, modelo,anoFabrico, potencia, cilindrada, litros100km);

    }

    public void printFile(){
        try {
            Scanner in = new Scanner(new File(imagem.toURI()));
            String linha;

            while (in.hasNextLine()){
                linha = in.nextLine();

                System.out.println(linha);
            }
            in.close();

        } catch (FileNotFoundException exc){

            System.out.print("Not found");
        }
     }
}


