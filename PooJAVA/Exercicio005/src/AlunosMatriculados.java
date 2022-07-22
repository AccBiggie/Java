public class AlunosMatriculados {
    int matricula;
    String nome="";
    int notaPrimeiraProva;
    int notaSegundaProva;
    int notaTrabalho;
    double mediaAluno;

    public void CalculaMedia(Integer notaPrimeiraProva, Integer notaSegundaProva, Integer notaTrabalho){
        this.mediaAluno = ((notaPrimeiraProva + notaSegundaProva)*2.5f + notaTrabalho*2)/7;
    }

    public void CalculaMediaFinal(){
        if(mediaAluno < 7){
        }else{
            System.out.println("Aluno abaixo da média" + mediaAluno);
        }
    }
}