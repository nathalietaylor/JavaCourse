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
public class Aula2703BrunoVetores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[3];
        
        double notaFinal = 0; 
        double[] peso = {0.3, 0.3, 0.4};
        
        for(int i = 0; i < 3 ; i++){
            do{
                System.out.println("Digite a nota A" + (i + 1)+ ": ");
                notas[0] = ler.nextDouble();
                if((notas[i] < 0) || (notas[i]> 10)){
                    System.out.println("nota invalida");
                }
            } while ((notas[i] < 0) || (notas[i]> 10));
        }
        for(int i = 0; i < 3; i ++){
            notaFinal = notaFinal + notas[i]*peso[i];
        }
    }
    
}
