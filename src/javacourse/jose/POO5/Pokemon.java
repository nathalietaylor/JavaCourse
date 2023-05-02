package javacourse.jose.POO5;

public class Pokemon {
    private String nome = "";

    private String tipo = "";

    public Pokemon(String nome, String tipo){
    this.nome = nome;
    this.tipo = tipo;

    }

    public void falar(){ // método sem retorno
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
    }

}
