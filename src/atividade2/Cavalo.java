package atividade2;

public class Cavalo extends Animal {
    
    public Cavalo(String nome, int Idade) {
        this.Nome = nome;
        this.Idade = Idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("Nome é: " + this.Nome);
        System.out.println("Esse animal relincha e tem " + this.Idade + " anos");
    }
    
}
