import java.util.ArrayList;
public class Animal {
    private String nome;
    private String especie;
    private String pais;
    private double peso;
    private ArrayList<String> alimentos;

    public Animal(String nome, String especie, String pais, double peso, ArrayList alimentos){
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.peso = peso;
        this.alimentos = alimentos;
    }

    public double getPeso(){
        return this.peso;
    }

    public boolean alimentar(String alimento, double peso){

        for (String i: this.alimentos) {

            if (alimento.equals(i)){
                System.out.println("O " + this.nome + " comeu");
                this.peso+=peso;
                return true;
            }

        }
        System.out.println("O " + this.nome + " rejeitou a comida");
        return false;
    }

}
