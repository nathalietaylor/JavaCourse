package javacourse.jose.POO3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javacourse.jose.POO.Conversor;

import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */
public class Aula2504JosePOO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana");

        int dia = entrada.nextInt();

        TradutorExemploProfessor conversor = new TradutorExemploProfessor();

        System.out.println(conversor.getDiaSemana(dia));

        System.out.println("Habilitando inglês");
        conversor.trocarIdioma();

        System.out.println(conversor.getDiaSemana(dia));

        entrada.close();


    }

}

