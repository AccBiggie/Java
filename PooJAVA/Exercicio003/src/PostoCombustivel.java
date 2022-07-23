/*Crie uma classe para representar uma BombaCombustivel. A classe
BombaCombustivel deve conter os seguintes atributos: tipo de combustível, valor por
litro e quantidade de combustível. Além desses atributos a classes deve conter os
seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser
abastecido e mostra a quantidade de litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros
de combustível e mostra o valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível
restante na bomba.
Crie uma classe que contenha um método main para testar sua classe
BombaCombustível */

public class PostoCombustivel {
    public static void main(String[] args) throws Exception {
       BombaCombustivel PostoDeGasolina = new BombaCombustivel();

       PostoDeGasolina.AbastecerPorValor();
       PostoDeGasolina.AbastecerPorLitro();
       PostoDeGasolina.AlterarQuantidadeCombustivel();
       PostoDeGasolina.AlterarValorCombustivel();
       PostoDeGasolina.AlterarCombustivel();

       System.out.println("Posto teste" + " "+ "Volte Sempre");
    }
}
