import java.util.Scanner;


public class MediaEscola {
    public static void main(String[] args) throws Exception {
        try(Scanner entradaUsuario = new Scanner(System.in)){
            AlunosMatriculados MediaAluno = new AlunosMatriculados();

            System.out.println("Insira os dados e as notas do Aluno:");
            int matricula = entradaUsuario.nextInt();
            String nome = entradaUsuario.nextLine();
            int notaPrimeiraProva = entradaUsuario.nextInt();
            int notaSegundaProva = entradaUsuario.nextInt();
            int notaTrabalho = entradaUsuario.nextInt();
            double mediaAluno = entradaUsuario.nextDouble();
            System.out.println("Matricula"+" "+ matricula);
            System.out.println("Nome:"+" "+nome);
            
            MediaAluno.CalculaMedia(notaPrimeiraProva, notaSegundaProva, notaTrabalho);
            MediaAluno.CalculaMediaFinal();
            System.out.println("A média do Aluno é:" +" "+ mediaAluno);
        }
    }
}
