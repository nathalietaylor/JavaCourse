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
public class Aula2103JoseDowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double nota;
        do{
            System.out.println("**** Digite uma nota ****");
            nota = entrada.nextDouble();
            
            if((nota < 0) || (nota > 10)){
            System.out.println("A nota deve estar entre 0 a 10");
            System.out.println("Digite a nota novamente");
            }
        } while(nota < 0 || nota >10);
        
        entrada.close();
    }
    
}
