package javacourse.jose.POO;
/*
Faça uma Classe chamada Conversor
Sua classe deve ter um método que receve um número de 1-7..
e retorne uma String contendo o dia da semana correspondente
*/
public class Conversor {

    public String getDiaSemana(int dia){ // pega quem? o dia da semana (dia da semana é tipo int)
        // é public pq não precisa do encapsulamento
        switch(dia){
            case 1:
                return "Domingo";
            case 2:
                return "Segunda feira";
            case 3:
                return "Terça feira";
            case 4:
                return "Quarta feira";
            case 5:
                return "Quinta feira";
            case 6:
                return "Sexta feira";
            case 7:
                return "Sábado";
            default:
                return "Digite um número de 1-7";
        }
    }


}
