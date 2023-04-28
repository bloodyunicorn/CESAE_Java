public class CãoMain {
    public static void main(String[] args) {

        Cão zeus = new Cão("Zeus", "Pastor");
        zeus.ladrar();

        zeus.setRaca("Cruzado");

        System.out.println(zeus.getNome());
        System.out.println(zeus.getRaca());


    }
}
