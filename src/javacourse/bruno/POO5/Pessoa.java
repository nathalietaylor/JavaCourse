package javacourse.bruno.POO5;

public class Pessoa {
    private String nome;
    private int CPF;
    private String nomeSocial;

    // Método construtor
    public Pessoa(){
        this.CPF = 9999;
        this.nome = "ze";
        this.nomeSocial = "ze";
    }

    public Pessoa(String nome){
        this.nome = nome;
        this.CPF = 9999;
        this.nomeSocial = nome;
    }

    public Pessoa(String nome, int CPF){
        this.nome = nome;
        this.CPF = validaCPF(CPF);
    }

    public Pessoa(String nome, String nomeSocial, int CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.nomeSocial = nomeSocial;
    }

    public int validaCPF(int CPF){
        return CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = this.validaCPF(CPF);
    }


    public void print(){
        System.out.println("nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("-----------------");

    }

    public String toString(){
        String txt = "";
        txt = txt + "nome: " + this.nome + "/n";
        txt = txt + "CPF: " + this.CPF;

        return txt;
    }

    public String titulo(){
        return "Pessoa";
    }


}
