import java.math.BigInteger;

public class Livro {
    private String titulo, autor, categoria;
    private String isbn;
    private int pag;

    public Livro(String tit, String autor, String cat, String isbn, int pag){
        this.titulo = tit;
        this.autor = autor;
        this.categoria = cat;
        this.isbn = isbn;
        this.pag = pag;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Nr de páginas: " + pag);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }
}
