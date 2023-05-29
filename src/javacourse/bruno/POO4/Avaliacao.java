package javacourse.bruno.POO4;
/*
Descrição de objetos e métodos: (Separação de responsabilidades - componentes)

Provas e Aluno

Avaliação:
- A1
- A2
- A3
Métodos:
- Cadastrar a notas
- Verificação das notas
- Cálculo da média

Aluno:
- Nome
- RA
- Média
- Provas
Métodos:
- Avaliação

 */

import javax.print.DocFlavor;
import javax.swing.text.StyledEditorKit;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author katerinelindawitkoski
 */
public class Avaliacao {
 /*   private double[] notas;

    //Construtor Avaliação - contruir o objeto, criar uma instância dessa classe ou um objeto
    // a partir dessa classe.
    // Visibilidade, o mome e tipo do argumento nos parâmetros
    public Avaliacao(){
        // vetor precisa ser inicializado
        this.notas = new double[3];
    }

    // Polimorfismo: Aluno que já tem nota
    public Avaliacao(double A1, double A2, double A3){
        this.notas = new double[3];
        this.notas[0] = A1;
        this.notas[1] = A2;
        this.notas[2] = A3;
    }

    // Polimorfismo: Passando como vetor:
    public Avaliacao(double[] notas){
        this.notas = notas;
    }

    // Para incluir apenas uma nota:
    // O "av" indicaria a posição do vetor (0 = a1, 1 = a2, 2 = a3)
    public Avaliacao(double nota, int av){
        this.notas = new double[3];
        this.notas[av] = nota;
    }

  *//*  public boolean setNota(double nota, int av){
        if(this.testaAvaliacao(av) && this.testaNota(nota)){
            this.notas[av-1] = notas;
            return true;
        } else {
            return false;
        }
    }*//*

    public boolean testaAvaliacao(int av){
        if((av > 1) && (av <= 3)){
            return true;
        } else {
            return false;
        }
    }

    public boolean testaNota(double nota){
        if ((nota < 0) || (nota > 10)){
            return false;
        } else {
            return true;
        }
    }

    public boolean setNota(double A1, double A2, double A3){
        if (this.testaNota(A1) &&
                this.testaNota(A2) &&
                this.testaNota(A3)
        ) {
            this.notas[0] = A1;
            this.notas[1] = A2;
            this.notas[2] = A3;

            return true;
        } else {
            return false;
        }
    }

    public double getNota(int av){
        if (this.testaAvaliacao(av)){
            return this.notas[av -1];
        } else {
            return -1; // informar um erro
        }
    }

    public String toString(){
        String txt = "";
        txt = this.notas[0] + " " +
                this.notas[1] + " " +
                this.notas[2] + " ";

        return txt;
    }*/
}
