import javax.swing.JOptionPane;
//import java.util.Scanner;
public class BombaCombustivel {
    public String tipoCombustivel = "Gasolina";
    public double valorLitroCombustivel = 5.34;
    public double quantidadeCombustivel = 900;
//Abastecer o carro por favor
    public void AbastecerPorValor(){
        double combustivelPorValor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para abastecimento "));
        double litros = combustivelPorValor / valorLitroCombustivel;
        JOptionPane.showMessageDialog(null, "Quantidade de" + " "+ tipoCombustivel + " "+  "abastecida: " + litros + " Litros");
        quantidadeCombustivel = quantidadeCombustivel - litros;
    }
//Abastecer o carro por litro    
    public void AbastecerPorLitro(){
        double combustivelPorLitro = Double.parseDouble((JOptionPane.showInputDialog("Quantidade em litros")));
        double litros = combustivelPorLitro * valorLitroCombustivel;
        JOptionPane.showMessageDialog(null, "Valor pago: " + litros);
        quantidadeCombustivel = quantidadeCombustivel - litros;
    }
//Alterar o valor do combustivel
    public void AlterarValorCombustivel(){
        double valorCombustivelAlterado = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor do combustivel: " + tipoCombustivel));
        JOptionPane.showMessageDialog(null, "Valor Alterado: "+" " + tipoCombustivel +": " + (valorLitroCombustivel = valorCombustivelAlterado) +" "+"Reais o Litro");
    }
//Alterar o tipo do combustivel    
    public void AlterarCombustivel(){
        String novoCombustivel = String.format(JOptionPane.showInputDialog(null, "Informe o novo combustivel: "));
        JOptionPane.showMessageDialog(null, "Combustivel Alterado:"+" " + (tipoCombustivel.replace(this.tipoCombustivel, novoCombustivel)));
    }
//Alterar a quantidade do tanque de combustivel com base no ultimo abastecimento    
    public void AlterarQuantidadeCombustivel(){
        double quantidadeAlterada = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros do ultimo abastecimento:"));
        quantidadeCombustivel = quantidadeCombustivel - quantidadeAlterada;
        JOptionPane.showMessageDialog(null, "Quantidade de combustivel: "+"  "+ quantidadeCombustivel);
    }
}
