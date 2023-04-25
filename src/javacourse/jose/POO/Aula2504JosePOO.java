package javacourse.jose.POO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula2504JosePOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o dia da semana");
    int dia = entrada.nextInt();

    Conversor conversor = new Conversor();

    System.out.println(conversor.getDiaSemana(dia));

    entrada.close();

    }

}

