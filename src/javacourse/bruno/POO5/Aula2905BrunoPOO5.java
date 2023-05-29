package javacourse.bruno.POO5;

public class Aula2905BrunoPOO5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AlunoHeranca henrique = new AlunoHeranca("Henrique", 12345);
        henrique.print(2);
        henrique.setNome("H");

        AlunoHeranca julia = new AlunoHeranca("Ana", "Julia", 23456, 12345);

        julia.print();
        julia.print(1);
        julia.print(2);

    }
}
