public class AlunosMain {
    public static void main(String[] args) {
        Alunos luis = new Alunos("Luís", 34, "Bioquimica", 17);
        Alunos liane = new Alunos("Liane", 32, "Design", 8);
        Alunos joana = new Alunos("Joana", 28, "Software", 9.5);
        Alunos tomas = new Alunos("Tomás", 5, "Matemática", 20);


        joana.Resultado();
        luis.Resultado();
        liane.Resultado();
        tomas.Resultado();


    }
}
