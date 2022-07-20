public class Pessoa {
    private String nome = "André Ferreira";
    private int dataNascimento = 1998;
    private float altura = 1.68f;
    private int dataAtual =  2022;

    public void usuario () {
        System.out.println("Nome Pessoa:" + this.nome);
        System.out.println("Data de Nascimento:" + this.dataNascimento);
        System.out.println("Altura:" + this.altura);
    }
    public void imprimeDadosPessoa() {
        System.out.println("Os dados da pessoa é:");
        System.out.println("Nome:" + nome +" "+ "Data de Nascimento:" + dataNascimento +" "+ "Altura:" + altura);
    }
    public void calculaIdadePessoa(){
        System.out.println("A idade da pessoa é:" + (dataAtual - dataNascimento));
    }
}
