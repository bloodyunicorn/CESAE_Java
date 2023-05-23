public class Camiao extends Veiculo{

    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double litros100km, double capacidadeCarga){
        super(marca,modelo,anoFabrico,potencia,cilindrada,litros100km);
        this.capacidadeCarga = capacidadeCarga;
    }


}
