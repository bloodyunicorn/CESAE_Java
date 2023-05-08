public class ImovelMain {
    public static void main(String[] args) {

        Imovel casa1 = new Imovel("Rua x", 42, "Ermesinde", TipoImovel.APARTAMENTO, AcabamentoImovel.USADA, 126.72, 2, 1, 0);
        Imovel casa2 = new Imovel("Rua j", 43, "Porto", TipoImovel.CASA, AcabamentoImovel.RESTAURO, 126.72, 4, 3, 12);

        System.out.println(casa1.calcValor());

        casa1.descricao();
        casa2.descricao();

        casa1.comparar(casa2);

        casa1.setAcabamento(AcabamentoImovel.RESTAURO);

        System.out.println(casa1.calcValor());
    }
}
