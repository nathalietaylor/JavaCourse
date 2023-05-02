package javacourse.jose.POO5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javacourse.jose.POO3.TradutorExemploProfessor;

import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula0205JosePokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do pokemon: ");

        String nome = entrada.next();
        System.out.println("Digite o tipo do pokemon: ");

        String tipo = entrada.next();

        entrada.close();

        Pokemon pokemon1 = new Pokemon(nome, tipo);

        pokemon1.falar();

    }

}
