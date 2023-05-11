public class ex5 {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Pessoa iris = new Pessoa("Iris", 30, "irsiris@sapo.pt", 934902022);
        Pessoa roland = new Pessoa("Roland", 25, "rororo@mail.pt", 928273793);
        Pessoa joana = new Pessoa("Joana", 28, "jojojo@msn.com", 988766363);

        agenda.addPessoa(roland);
        agenda.addPessoa(iris);
        agenda.addPessoa(joana);

        agenda.printAgenda();
    }
}
