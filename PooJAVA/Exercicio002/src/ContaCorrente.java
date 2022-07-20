/*Crie uma classe para implementar uma Conta Corrente. A classe deve possuir os
seguintes atributos:
• número da conta;
• nome do correntista;
• saldo;
Os métodos são os seguintes:
• alterar Nome,
• depósito
• saque;
No construtor, saldo é opcional, com valor default zero e os demais atributos são
obrigatórios.  */
//import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) throws Exception {
      Conta contaCorrente2 = new Conta(); 

      contaCorrente2.alterarNome();
      contaCorrente2.deposito();
      contaCorrente2.sacar();
    }
  }

