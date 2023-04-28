public class Cão {
    private String nome;
    private String raca;

    public Cão(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }
    public void ladrar(){
        System.out.println("wooof");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
