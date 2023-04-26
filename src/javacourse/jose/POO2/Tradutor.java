package javacourse.jose.POO2;
/*
Altere a classe Conversor - Agora chamada Tradutor
• Adicione um método chamado trocarIdioma().
• Seu método deve trocar o idioma da conversão para inglês.
 */
public class Tradutor {

    /*
     Usando uma solução com vetores:
     Antes o exemplo era passado com case 1; case 2 (...) para melhorar o código criamos um vetor com os nomes
     dos dias da semana e o retorno estará chamando a "posição" do vetor.
     */

    public String getDiadaSemana(int dia) {
        String[] dias = {"Domingo", "Segunda feira", "Terça feira", "Quarta feira", "Quinta feira", "Sexta feira", "Sábado"};
        return dias[dia - 1];
    }

    public String getDiadaSemanaEmIngles(String diaSemana) {

        switch (diaSemana) {
            case "Domingo":
                return "Sunday";
            case "Segunda feira":
                return "Monday";
            case "Terça feira":
                return "Tuesday";
            case "Quarta feira":
                return "Wednesday";
            case "Quinta feira":
                return "Thursday";
            case "Sexta feira":
                return "Friday";
            case "Sábado":
                return "Saturday";
            default:
                return "Enter a number ";
        }

    }
}