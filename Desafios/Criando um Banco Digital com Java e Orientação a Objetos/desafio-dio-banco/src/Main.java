public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Altair");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.sacar(10);
        cc.transferir(50, cp);
        cc.extrato();
        cp.extrato();
    }
}
