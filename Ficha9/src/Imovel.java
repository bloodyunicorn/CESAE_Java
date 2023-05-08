public class Imovel {
    private String rua;
    private int porta;
    private String cidade;
    private TipoImovel tipo;
    private AcabamentoImovel acabamento;
    private double area;
    private int quartos;
    private int wc;
    private double areaPiscina;

    public Imovel(String rua, int porta, String cidade, TipoImovel tipo, AcabamentoImovel acabamento, double area, int quartos, int wc, double piscina){
        this.rua = rua;
        this.porta = porta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.quartos = quartos;
        this.wc = wc;
        this.areaPiscina = piscina;
    }
    public double calcValor(){

        double valor = 0, m2, dif = 1;

        if (this.tipo.equals(TipoImovel.APARTAMENTO)){
            m2 = 1000;
        } else if (this.tipo.equals(TipoImovel.CASA)){
            m2 = 3000;
        } else {
            m2 = 5000;
        }

        if (this.acabamento.equals(AcabamentoImovel.RESTAURO)){
            dif = 0.5;
        } else if (this.acabamento.equals(AcabamentoImovel.USADA)){
            dif = 0.1;
        } else if (this.acabamento.equals(AcabamentoImovel.ALTOACABAMENTO)){
            dif = 2.5;
        }

        valor = (this.area*m2)+(this.quartos*7500)+(this.wc*10500)+(this.areaPiscina*1000);
        valor-= valor*dif;

        return valor;
    }

    public void setAcabamento(AcabamentoImovel novoAcabamento){

        this.acabamento = novoAcabamento;

    }
    public Imovel comparar(Imovel comp){

        if (this.calcValor() > comp.calcValor()){
            System.out.println("\nO imóvel 1 é mais caro");
            return this;
        } else if (this.calcValor() < comp.calcValor()){
            System.out.println("\nO imóvel 2 é mais caro");
            return comp;
        } else {
            System.out.println("\nTêm o mesmo valor.");
            return null;
        }
    }
    public void descricao(){
        System.out.println("\nTipo de imóvel: " + this.tipo +" T"+ this.quartos+ "\nÁrea: " + this.area + "m2\nTem " + this.wc+ "Wc's\nÁrea Piscina: " + this.areaPiscina + "m2\nLocalizado em " + this.rua + " " + this.porta + ", " + this.cidade);
    }
}
