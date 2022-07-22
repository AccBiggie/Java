//import java.util.Scanner;
public class Elevador {
    int capacidadeElevador;
    int quantidadeAndares;
    int quantidadePessoas = 0;
    int andarAtual = 0;

    public void Inicializa(int capacidadeElevador, int quantidadeAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.quantidadeAndares = quantidadeAndares;
    }    

    public void Entra(){
        if(quantidadePessoas < capacidadeElevador){
            quantidadePessoas++;
        }
    }

    public void Sai(){
        if(quantidadePessoas > 0)
            quantidadePessoas--;
    }

    public void Sobe(){
        if(andarAtual < quantidadeAndares)
            andarAtual++;
    } 

    public void Desce(){
        if(andarAtual > 0)
            andarAtual--;
    }
}

