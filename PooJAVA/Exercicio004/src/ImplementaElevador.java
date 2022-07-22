import java.util.Scanner;

public class ImplementaElevador {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
        Elevador elevador = new Elevador();
        System.out.println("Digite a quantidade de andar e de pessoa:");
        int quantidadeAndares = entradaUsuario.nextInt();
        int quantidadePessoas = entradaUsuario.nextInt();
        
        elevador.Inicializa(quantidadeAndares, quantidadePessoas);
        elevador.Entra();
        elevador.Sai();
        elevador.Sobe();
        elevador.Desce();
        }
    }
}
