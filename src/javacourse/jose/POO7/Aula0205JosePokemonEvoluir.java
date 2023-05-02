package javacourse.jose.POO7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javacourse.jose.POO5.Pokemon;

import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula0205JosePokemonEvoluir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do pokemon: ");

        String nome = entrada.next();
        System.out.println("Digite o tipo do pokemon: ");

        String tipo = entrada.next();

        System.out.println("Digite o nome da evolução do pokemon: ");

        String novoNovo = entrada.next();

        System.out.println("Digite o tipo da evolução do pokemon: ");

        String novoTipo = entrada.next();

        entrada.close();

        PokemonEvoluir pokemon1 = new PokemonEvoluir(nome, tipo, nomeNovo, nomeTipo);


        pokemon1.evoluir(novoNome);
        pokemon1.evoluir(novoNovo, novoTipo);





    }

}
