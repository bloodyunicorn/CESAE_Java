public class Conta {
    private String numeroConta, titular;
    private double saldo;
    private int anoAbertura;
    private double margemEmprestimo;
    private double divida;

    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.anoAbertura = 2023;


    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMargemEmprestimo(){
        return this.saldo*0.9;
    }
    public void setMargemEmprestimo(double margemEmprestimo){
        this.margemEmprestimo = margemEmprestimo;
    }
    public double getDivida() {
        return divida;
    }
    public boolean transferencia (double valor, Conta contaDestino){

        // Verificar se a conta remetente tem saldo suficiente
        if(this.saldo>=valor){
            // Subtraio ao saldo da conta remetente
            this.saldo-=valor;
            // Incremento ao saldo da conta destino
            contaDestino.saldo+=valor;
            // Mensagem de sucesso
            System.out.println("Transferência Concluida");
            return true;
        }else{
            // Mensagem de erro
            System.out.println("Erro ao Transferir");
            return false;
        }
    }
    public boolean pedirEmprestimo(double valor){

        if (valor <= this.getMargemEmprestimo() && this.divida == 0){

            this.saldo+=valor;
            this.divida+=valor;
            return true;

        } else {

            System.out.println("Não é possível pedir um empréstimo");
            return false;
        }

    }
}