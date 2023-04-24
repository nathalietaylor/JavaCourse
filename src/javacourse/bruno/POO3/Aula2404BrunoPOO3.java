package javacourse.bruno.POO3;

public class Aula2404BrunoPOO3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluno Katerine = new Aluno(123456, "Katerine", "CC");

        double[] temp = {6,7,0};

        Aluno Vini = new Aluno(67890, "Vinicius", "CC", temp);

        Aluno Bruno = new Aluno(2345, "Bruno", "CC", 5);

        Katerine.imprime();
        Vini.imprime();
        Bruno.imprime();


    }
    



}
