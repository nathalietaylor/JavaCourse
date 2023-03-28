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
public class Aula2703BrunoDowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0; 
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Digite um numero: ");
        op = sc.nextInt();
        
        while(op < 0){
            System.out.println("Digite um numero: ");
            op = sc.nextInt();
        }
       */
        do{
            System.out.println("Digite um numero: ");
            op = sc.nextInt();
        } while (op < 0);
    }
    
}
