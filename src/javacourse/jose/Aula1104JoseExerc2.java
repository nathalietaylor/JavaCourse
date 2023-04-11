package javacourse.jose;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula1104JoseExerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char[] gabarito = new char[5];
        char[] resposta = new char[5];
        int resultado = 0;

        System.out.println("Digite o gabarito: ");

        for (int i = 0; i < 5; i++) {

            gabarito[i] = entrada.nextLine().charAt(0);
        }
        
        System.out.println("Digite a sua resposta");
    
        for (int i = 0; i <5; i ++){

            resposta[i] = entrada.nextLine().charAt(0);
        }
        
        for(int i = 0; i < 5; i ++){    
            if(resposta[i]  == gabarito[i]){
               resultado = resultado + 2;
            }

    }
       System.out.println("Sua nota é: " + resultado);

    }

}
