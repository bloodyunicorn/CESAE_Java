public class LivroMain {
    public static void main(String[] args) {
        Livro gatoPreto = new Livro("O Gato Preto e 0utros Contos", "Edgar Allan Poe", "Horror/Ficção",
                "9789720033093", 176);
        Livro contosHP = new Livro("Os Contos Mais Arrepiantes de Howard Phillips Lovecraft","H. P. Lovecraft",
                "Horror/Ficção", "9789897731228", 544);

        gatoPreto.exibirDetalhes();

        contosHP.exibirDetalhes();
    }
}
