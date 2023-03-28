/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacourse;
import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula1303BrunoIf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 0;
        
        System.out.println("digite sua idade ");
        idade = entrada.nextInt();
        
        if(idade >= 18){
            System.out.println("Voce eh maior de idade");
        } else{
        System.out.println("Voce eh menor de idade");
    }
        
   }
    
}
