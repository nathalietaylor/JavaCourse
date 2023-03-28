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
public class aula2803JoseArrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double A1 = 0; 
        double A2 = 0; 
        double A3 = 0; 
        double mediaFinal = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a nota A1: ");
        A1 = entrada.nextDouble();
        System.out.println("Digite a nota A2: ");
        A2 = entrada.nextDouble();        
        System.out.println("Digite a nota A3: ");
        A3 = entrada.nextDouble();       
        
        mediaFinal = ((0.3 * A1) + (0.3 * A2) + (0.4 * A3));
        
        System.out.println("A nota final vale: " + mediaFinal);
    }
    
}
