/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacourse.bruno.POO;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aluno { //classe aluno: 
    // TODOS OS ATRIBUTOS DEVEM SER PRIVADOS, POR CAUSA DO ENCAPSULAMENTO
    private String nome;
    private long ra = 0; // inteiro longo - 10 números
    private String curso;
    private double A1 = 0; 
    private double A2 = 0; 
    private double A3 = 0; 
    private double presenca = 0; 
    
    
    public Aluno(String nome, long RA, String curso){ // Método construtor
        // Método não tem static
        // detalhe: se eu usar RA não interfere, pois está dentro dos parênteses da função 
        // maiúsculo e minúsculo
        this.nome = nome;
        this.ra = RA;
        this.curso = curso;
        
    }
       
    public String getNome(){
    // Não tem o Static
    return  this.nome; 
    }

    
}
