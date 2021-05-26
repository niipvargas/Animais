package atividade2;

public class Gato extends Animal {
    
    public Gato(String nome, int Idade) {
        this.Nome = nome;
        this.Idade = Idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("Nome é: " + this.Nome);
        System.out.println("Esse animal mia e tem " + this.Idade + " anos");
    }
    
}
