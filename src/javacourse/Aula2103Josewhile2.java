/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacourse;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula2103JoseWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PARES
        int contador; // declaração do contador
        contador = 1; 
        int resto;
        
        while(contador <= 10){
            resto = contador % 2;
            
            if(resto ==0){
                System.out.println("O numero" + contador + "eh par");
            }
        }contador++;
    }
    
}
