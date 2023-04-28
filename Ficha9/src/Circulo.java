public class Circulo {
    private int raio;

    public Circulo(int x){
        this.raio = x;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double area(){
        double area = 3.14*(raio*raio);
        return area;
    }
    public  double circunferencia(){
        double circ = 2*3.14*raio;
        return circ;
    }

}
