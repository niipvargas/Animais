package atividade2;

public class Cachorro extends Animal {

    public Cachorro(String nome, int Idade) {
        this.Nome = nome;
        this.Idade = Idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("Nome é: " + this.Nome);
        System.out.println("Esse animal late e tem " + this.Idade + " anos");
    }
    
}
