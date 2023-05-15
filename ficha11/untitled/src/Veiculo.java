public class Veiculo {

    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private double litros100km;

    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double litros100km){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.litros100km = litros100km;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public int getPotencia() {
        return potencia;
    }

    public double getLitros100km() {
        return litros100km;
    }
    public double calcLitros (double dist) {

        double litros = dist*(this.litros100km/100);

        System.out.println("O Carro " + this.marca + " gastou " + litros + " litros");
        return litros;
    }
}
