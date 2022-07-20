import javax.swing.JOptionPane;

public class Conta {
    public int numeroConta, numeroAgencia;
    public String nomeCorrentista = "André";
    public String NomeCorrentistaAlterado = "Braga";
    public double saldo = 0;

    public void alterarNome () {
        System.out.println("Nome Alterado:" + (nomeCorrentista.replace(this.nomeCorrentista, NomeCorrentistaAlterado)));
    }
    public void deposito () {
        double valor = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor para depósito: "));
        saldo = saldo + valor;
        JOptionPane.showMessageDialog(null, "Deposito Realizado: " + saldo);
    }
    public void sacar () {
        double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque: "));
        if(saldo >= saque){
            saldo = saldo - saque;
        }
        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso: " + saque);
    }
}
    


