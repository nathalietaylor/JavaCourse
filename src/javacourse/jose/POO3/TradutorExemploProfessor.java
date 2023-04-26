package javacourse.jose.POO3;

/* EXEMPLO DO PROFESSOR!!!!!
Altere a classe Conversor - Agora chamada Tradutor
• Adicione um método chamado trocarIdioma().
• Seu método deve trocar o idioma da conversão para inglês.
 */
public class TradutorExemploProfessor {
    boolean ativarIngles;

    public TradutorExemploProfessor() {
        this.ativarIngles = false;
    }

    public void trocarIdioma(){
        this.ativarIngles = true;
    }

    public String getDiaSemana(int dia) {
        switch (dia){
            case 1:
                return ativarIngles ? "Sunday" : "Domingo";
            case 2:
                return ativarIngles ? "Monday" : "Segunda feira";
            case 3:
                return ativarIngles ? "Tuesday" : "Terça feira";
            case 4:
                return ativarIngles ? "Wednesday" : "Quarta feira";
            case 5:
                return ativarIngles ? "Thursday" : "Quinta feira";
            case 6:
                return ativarIngles ? "Friday" : "Sexta feira";
            case 7:
                return ativarIngles ? "Saturday" : "Sábado";
            default:
                return "Dia da semana inválido";

        }
    }

}