public class Animal {

    private String som = "desconhecido";

    public Animal(){

    }
    public void fazerBarulho(){
        System.out.println(som);
    }


    public void setSom(String som) {
        this.som = som;
    }
}
