public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double area(){
        double area = largura*altura;
        return area;
    }
    public int perimetro(){
        int perimetro = (largura+altura)*2;
        return perimetro;
    }
}
