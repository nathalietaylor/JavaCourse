/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacourse.bruno.POO3;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aluno { // conceito

    private int RA = 0;

    private String nome = "";

    private String turma = "";

    private double[] notas;

    private int numAtividades = 0;

    // criar um aluno que tenha um perfil de avaliação
    // Primeiro construtor:
    public Aluno(int RA, String nome, String turma){
        // this.RA = RA; //set RA
        setRA(RA);
        setNome(nome);
        setTurma(turma);

        this.numAtividades = 3;
        notas = new double[numAtividades]; // substitui o setnumAtividades

    }
    // Segundo construtor:
    public Aluno(int RA, String nome, String turma, int numAtividades){
        setNome(nome);
        setRA(RA);
        setTurma(turma);
        this.numAtividades = numAtividades; // não preciso dizer quantas atividades
        notas = new double[numAtividades];
    }

    // Terceiro construtor:
    public Aluno(int RA, String nome, String turma, double[] notas){
        // this.RA = RA; //set RA
        setRA(RA);
        setNome(nome);
        setTurma(turma);

        this.numAtividades = 3;
        // this.notas = new double[numAtividades];

        this.notas = notas;

    }



    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getNumAtividades() {
        return numAtividades;
    }

    public void imprime(){
        System.out.println("RA" + RA);
        System.out.println("Nome" + nome);
        System.out.println("turma" + turma);

        for(int i = 0; i < this.numAtividades; i++){
            System.out.println("Atividade" + (i + 1) + ": " + this.notas[i]);
        }
        System.out.println("--------------------------------");
    }


}
