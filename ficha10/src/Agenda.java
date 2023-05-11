import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Agenda(){

    }

    public void addPessoa(Pessoa x){
        pessoas.add(x);
    }

    public void printAgenda(){

        for (Pessoa i: pessoas){

            System.out.println(i.getName());
            System.out.println(i.getAge());
            System.out.println(i.getEmail());
            System.out.println(i.getPhone());
            System.out.println();
        }


    }
}
