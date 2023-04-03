/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacourse.jose;
import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula2803JoseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arrays 
        double[] notas = new double[10];
        
        Scanner entrada = new Scanner(System.in);
        
        //comprimento do vetor
        int tamanho = notas.length;
        
        //loop para leitura das 10 notas
        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite a nota" + (i + 1));
            notas[i] = entrada.nextDouble();
        }
        
        //loop para imprimir as 10 notas 
        
        for (int i = 0; i < tamanho; i++){
            System.out.println("nota: " + (i + 1) + "=" + notas[i]);
        }
        
        entrada.close();
    }
    
}
