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
public class Aula2103JoseWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double notaFinal = 0;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        
        while(contador <= 10){
            System.out.println("Insira a sua nota A1 ");
            nota1 = entrada.nextDouble();
            System.out.println("Insira a sua nota A2 ");
            nota2 = entrada.nextDouble();
            System.out.println("Insira a sua nota A3 ");
            nota3 = entrada.nextDouble();
            
            notaFinal = ((nota1 * 0.3)+ (nota2 * 0.3) + (nota3 * 0.4));
            
            if(notaFinal < 7){
                System.out.println("Voce esta reprovado");
            } else{
                System.out.println("Voce esta aprovado");
            }
            contador++;

        }
        
    }
    
}
