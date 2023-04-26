package javacourse.jose.POO2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 * @author katerinelindawitkoski
 */
public class Aula2504JosePOO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana");
        int dia = entrada.nextInt();

        // Vamos testar se o usuário digitar algum número fora do periodo determinado

        while (dia <= 0 || dia >= 8) {
            System.out.println("Digite um número de 1-7");
            System.out.println("Digite o dia da semana");
            dia = entrada.nextInt();
        }

        entrada.close();

        Tradutor tradutor = new Tradutor();

        String diaStr = tradutor.getDiadaSemana(dia);

        String diaEmInglesStr = tradutor.getDiadaSemanaEmIngles(diaStr);

        System.out.printf(diaStr + " Tradução: " + diaEmInglesStr);


    }

}

