public class Alunos {
    private String nome, curso;
    private int idade;
    private double media;

    public Alunos(String nome, int idade, String curso, double media){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public void Resultado() {

        if (this.media >= 9.5){
            System.out.println(this.nome + ": Aprovado");
        } else {
            System.out.println(this.nome + ": Reprovado");
        }
    }
}
