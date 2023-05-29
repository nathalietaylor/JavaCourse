package javacourse.bruno.POO5;

public class AlunoHeranca extends Pessoa{
    // tudo que já tem lá em Pessoa já foi trazido para cá.

    private int RA;

    // Contrutor padrão

    public AlunoHeranca(){
        super(); // construtor sem nada lá da superclasse = Pessoa
        this.RA = 55555;
    }

    public AlunoHeranca (String nome, int RA){
        super(nome);
        this.RA = RA;
    }

    public AlunoHeranca (String nome, int CPF, int RA){
        super(nome, CPF);
        this.RA = 55555;
    }

    public AlunoHeranca(String nome, String sobrenome, int CPF, int RA){
        super(nome + " " + sobrenome);
        setCPF(CPF);
        this.RA = RA;

    }

    @Override // sobre escrita de métodos
    public void print(){ // polimorfismo se sobre escrita
        System.out.println("nome: " + super.getNome());
        System.out.println("RA: " + this.RA);
        System.out.println("----------------");
    }

    public void print(int op){
        switch (op){
            case 1:
                super.print();
                break;
            case 2:
                this.print();
                break;
            default:
                System.out.println("op inválida");
                break;
        }

    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
}

