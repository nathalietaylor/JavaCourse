/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacourse.bruno;
import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula1303BrunoIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        
        System.out.println("digite sua nota ");
        nota = entrada.nextDouble();
        
        if(nota > 7){
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        } else{
        System.out.println("Reprovado");
    }
        
        // testa se reprovado 
        // testa se DP 
        /*
        if(nota >= 6){
            System.out.println("aprovado");
        }
        if(nota < 5){
            System.out.println("reprovado");
        }
        if((nota >= 5) && (nota <6)){
            System.out.println("DP");
        }
        */
        
   }
    
}
