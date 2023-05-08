import java.util.Scanner;
public class CarroMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Carro carro = new Carro("Ford", "Mustang", 1990, 400, 2000, Combustivel.GASOLINA, 16);

        carro.ligar();

        Carro carroAdv = new Carro("BMW", "serie 1", 2022, 180, 1800, Combustivel.DIESEL, 10);

        carroAdv.ligar();

        Carro carroTorneio = new Carro("Mercedes","A45",2023,420,2000,Combustivel.GASOLINA,20);

        carroTorneio.ligar();

        Carro vencedor = carro.corrida(carroAdv);

        vencedor = vencedor.corrida(carroTorneio);

        vencedor.calcLitros(100);

    }
}