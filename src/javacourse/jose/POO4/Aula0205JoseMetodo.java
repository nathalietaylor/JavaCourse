package javacourse.jose.POO4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula0205JoseMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // chamando construtor default
        Pessoa p1 = new Pessoa();
        // chamando novo construtor
        Pessoa p2 = new Pessoa("Fulano");

        System.out.println("Nome p1: " + p1.nome);
        System.out.println("Nome p2: " + p2.nome);


    }

}
