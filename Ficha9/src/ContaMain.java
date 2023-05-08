public class ContaMain {

        public static void main(String[] args){

            // Instanciar Contas
            Conta conta1 = new Conta("111222", "Cristiano Ronaldo", 120);
            Conta conta2 = new Conta("222333", "Conor Mcgregor", 400);

            conta1.transferencia(130,conta2);
            conta2.transferencia(200, conta1);

            System.out.println("Saldo da Conta "+conta1.getNumeroConta()+": "+conta1.getSaldo());
            System.out.println("Saldo da Conta "+conta2.getNumeroConta()+": "+conta2.getSaldo());

            System.out.println("margem"+conta1.getMargemEmprestimo());
            conta1.pedirEmprestimo(100);

            System.out.println("salso"+conta1.getSaldo());
            System.out.println("divida"+conta1.getDivida());
            System.out.println("margem"+conta1.getMargemEmprestimo());
        }
}
