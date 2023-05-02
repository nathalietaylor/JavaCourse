package javacourse.jose.POO7;

public class PokemonEvoluir {

    private String nome = "";

    private String tipo = "";

    private String novoNome = "";
    private String novoTipo = "";

    public Pokemon(String nome, String tipo, String novoNome, String novoTipo){
        this.nome = nome;
        this.tipo = tipo;
        this.novoNome = novoNome;
        this.novoTipo = novoTipo;

    }

    public void evoluir(String novoNome){
        System.out.println("Nomes: " this.nome + this.novoNome);
    }
    public void evoluir(String novoNome, String novoTipo){

        System.out.println("Nomes: " this.nome + this.novoNome);
        System.out.println("Tipos:" + this.tipo + this.novoTipo);
    }

}
