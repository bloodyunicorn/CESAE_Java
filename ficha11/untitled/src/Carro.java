public class Carro extends Veiculo{
    private Combustivel tipoCombustivel;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double litros100km, Combustivel tipoCombustivel){
        super(marca,modelo,anoFabrico, potencia, cilindrada, litros100km);
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcCusto(double litros){

        if (this.tipoCombustivel.equals(Combustivel.DIESEL)){
            return litros * 1.75;
        } else if (this.tipoCombustivel.equals(Combustivel.GASOLINA)){
            return litros * 1.95;
        } else{
            return litros * 0.95;
        }
    }



}
